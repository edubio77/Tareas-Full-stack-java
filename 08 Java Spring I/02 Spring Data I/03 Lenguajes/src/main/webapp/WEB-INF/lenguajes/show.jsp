<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<div>
	<div>
		<a href="/lenguajes">Dashboard</a>
	</div>
		<h1><c:out value="${lenguaje.name}"/></h1>
		<h1><c:out value="${lenguaje.creator}"/></h1>
		<h1><c:out value="${lenguaje.version}"/></h1>
		<a href="/lenguajes/edit/<c:out value="${lenguaje.id}"/>">Editar</a>
		<a href="/lenguajes/delete/<c:out value="${lenguaje.id}"/>">Borrar</a>
	</div>
</body>
</html>