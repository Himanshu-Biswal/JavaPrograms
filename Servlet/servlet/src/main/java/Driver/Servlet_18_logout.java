package Driver;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/logout")
public class Servlet_18_logout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookies=req.getCookies();
		for (Cookie cookie : cookies) {			
			if(cookie.getName().equals("id"))
				 cookie.setMaxAge(0); // For Remove or Delete Cookies
			System.out.println(cookie.getName()+" "+cookie.getValue()+" deleted");
		}
		RequestDispatcher dispatcher= req.getRequestDispatcher("Sev_17.html");
		dispatcher.forward(req, resp);
	}
	
}