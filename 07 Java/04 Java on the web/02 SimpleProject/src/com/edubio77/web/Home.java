package com.edubio77.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String language = request.getParameter("language");
		String homeTown = request.getParameter("homeTown");
		
		if(firstName == null) {
	    	firstName = "Unknown";
	    }
	    if(lastName == null) {
	    	lastName = "Unknown";
	    }
	    if(language == null) {
	    	language = "Unknown";
	    }
	    if(homeTown == null) {
	    	homeTown = "Unknown";
	    }
	    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + firstName+ " " + lastName + "</h1>");
        out.write("<h2>Your favorite language is: " + language+ "</h2>");
        out.write("<h2>Your hometown is: " + homeTown + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
