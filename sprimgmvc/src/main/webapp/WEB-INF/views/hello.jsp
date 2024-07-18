<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Spring MVC</title>
</head>
<body>
<H1>Hello Spring MVC</H1>
	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");
		out.println("ID: " + id);
		out.println("Name: " + name);
		out.println("salary: " + salary);
	%>
	<br /> 
	Id:
	<b>${id}</b> 
	 Name
	<b>${name}</b> 
	Salary:
	<b>${salary}</b>
</body>
</html>