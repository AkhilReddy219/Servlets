package p3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
	String first=request.getParameter("firstname");
	String last=request.getParameter("lastname");
	String pass=request.getParameter("password");
	String gender=request.getParameter("Gender");
	String gender2=request.getParameter("Gender");
	String email=request.getParameter("email");
	String phone=request.getParameter("phone");
	/*pw.println(first + last + pass + gender + email + phone);*/
	
	RequestDispatcher rd = request.getRequestDispatcher("Loginhtml.html");
	rd.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
