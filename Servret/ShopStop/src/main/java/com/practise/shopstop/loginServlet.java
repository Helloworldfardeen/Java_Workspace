package com.practise.shopstop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
	      String username = request.getParameter("username");
	      String password = request.getParameter("password");
	      request.setAttribute("Organization","CDAC");
	      if(password.equals("706070"))
	      {
	    	RequestDispatcher rd = request.getRequestDispatcher("/DisplayServlet");
	    	rd.forward(request, response);
	      }
	      else
	      {
	    	  out.println("<h3><font color = 'red'>Incorrect Password</font></h3> ");
	    	  RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
	    	  rd.include(request, response);
	      }
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
