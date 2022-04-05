<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC application</title>
</head>
<body>
	<h1>
		Hello spring mvc application !!
		</h1>

		<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer years = (Integer) request.getAttribute("years");
	out.println("ID is: "+id);
	out.println("Name is: "+name);
	out.println("year is: "+years);
	%>
	
</body>
</html>