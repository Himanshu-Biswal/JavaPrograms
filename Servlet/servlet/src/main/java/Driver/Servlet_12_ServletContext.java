package Driver;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sc")
public class Servlet_12_ServletContext extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter p = resp.getWriter();
	
	ServletContext s = getServletContext();
//	ServletConfig s = getServletConfig();
	String str = s.getInitParameter("degree");
	p.print("<h1> Hi "+str+"</h1>");
}
}
