<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Boton clicker</title>
</head>
<body>	
	<div id="mundo">
		<a href="/Clicker/Botones"><button>Haz click</button></a>
		<h2>Haz hecho click en el boton <c:out value="${contar}"/> veces</h2>
	</div>
</body>
</html>