package Driver;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")

public class Servlet_04_Register extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int id = Integer.parseInt( req.getParameter("id"));
	  String name = req.getParameter("name");
	  int age = Integer.parseInt( req.getParameter("age"));
	  PrintWriter p = resp.getWriter();
	  p.print("<h1>"+"Id: "+id+"</h1>");
	  p.print("<h1>"+"Name: "+name+"</h1>");
	  p.print("<h1>"+"Age: "+age+"</h1>");
}
}
