package com.wipor.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipor.Dao.ShipDao;

/**
 * Servlet implementation class DeleteShip
 */
@WebServlet("/DeleteShip")
public class DeleteShip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteShip() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
		int id =Integer.parseInt(request.getParameter("ShipId"));
		
		int status=ShipDao.delete(id);
		if(status>0){  
            out.print("<p>Ship deleted successfully!</p>");  
            request.getRequestDispatcher("AdminMenu.jsp");
        }else{  
            out.println("Sorry! unable to delete ship");  
        }  
          
        out.close();  
	}

}
