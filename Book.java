package com.wipor.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Book
 */
@WebServlet("/Book")
public class Book extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='CustomerMenu.jsp'>User Home</a>");  
        out.println("<h1>Book Ship</h1>");  
          
       //   int passenger=Integer.parseInt(request.getParameter("pass"));
          out.print("<table border='1' width='100%'>");  
          out.print("<tr><th>ReservationId</th><th>ScheduleId</th><th>userID</th><th>Bookingdate</th><th>Journeydate</th><th>Noofseats/th><th>Totalfare</th><th>Bookingstatus</th></tr>");  
          try {
          	Class.forName("com.mysql.cj.jdbc.Driver");
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb","root","MYSQL");
          	Statement st = con.createStatement();
          	ResultSet rs = st.executeQuery("SELECT * FROM assignmentdb.  srs_tbl__reservation;");
          	if(rs.next()) {
          		out.println("<tr><td>"); 
          		out.println(rs.getInt(1)); 
          		out.println("</td>");
          		out.println("<td>"); 
          		out.println(rs.getInt(2)); 
          		out.println("</td>");
          		out.println("<td>"); 
          		out.println(rs.getString(3)); 
          		out.println("</td>");
          		out.println("<td>"); 
          		out.println(rs.getString(4)); 
          		out.println("</td>");
          		out.println("<td>"); 
          		out.println(rs.getString(5)); 
          		out.println("</td>");
          		out.println("<td>"); 
          		out.println(rs.getString(6)); 
          		out.println("</td>");
          		out.println("<td>"); 
          		out.println(rs.getDouble(7)); 
          		out.println("</td>");
          		out.println("<td>"); 
          		out.println(rs.getString(8)); 
          		out.println("</td>");
          		out.println("<td>");
          		out.println("<div class=\"dropdown\">\r\n"
          				+ "				<button class=\"dropbtn\"><a href=\"Payment.jsp\">Pay</a></button>\r\n"
          				+ "				\r\n"
          				+ "			</div>"); 
          		out.println("</td>");
          		out.println("</tr>");
          		
          		}
          	}
          catch(Exception ex)
          {ex.printStackTrace();}  
          	
          out.println("</table>");
          out.close(); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
