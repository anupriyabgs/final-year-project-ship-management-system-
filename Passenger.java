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
 * Servlet implementation class Passenger
 */
@WebServlet("/Passenger")
public class Passenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Passenger() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<html>");  
        out.println("<body stylr=\"background-image:url(\"cust-home.jpg\")\">");  
        out.println("<div class=\"dropdown\">\r\n"
        		+ "	<button class=\"dropbtn\"><a class=\".dropdown-content-l\" href=\"AdminMenu.jsp\">Go Back</a></button>				\r\n"
        		+ "</div>"); 
        out.println("<h1>View Passenger/</h1>");  
        ///////////
          
          
        out.print("<table border='1' width='100%' >");  
        out.print("<tr><th>reservationID</th><th>scheduleID</th><th>Name</th><th>Gender</th></tr>");  
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb","root","MYSQL");
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery("SELECT * FROM assignmentdb.srs_tbl_user_passenger;");
        	while(rs.next()) {
        		out.println("<tr><td>"); 
        		out.println(rs.getString(1)); 
        		out.println("</td>");
        		out.println("<td>"); 
        		out.println(rs.getString(2)); 
        		out.println("</td>");
        		out.println("<td>"); 
        		out.println(rs.getString(3)); 
        		out.println("</td>");
        		out.println("<td>"); 
        		out.println(rs.getString(4)); 
        		out.println("</td>");

        		out.println("</tr>");
        		
        		}
        	}
        catch(Exception ex)
        {ex.printStackTrace();}  
        	
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");  
         
   
        
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
