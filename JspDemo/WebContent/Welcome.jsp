<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<h1 style="color: red; text-align: center">
		<%=new Date()%>
	</h1>

	<%
		for (int i = 1; i <= 10; i++) {
			out.println(i + "<br>");
		}
	%>
</body>
</html>