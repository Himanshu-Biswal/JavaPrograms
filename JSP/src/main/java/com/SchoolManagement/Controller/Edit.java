package com.SchoolManagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.SchoolManagement.Entity.Student;
import com.SchoolManagement.Service.StudentService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/change")
public class Edit extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int id = Integer.parseInt(req.getParameter("id"));
	  String name = req.getParameter("name");
	  int age = Integer.parseInt(req.getParameter("age"));
	  Student s = new Student();
	  s.setAge(age);
	  s.setId(id);
	  s.setName(name);
	  
	  StudentService st = new StudentService();
	  int res = st.edit(s);
	  
	  PrintWriter out = resp.getWriter();
	  if(res!=0) {
		  RequestDispatcher dispatcher = req.getRequestDispatcher("Jsp_04_Home.jsp");
		  dispatcher.forward(req, resp);
	  }
	  else out.println("<h1> Data Not Found </h1>");
}
}
