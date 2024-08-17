package com.practise.shopstop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String sId = request.getParameter("id");
		String sName = request.getParameter("name");
		String sGender =request.getParameter("sex");
		String[] sQualification = request.getParameterValues("qualification");
		String[] sTechnologies = request.getParameterValues("technologies");
		String sCity = request.getParameter("city");
		String sAddress = request.getParameter("address");
		String store = " ";
		for (String string : sQualification) {
			store = store + string+"<br>";
		}
		String store2 = " ";
		for (String string : sTechnologies) {
			store2 = store2 + string + "<br>";
		}
		/*
		 * <table> <tr> <th>Month</th> <th>Savings</th> </tr> <tr> <td>January</td>
		 * <td>$100</td> </tr> </table>
		 */
		
		out.println("<html><body>");
		out.println("<font color ='red'>");
		out.println("<h1> Customer Details</h1>");
		out.println("</font>");
		out.println("<table border = '1'><tr>");
		out.println("<th>Customer</th><th>Details</th><tr/>");
		out.println("<tr><td> Customer Id</td><td>"+sId+"</td></tr>");
		out.println("<tr><td> Customer name</td><td>"+sName+"</td></tr>");
		out.println("<tr><td> Customer Gender</td><td>"+sGender+"</td></tr>");
		out.println("<tr><td> Customer Qualification</td><td>"+store+"</td></tr>");
		out.println("<tr><td> Customer Technology</td><td>"+store2+"</td></tr>");
		out.println("<tr><td> Customer City</td><td>"+sCity+"</td></tr>");
		out.println("<tr><td> Customer Address</td><td>"+sAddress+"</td></tr>");
		out.println("</table></body></html>");
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
