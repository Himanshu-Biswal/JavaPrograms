package Driver;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/rds")
public class Servlet_22_Driver  extends HttpServlet{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String gs = req.getParameter("gs");
	  double r = Double.parseDouble(req.getParameter("r"));
	  double a = Double.parseDouble(req.getParameter("a"));
	  double b = Double.parseDouble(req.getParameter("b"));
	  double h = Double.parseDouble(req.getParameter("h"));
		Servlet_21_Area_oF_Geometric_Shape se = new Servlet_21_Area_oF_Geometric_Shape();
	    double area = 0;

	    PrintWriter out = resp.getWriter();
	    
	    if("circle".equals(gs)) {
	    	area=se.circle(r);
	    	out.print("<h1>Area Of Circle: "+ area + "</h1>");
	    }
	    else if("elipse".equals(gs)) {
	    	area=se.elipse(a,b);
	    	out.print("<h1>Area Of Elipse: "+ area + "</h1>");
	    }
	    else if("trapezoid".equals(gs)) {
	    	area=se.trapezoid(a,b,h);
	    	out.print("<h1>Area Of Trapezoid: "+ area + "</h1>");
	    }
	    else if("rhombus".equals(gs)) {
	    	area=se.rhombus(a,b);
	    	out.print("<h1>Area Of Rhombus: "+ area + "</h1>");
	    }
	    else if("triangle".equals(gs)) {
	    	area=se.triangle(a,b);
	    	out.print("<h1>Area Of Triangle: "+ area + "</h1>");
	    }
	    else if("pyramid".equals(gs)) {
	    	area=se.pyramid(a,h);
	    	out.print("<h1>Area Of Pyramid: "+ area + "</h1>");
	    }
	    else if("cylinder".equals(gs)) {
	    	area=se.cylinder(r,h);
	    	out.print("<h1>Area Of Cylinder: "+ area + "</h1>");
	    }
	    else out.print("<h1> Invalid Input </h1>");
	    
}
}
