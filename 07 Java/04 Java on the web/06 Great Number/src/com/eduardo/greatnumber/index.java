package com.eduardo.greatnumber;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Integer numero = (Integer) session.getAttribute("numero");
		Integer achunte = Integer.parseInt(request.getParameter("achunte"));
		Random ale = new Random();
		
		if(session.getAttribute("numero") == null) {
			session.setAttribute("numero", ale.nextInt(100));
		}
		if(numero == achunte) {
			session.setAttribute("numero", ale.nextInt(100));
			session.setAttribute("respuesta", "correcto");
		}
		else if(achunte > numero) {
			session.setAttribute("respuesta", "alto");	
		}
		else {
			session.setAttribute("respuesta", "bajo");		
		}
		response.sendRedirect("index");
	}

}
