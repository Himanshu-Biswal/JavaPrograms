package com.SchoolManagement.Controller;

import java.io.IOException;

import com.SchoolManagement.Entity.Student;
import com.SchoolManagement.Service.StudentService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class Delete extends HttpServlet{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("id"));
	Student s = new Student();
	s.setId(id);
	
	StudentService st = new StudentService();
    int res = st.delete(s);
    if(res!=0) {
    	RequestDispatcher dispatcher = req.getRequestDispatcher("Jsp_04_Home.jsp");
    	dispatcher.forward(req, resp);
    }
}
}
