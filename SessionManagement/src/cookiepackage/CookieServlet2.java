package cookiepackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie2")
public class CookieServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		Cookie[] cArray=request.getCookies();
		out.println("The cookie is " +cArray[0].getValue());
		String s=request.getParameter("str1");
		out.println("The value is " +s);
		String s1=request.getParameter("str2");
		out.println("The Gender value is " +s1);
		out.println("<form action='Cookie3'>");
		out.println("<input type='hidden' name='h1' value='"+s+"'>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
