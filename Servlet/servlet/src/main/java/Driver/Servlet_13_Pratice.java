package Driver;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sl")
public class Servlet_13_Pratice extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String user = req.getParameter("user");
	String pswd = req.getParameter("pswd");
    
	if("Himanshu@7".equals(user) && "Madhu@479".equals(pswd)) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("Sev_13_Pt.html ");
		dispatcher.forward(req, resp);
	}
	
//	if(user.equals("Himanshu@7") && pswd.equals("Madhu@479")) {
//	    resp.sendRedirect("https://www.flipkart.com");
//	}

}
}
