<%@ page import="jakarta.servlet.RequestDispatcher"%>
<%@ page import="jakarta.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
   <%
   String UserName = request.getParameter("user");
   HttpSession session2 = request.getSession(true);
   if("Himanshu".equals(UserName)){
	   session2.setAttribute("username", UserName);
	   RequestDispatcher dispatcher = request.getRequestDispatcher("Display.jsp");
	   dispatcher.forward(request, response);
   } else {
  %>
     <h1>Invalid Input</h1>
  <%
   }
  %>
</body>
</html>
