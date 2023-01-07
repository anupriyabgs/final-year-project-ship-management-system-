package com.wipor.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipor.Dao.CustDao;
import com.wipor.bean.ProfileBean;

/**
 * Servlet implementation class Register
 */
@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String fname=request.getParameter("fname");  
        String lname=request.getParameter("lname"); 
        String dob=request.getParameter("dob"); 
        String gender=request.getParameter("gender"); 
        String street=request.getParameter("street");  
        String location=request.getParameter("location");  
        String city=request.getParameter("city");  
        String state=request.getParameter("state");  
        String pincode=request.getParameter("pincode");  
        String phone=request.getParameter("phone"); 
        String email=request.getParameter("email"); 
        String password=request.getParameter("pwd");
          
      ProfileBean ProfileBean = new ProfileBean(fname,lname,dob,gender,street,location,city,state,pincode,phone,email,password);
           
          
        int status=CustDao.save(ProfileBean);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            out.print("<p>Login for further use..!!</p>");
            request.getRequestDispatcher("Login.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
	}

}
