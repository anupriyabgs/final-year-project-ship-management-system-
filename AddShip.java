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
import com.wipor.Dao.ShipDao;
import com.wipor.bean.ProfileBean;
import com.wipor.bean.ShipBean;

/**
 * Servlet implementation class AddShip
 */
@WebServlet("/AddShip")
public class AddShip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sname=request.getParameter("ShipName"); 
        String sid=request.getParameter("ShipID"); 
        String seating=request.getParameter("SeatingCapacity"); 
        String re=request.getParameter("ReserCapacity"); 
        int scap = Integer.parseInt(seating);
        int resr = Integer.parseInt(re);
        ShipBean sb = new ShipBean(sname,scap,resr);
        
        int status=ShipDao.save(sb);  
       
        if(status>-2){  
            out.print("<p>Ship added successfully!</p>");  
            out.println("<a href='AdminMenu.jsp'>Admin Home</a>"); 
           request.getRequestDispatcher("ShipAdd.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to add ship");  
        }  
          
        out.close();  
	}

}
