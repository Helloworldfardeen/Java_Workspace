package com.practise.shopstop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Netservlet
 */
@WebServlet("/Netservlet")
public class Netservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Netservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("empname");
		float basic = (Float)request.getAttribute("b");
		float da = (Float)request.getAttribute("d");
		float Hra = (Float)request.getAttribute("h");
		float gross = (Float)request.getAttribute("g");
		float deduction = gross *0.05f;
		float net = gross- deduction;
		out.print("<h1 align ='center'>EMPNAME</h1><h1 align ='center'>" + name + "</h1>");
		out.println("<hr><h2>Basic Salary: </h2>" + basic);
		out.println("<h2>DA: </h2>" + da);
		out.println("<h2>HRA: </h2>" + Hra);
		out.println("<h2>Gross Salary: </h2>" + gross);
		out.println("<h2>Deduction: </h2>" + deduction);
		out.println("<h2>Net Salary : </h2>" + net);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
