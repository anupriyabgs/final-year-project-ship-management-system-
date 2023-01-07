package com.wipor.servlets;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.wipor.Dao.ShipDao;
import com.wipor.bean.ShipBean;  
@WebServlet("/UpdateShip")  
public class UpdateShip extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String name=request.getParameter("name");  
        String capp=request.getParameter("cap");  
        int cap=Integer.parseInt(capp);  
        String ress=request.getParameter("res");  
        int res=Integer.parseInt(ress);  
          
        ShipBean e=new ShipBean();  
        e.setShipID(id);  
        e.setShipName(name);  
        e.setSeatingCapacity(cap);  
        e.setReservationCapacity(res);  
        
          
        int status=ShipDao.update(e);  
        if(status>0){  
            response.sendRedirect("AdminMenu.jsp");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  