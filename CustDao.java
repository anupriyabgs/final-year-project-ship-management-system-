package com.wipor.Dao;

import java.util.*;


import com.wipor.bean.ProfileBean;

import java.sql.*;  
  
public class CustDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb","root","MYSQL");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(ProfileBean profileBean){  
        int status=0;  
        try{  
            Connection con=CustDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into assignmentdb.srs_tbl_user_profile1(firstname,lastname,DateOfBIrth,gender,street,location,city,state,pincode,mobileNo,emailId,password) "
            		+ "values (?,?,?,?,?,?,?,?,?,?,?,?)");  
            ps.setString(1,profileBean.getFirstName());  
            ps.setString(2,profileBean.getLastName());
            ps.setString(3,profileBean.getDateOfBirth());  
            ps.setString(4,profileBean.getGender());  
            ps.setString(5,profileBean.getStreet());
            ps.setString(6,profileBean.getLocation());
            ps.setString(7,profileBean.getCity());
            ps.setString(8,profileBean.getState());
            ps.setString(9,profileBean.getPincode());
            ps.setString(10,profileBean.getMobileNo());
            ps.setString(11,profileBean.getEmailID());
            ps.setString(12,profileBean.getPassword());
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
//    public static int update(Customer e){  
//        int status=0;  
//        try{  
//            Connection con=CustDao.getConnection();  
//            PreparedStatement ps=con.prepareStatement(  
//                         "update user905 set name=?,password=?,email=?,country=? where id=?");  
//            ps.setString(1,e.getName());  
//            ps.setString(2,e.getPassword());  
//            ps.setString(3,e.getEmail());  
//            ps.setString(5,e.getName());  
//              
//            status=ps.executeUpdate();  
//              
//            con.close();  
//        }catch(Exception ex){ex.printStackTrace();}  
//          
//        return status;  
//    }  
//    public static int delete(int id){  
//        int status=0;  
//        try{  
//            Connection con=CustDao.getConnection();  
//            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
//            ps.setInt(1,id);  
//            status=ps.executeUpdate();  
//              
//            con.close();  
//        }catch(Exception e){e.printStackTrace();}  
//          
//        return status;  
//    }  
//    public static Customer getEmployeeById(int id){  
//    	Customer e=new Customer();  
//          
//        try{  
//            Connection con=CustDao.getConnection();  
//            PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
//            ps.setInt(1,id);  
//            ResultSet rs=ps.executeQuery();  
//            if(rs.next()){  
//             //   e.setId(rs.getInt(1));  
//                e.setName(rs.getString(2));  
//                e.setPassword(rs.getString(3));  
//                e.setEmail(rs.getString(4));  
//            //    e.setCountry(rs.getString(5));  
//            }  
//            con.close();  
//        }catch(Exception ex){ex.printStackTrace();}  
//          
//        return e;  
//    }  
//    public static List<Customer> getAllEmployees(){  
//        List<Customer> list=new ArrayList<Customer>();  
//          
//        try{  
//            Connection con=CustDao.getConnection();  
//            PreparedStatement ps=con.prepareStatement("select * from user905");  
//            ResultSet rs=ps.executeQuery();  
//            while(rs.next()){  
//            	Customer e=new Customer();  
//         //       e.setId(rs.getInt(1));  
//                e.setName(rs.getString(2));  
//                e.setPassword(rs.getString(3));  
//                e.setEmail(rs.getString(4));  
//                
//                list.add(e);  
//            }  
//            con.close();  
//        }catch(Exception e){e.printStackTrace();}  
//          
//        return list;  
//    }  
}  