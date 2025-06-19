package Driver;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/doct")
public class Servlet_11_CalculateBodyMass extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double w=(double)req.getAttribute("weight");
	double h=(double)req.getAttribute("height");
	double bm=w/(h*h);
	
	PrintWriter p = resp.getWriter();
	p.print("<h1> Body Mass Count</h1>");
	if(bm>2) {
		p.print("<h1> Body Mass: "+bm+" Is Ok</h1>");
	}
	else p.print("<h1> Body Mass: "+bm+" Is Not Ok</h1>");
}
}
