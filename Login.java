package com.wipor.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Resultset;
import com.wipor.Dao.CustDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		doGet(request, response);
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        String name=request.getParameter("emailId");  
        String userType=request.getParameter("user");  
        String password=request.getParameter("password");
        
        
        if(userType.equals("Admin")) {
        	
        	try {
        		Connection con=CustDao.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select adminemailId,adminpassword from srs_admin where adminemailId = '"+name+"' and adminpassword = '"+password+"' ");
				
				if(rs.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("name", name);
					response.sendRedirect("AdminMenu.jsp"); 
					}
				else {
					out.print("Wrong user emailId or password");
					response.sendRedirect("Login.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else if(userType.equals("User")) {
        	
        	try {
        		Connection con=CustDao.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select emailId,password from assignmentdb.srs_tbl_user_profile1 where emailId = '"+name+"' and password = '"+password+"' ");
				
				if(rs.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("name", name);
					response.sendRedirect("CustomerMenu.jsp");  
					}
				else {
					out.print("Wrong user emailId or password");
					response.sendRedirect("Login.jsp" );
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         
        }
      else
          	out.print("PLEASE SELECT USER OR ADMIN ");
        
	}

}
