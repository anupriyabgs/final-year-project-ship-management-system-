package com.wipor.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipor.Dao.CustDao;
import com.wipor.Dao.RouteDao;
import com.wipor.Dao.ShipDao;
import com.wipor.bean.ProfileBean;
import com.wipor.bean.RouteBean;
import com.wipor.bean.ShipBean;

public class Addroute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sname=request.getParameter("Starting Location"); 
        String sid=request.getParameter("Destination"); 
        String seating=request.getParameter("Travel Duration"); 
        String re=request.getParameter("Fair"); 
        int scap = Integer.parseInt(seating);
        int resr = Integer.parseInt(re);
        RouteBean rb = new RouteBean();

       int status=RouteDao.save(rb);  
      
        if(status>0){  
            out.print("<p>Route added successfully!</p>");  
           out.println("<a href='AdminMenu.jsp'>Admin Home</a>"); 
         request.getRequestDispatcher("RouteAdd.jsp").include(request, response);  
       }else{  
          out.println("Sorry! unable to add Route");  
       }  
          
        out.close();  
	}

}
        