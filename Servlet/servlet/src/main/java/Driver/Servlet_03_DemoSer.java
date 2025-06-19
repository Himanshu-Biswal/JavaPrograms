package Driver;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/add") //here we write anything inside " " .
public class Servlet_03_DemoSer extends HttpServlet {
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	int i = Integer.parseInt(req.getParameter("num1"));
    	int j = Integer.parseInt(req.getParameter("num2"));
    	int k = i+j;
//    	System.out.println("Sum of "+i+"+"+j+" = "+k);
    	PrintWriter out = res.getWriter();
    	out.print("<h1>Sum of "+i+"+"+j+" = "+k+"</h1>");
    }
}
