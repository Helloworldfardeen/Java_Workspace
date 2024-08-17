
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Adding")
public class Adding extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i + j;
		PrintWriter out = response.getWriter();
		out.println("<h1>" + k + "</h1>");
		out.println("<div class='center'>");
        out.println("<a href='operation.html' class='button'>Go Back</a>");
//		// Set the result as a request attribute
//		request.setAttribute("result", k);
//
//		// Forward the request to the same JSP page
//		request.getRequestDispatcher("operation.html").forward(request, response);

	}

}
