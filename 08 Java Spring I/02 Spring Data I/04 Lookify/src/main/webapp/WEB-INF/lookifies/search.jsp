<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar por artista</title>
</head>
<body>
			<h2>Canción por artista: <c:out value="${artista}"/></h2>
			<div>
				<form action="/search" method="post">
					<input type="search" name="artista" placeholder="Artist">
					<input type="submit" value="New Search">
				</form>
				<a href="/dashboard">Inicio</a>
			</div>
		<fieldset>
		<table>
		    <thead>
		        <tr>
		            <th>Titulo</th>
		            <th>Clasificación</th>
		            <th>Acción</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.titulo}"/></a></td>
		            <td><c:out value="${song.clasificacion}"/></td>
		            <td><a href="/delete/<c:out value="${song.id}"/>">Borrar</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
		</fieldset>
</body>
</html>