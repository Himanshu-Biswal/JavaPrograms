package Driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sbm")
public class Servlet_16_Register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pr = resp.getWriter();
		
		String id =req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String gender = req.getParameter("gender");
		String mail = req.getParameter("mail");
		String pswd = req.getParameter("pswd");
		
		
		Servlet_14_Student st1=new Servlet_14_Student();
		st1.setId(Integer.parseInt(id));
		st1.setName(name);
		st1.setAge(Integer.parseInt(age));
		st1.setGender(gender);
		st1.setMail(mail);
		st1.setPswd(pswd);
		
		Servlet_15_service s1=new Servlet_15_service();
		int res=0;
		try {
			res = s1.save(st1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res!=0) {
		RequestDispatcher dispatcher=req.getRequestDispatcher("Sev_17.html");
		dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Sev_16.html");
			dispatcher.include(req, resp);
		}
		
//		System.out.println("Yes run ");
//		System.out.println(id+"/n"+name+"/n"+age);
//		PrintWriter pw = resp.getWriter();
//		pw.print("<h1> id is "+id+"</h1>");
//		pw.print("<h1> name is "+name+"</h1>");
//		pw.print("<h1> age is "+age+"</h1>");
	}

}
