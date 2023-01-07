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
@WebServlet("/ModfiyShip")  
public class ModifyShip extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Ship</h1>");  
        String sid=request.getParameter("ShipId");  
        int id=Integer.parseInt(sid);  
          
        ShipBean e=ShipDao.getShipById(id);  
          
        out.print("<form action='UpdateShip' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td>ShipId:</td><td><input type='text' name='id' value='"+e.getShipID()+"'/></td></tr>");  
        out.print("<tr><td>ShipName:</td><td><input type='text' name='name' value='"+e.getShipName()+"'/></td></tr>");
        out.print("<tr><td>Seating Capacity:</td><td><input type='text' name='cap' value='"+e.getSeatingCapacity()+"'/></td></tr>");  
        out.print("<tr><td>Reservation:</td><td><input type='text' name='res' value='"+e.getReservationCapacity()+"'/>  </td></tr>");  
     
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}  