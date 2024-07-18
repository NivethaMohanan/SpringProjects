<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registered Response</title>
</head>
<body>
User Registered Successfully. User Details are:
<%=request.getAttribute("user")%>
</body>
</html>