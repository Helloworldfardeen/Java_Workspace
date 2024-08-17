package com.practise.shopstop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShopStop")
public class ShopStop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShopStop() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String item = request.getParameter("items");
		String cmt = request.getParameter("comment");
		String s = request.getParameter("survey");
		out.println("<title>Survey Result </title>");
		out.println("<body bgcolor=\"#1E90FF\" align=\"center\">");
		out.println("<h1>" + s + " </h1>");
		out.println("<br>");
		out.println("<p> Congratulation You Won!!!</p>");
		out.println("<i>Your Comment </i> :: " + cmt);
		out.println("<br>");
		out.println("<i><u>Number Of Items You Purchase</u></i> :: " + item);
		out.println("<br>");
		out.println("<a href = \"Survey.html\"> GO BACK </a>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
