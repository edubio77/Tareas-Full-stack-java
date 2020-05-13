<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contador</title>
</head>
<body>
	<h1>Tu has visitado la página <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${count}"/> veces</h1>
	<a href="http://localhost:8080/"><h1>¿Otra visita?</h1></a>

</body>
</html>