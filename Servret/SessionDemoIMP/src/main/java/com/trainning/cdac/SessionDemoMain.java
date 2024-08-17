package com.trainning.cdac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Servlet implementation class SessionDemoMain
 */
@WebServlet("/SessionDemoMain")
public class SessionDemoMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionDemoMain() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// creating the seesion object...
		HttpSession session = request.getSession(true);
		String title = "Searching the Web";
		String heading;
		Integer accessCount = Integer.valueOf(0);
		if (session.isNew()) {
			heading = "Welcome New User";
		} else {
			heading = "Welcome Back";
			Integer oldAccessCount = (Integer) session.getAttribute("accessCount");
			if (accessCount != null) {
				// imp line of code....
				accessCount = Integer.valueOf(oldAccessCount.intValue() + 1);
			}
		}
		session.setAttribute("accessCount", accessCount);
		out.println("SessionId :" + session.getId() + "<br>");
		out.println("<PRE>No Of Access Count  -->" + accessCount+"<BR></PRE>");
		out.println("<PRE>Session Creation Time  -->" + new Date(session.getCreationTime()) + "</PRE><br>");
		out.println("<!DOCTYPE html>\n" +
				"<html>\n" + "<head>\n"
				+
	            "<title>Session Information</title>\n" +
	            "</head>\n" +
	            "<body bgcolor=\"#FDF5E6\">\n" +
	            "<h1 align=\"center\">" + heading + "</h1>\n" +
	            "<h2><b>INFORMATION OF YOUR SESSION :</b></h2>\n" +
	            "<table align=\"center\" border=\"1\">\n" +
	            "<tr bgcolor=\"#FFAD0A\">\n" +
	            "<th>INFO TYPE</th><th>VALUE</th>\n" +
	            "</tr>\n" +
	            "<tr>\n" +
	            "<td>ID</td><td>" + session.getId() + "</td>\n" +
	            "</tr>\n" +
	            "<tr>\n" +
	            "<td>CREATION TIME</td><td>" + new Date(session.getCreationTime()) + "</td>\n" +
	            "</tr>\n" +
	            "<tr>\n" +
	            "<td>TIME OF LAST ACCESS</td><td>" + new Date(session.getLastAccessedTime()) + "</td>\n" +
	            "</tr>\n" +
	            "<tr>\n" +
	            "<td>NUMBER OF PREVIOUS ACCESSES</td><td>" + accessCount + "</td>\n" +
	            "</tr>\n" +
	            "</table>\n" +
	            "</body>\n" +
	            "</html>");


	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
