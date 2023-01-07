package com.wipor.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wipor.bean.ProfileBean;
import com.wipor.bean.RouteBean;

public class RouteDao {
	
	RouteBean rb=null;
	 public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("com.mysql.cj.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb","root","MYSQL");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	    public static int save(RouteBean rb){  
	        int status=0;  
	        try{  
	            Connection con=RouteDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("insert into srs_tbl_routedao(source,destination,travelDuration,fare)"
	            		+ "values (?,?,?,?)");  
	            ps.setString(1,rb.getSource()); 
	            ps.setString(2,rb.getDestination()); 
	            ps.setString(3,rb.getTravelDuration());
	            ps.setDouble(4,rb.getFare());  
	          
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
//	    public static int delete(int id){  
//	        int status=0;  
//	        try{  
//	            Connection con=RouteDao.getConnection();  
//	            PreparedStatement ps=con.prepareStatement("delete from srs_tbl_routedao where shipId=?");  
//	            ps.setInt(1,id);  
//	            status=ps.executeUpdate();  
//	              
//	            con.close();  
//	        }catch(Exception e){e.printStackTrace();}  
//	          
//	        return status;  
//	    }  
//	    public static RouteBean getShipById(int id){  
//    	RouteBean e=new RouteBean();  
//          
//        try{  
//            Connection con=RouteDao.getConnection();  
//            PreparedStatement ps=con.prepareStatement("select * from srs_tbl_routedao where shipID=?");  
//            ps.setInt(1,id);  
//            ResultSet rs=ps.executeQuery();  
//            if(rs.next()){  
//                e.setSource(rs.getString(1));  
//                e.setDestination(rs.getString(2));  
//                e.setTravelDuration(rs.getString(3));  
//                e.setFare(rs.getDouble(4));  
//            }  
//            con.close();  
//        }catch(Exception ex){ex.printStackTrace();}  
//          
//        return e;  
//	 }
	   
}
