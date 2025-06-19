package Driver;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class Servlet_09_getAttribute extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	 int k=(int)req.getAttribute("sum");
//   int res = k*k;
	  
	  
// Acess Value Using Redirect 
//	  int k=Integer.parseInt(req.getParameter("sum"));
//	  int res=k*k;
	 
	  
//	  Http Session
//	  HttpSession session = req.getSession();
//	  int k=Integer.parseInt((String)  session.getAttribute("sum"));
//	  int res=k*k;
	  
//	  Cookies
	  int res=0,k=0;
	  Cookie cookie[] = req.getCookies();
	  for(Cookie c:cookie) {
		  if(c.getName().equals("sum"))
			 k=Integer.parseInt(c.getValue()); 
	  }
	  res=k*k;
	 PrintWriter p = resp.getWriter();
	 p.print("<h1> Square is :"+res+"</h1>");
 }
}
