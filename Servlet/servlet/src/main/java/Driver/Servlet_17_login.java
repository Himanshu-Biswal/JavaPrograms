package Driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sii")
public class Servlet_17_login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Welcome to Login Page");
		PrintWriter pr = resp.getWriter();
		pr.println("<h1>Welcome to login </h1>");
		String id=req.getParameter("id");
		String pswd = req.getParameter("pswd");
		System.out.println(id+" "+pswd);
		Servlet_15_service s1 = new Servlet_15_service ();
		
		
		try {
			if(s1.check(id, pswd)) {
				RequestDispatcher dispatcher=req.getRequestDispatcher("home.html");
				Cookie c1=new Cookie("id", id);
				Cookie c2 = new Cookie("pswd", pswd);
				resp.addCookie(c1);
				resp.addCookie(c2);
				dispatcher.forward(req, resp);
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("Sev_17.html");
				dispatcher.include(req, resp);
			}
		} catch (SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
