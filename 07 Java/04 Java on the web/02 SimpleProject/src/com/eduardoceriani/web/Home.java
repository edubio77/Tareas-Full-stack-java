package com.eduardoceriani.web;

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
		 String userName = request.getParameter("Nombre");
		 String languageName = request.getParameter("Lenguaje");
		 String cityName = request.getParameter("Ciudad");
		 
		 if(userName == null) {
			 	userName = "Unknown";
		    }
		 if(languageName == null) {
		    	languageName = "Unknown";
		    }
		 if(cityName == null) {
			 	cityName = "Unknown";
		    }  
		 
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     out.write("<h1>Bienvenido, "+ userName + "</h1>");
	     out.write("<h2>Tu lenguaje favorito es "+ languageName + "</h2>");
	     out.write("<h2>Tu ciudad natal es "+ cityName + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
