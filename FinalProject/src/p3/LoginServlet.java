package p3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("txtLogin");
		String pass=request.getParameter("txtPass");
		if(user.equals("sa")&&pass.equals("sa")) {
			pw.println("<font color='green'>Welcome to Login page</font>");
			/*RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			rd.forward(request,response);*/
			response.sendRedirect("Welcome");
		}
		else {
			pw.println("<font color='red'>Check your details</font>");
			RequestDispatcher rd=request.getRequestDispatcher("Loginhtml.html");
			rd.include(request, response);
		}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
