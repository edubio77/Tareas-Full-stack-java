<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Songs</title>
</head>
<body>
	<div>
		<a href="/dashboard">Incio</a>
	</div>
	<div>
		<h3>Titulo: <c:out value="${song.titulo}"/></h3>
		<h3>Artista: <c:out value="${song.artista}"/></h3>
		<h3>Clasificacion: <c:out value="${song.clasificacion}"/></h3>
		<a href="/delete/<c:out value="${song.id}"/>">Delete</a>
	</div>

</body>
</html>