package com.practise.shopstop;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GrossServlet")
public class GrossServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GrossServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// the Comment Part is remaining bro sooo doo it by your self because you have
		// to do work hard....
		float basic = Float.parseFloat(request.getParameter("basic"));
		float da = basic * 0.6f;
		float hra = basic * 0.2f;
		float gross = basic + da + hra;
		request.setAttribute("b", basic);
		request.setAttribute("d", da);
		request.setAttribute("h", hra);
		request.setAttribute("g", gross);
		//below imp line its is used for communication of two servlet
		RequestDispatcher rd = request.getRequestDispatcher("/Netservlet");
		rd.forward(request, response);

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
