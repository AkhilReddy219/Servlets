package cookiepackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Cookie")
public class CookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession ses=request.getSession();
	PrintWriter pw=response.getWriter();
	String email=request.getParameter("txtemail");
	String gender=request.getParameter("g1");
	System.out.println(gender);
	String []values=request.getParameterValues("c1");
	
	for(String s:values)
	{
		pw.println(s);
	}
	
	Cookie c1=new Cookie("EmailCookie",ses.getId());
	c1.setMaxAge(0);
	response.addCookie(c1);
	if(c1!=null) {
		pw.println("Cookie Created");
	}
	
	response.sendRedirect("Cookie2?str1="+email+"&str2="+gender);
	/*RequestDispatcher rd=request.getRequestDispatcher("Cookie2");
	rd.include(request, response);*/
	
	}
	

}
