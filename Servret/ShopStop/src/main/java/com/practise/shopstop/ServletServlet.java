package com.practise.shopstop;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletServlet.java")
public class ServletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<title>Http Request Method</title>");
		pw.println("<body bgcolor =\"Yellow-Green\">");
		pw.println("<h1>Request Method </h1>");
		pw.println("<b>Remote Host    :</b>" + request.getRemoteHost());
		pw.println("<hr>");
    	pw.println("<b>Remote Post    :</b>" + request.getRemotePort());
		pw.println("<hr>");
		pw.println("<b>Requested URL  :</b>" + request.getRequestURI());
		pw.println("<hr>");
		pw.println("<b>Server Name    :</b>" + request.getServerName());
		pw.println("<hr>");
		pw.println("<b>Server Port    :</b>" + request.getServerPort());
		pw.println("<hr>");
		LocalTime tt = LocalTime.now();
		pw.println("<h2>Page Refresh at : "+tt+"</h2>");
		pw.println("<h2>Page Served At: </h2> ::<time datetime=\"2024-06-01\"></time>");

		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
