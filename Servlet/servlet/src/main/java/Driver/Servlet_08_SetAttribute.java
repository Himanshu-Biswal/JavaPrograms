package Driver;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sa")
public class Servlet_08_SetAttribute extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int a=Integer.parseInt(req.getParameter("a"));
	int b=Integer.parseInt(req.getParameter("b"));
	int sum=a+b;
//	req.setAttribute("sum", sum);
//	RequestDispatcher dispatcher = req.getRequestDispatcher("/sq");
//	dispatcher.forward(req, resp);

//	*** Another Way ***
//	 Send Value With Redirect
//		resp.sendRedirect("sq?sum="+sum);
	
	
	
//	Http Session
//	HttpSession session = req.getSession();
//	session.setAttribute("sum", sum);
//	resp.sendRedirect("sq");
	
//	Cookies 
	Cookie cookie = new Cookie("sum", sum+"");
	resp.addCookie(cookie);
	resp.sendRedirect("sq");
 }
}
