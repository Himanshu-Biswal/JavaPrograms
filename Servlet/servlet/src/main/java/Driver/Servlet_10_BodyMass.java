package Driver;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/bm")
public class Servlet_10_BodyMass extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double weight=Double.parseDouble(req.getParameter("w"));
	double height=Double.parseDouble(req.getParameter("h"));
//	int bm=weight/height;
	req.setAttribute("weight", weight);
	req.setAttribute("height", height);
	RequestDispatcher dispatcher = req.getRequestDispatcher("/doct");
	dispatcher.forward(req, resp);
}
}
