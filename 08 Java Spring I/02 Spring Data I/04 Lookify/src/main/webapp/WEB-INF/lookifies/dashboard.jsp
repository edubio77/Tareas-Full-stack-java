<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<fieldset>
	<a href="songs/new">Agregar canción</a>
	<a href="search/topten">Top canciones</a>
	<form action="/search" method="post">
			<input type="submit" value="Buscar artista">
			<input type="search" name="artista" placeholder="Artista">
	
	</form>
	</fieldset>
	<fieldset>
		<table>
		    <thead>
		        <tr>
		            <th>Titulo</th>
		            <th>Clasificación</th>
		            <th>Acciones</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="/songs/<c:out value="${song.id}"/>"><c:out value="${song.titulo}"/></a></td>
		            <td><c:out value="${song.clasificacion}"/></td>
		            <td><a href="/delete/<c:out value="${song.id}"/>">Borrar</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</fieldset>
</body>
</html>