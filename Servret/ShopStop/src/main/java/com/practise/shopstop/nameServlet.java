package com.practise.shopstop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nameServlet")
public class nameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public nameServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");//setting content type
        PrintWriter out = response.getWriter();
        String fn = request.getParameter("firstname");
        String ln = request.getParameter("lastname");
        out.println("<html>");
        out.println("<body bgcolor = aqua>");
        out.println("<h1>ThankYou for registration</h1>");
        out.println("<br>Your FirstName is :"+fn);
        out.println("<br>Your LastName is  :"+ln);
        out.println("<br>");
        out.println("<a href=\"name.html\">Click for Previous Page</a> ");
        out.println("</body>");
        out.println("</html>");
        

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
