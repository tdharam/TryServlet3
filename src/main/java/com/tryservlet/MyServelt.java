package com.tryservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/hello"},initParams = { 
        @WebInitParam(name = "user", value = "Pankaj"), 
        @WebInitParam(name = "password", value = "journaldev")
})
public class MyServelt extends HttpServlet{
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      System.out.println("inside doGet");
	      getServletConfig().getInitParameter("user");
	      getServletConfig().getInitParameter("password");
 	      RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
 	      rd.forward(request, response);  
	 }
	  
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	System.out.println("inside doPost");
	    }

}
