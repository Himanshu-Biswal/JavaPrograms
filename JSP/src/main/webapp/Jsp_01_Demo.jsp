<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
   <%
   int i = Integer.parseInt(request.getParameter("a"));
  	int j = Integer.parseInt(request.getParameter("b"));
  	int k = i+j;
  	out.println("<h1>Sum of "+i+"+"+j+" = "+k+"</h1>");
   %>
</body>
</html>