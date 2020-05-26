<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top ten</title>
</head>
<body>
		<div>
			<h1>Canciones top ten:</h1>
			<a href="/dashboard">Inicio</a>
		</div>
		<fieldset>
			<c:forEach items="${songs}" var="song">
			<ul>
				<li>
					<h2><c:out value="${song.clasificacion}"/> - <a href="/songs/${song.id}"><c:out value="${song.titulo}"/></a> - <c:out value="${song.artista}"/></h2>
				</li>
			</ul>
			</c:forEach>
		</fieldset>
</body>
</html>
