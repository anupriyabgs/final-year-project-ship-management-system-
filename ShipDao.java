package com.wipor.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wipor.bean.ProfileBean;
import com.wipor.bean.ShipBean;

public class ShipDao {
	
	ShipBean sb=null;
	 public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("com.mysql.cj.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb","root","MYSQL");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	    public static int save(ShipBean sb){  
	        int status=0;  
	        try{  
	            Connection con=ShipDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("insert into srs_tbl_ship(ShipName,ShipId,SeatingCapacity,ReservationCapacity)"
	            		+ "values (?,?,?,?)");  
	            ps.setString(1,sb.getShipName()); 
	            ps.setInt(2,sb.getShipID()); 
	            ps.setInt(3,sb.getSeatingCapacity());
	            ps.setInt(4,sb.getReservationCapacity());  
	          
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static int delete(int id){  
	        int status=0;  
	        try{  
	            Connection con=CustDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from srs_tbl_ship where shipId=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static ShipBean getShipById(int id){  
    	ShipBean e=new ShipBean();  
          
        try{  
            Connection con=CustDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from srs_tbl_ship where shipID=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setShipID(rs.getInt(1));  
                e.setShipName(rs.getString(2));  
                e.setSeatingCapacity(rs.getInt(3));  
                e.setReservationCapacity(rs.getInt(4));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
	 }
	    public static int update(ShipBean e){  
	        int status=0;  
	        try{  
	            Connection con=ShipDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update srs_tbl_ship set ShipName=?,SeatingCapacity=?,ReservationCapacity= ? where shipId=?;");
	           
	            ps.setString(1,e.getShipName()); 
	            ps.setInt(2,e.getShipID()); 
	            ps.setInt(3,e.getSeatingCapacity());  
	            ps.setInt(4,e.getReservationCapacity());  
	            
	              
	            status=ps.executeUpdate();
	            //status = status ++;
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
}
