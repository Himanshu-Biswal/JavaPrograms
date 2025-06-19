<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 input {
	padding: 10px;
	color: blue;
	font-size: 20px;
	margin-right: 15px;
	border-radius: 7px;
}
h1{
  text-align: center;
  margin-bottom: -170px;
}
div {
	background-color: #432e63;
	display: flex;
	padding: 20px;
	width: 200px;
	margin: 200px auto;
	border-radius: 8px;
}
</style>
</head>
<body>

<h1> Welcome To Student Management Page</h1>
   <br>
   <div>
     <form action="Jsp_05_register.jsp">
   <input type="submit" value="Register">
  </form>
  <br>
  <form action="display">
   <input type="submit" value="Display">
  </form>
   </div>
</body>
</html>