<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Juego del Ninja</title>
</head>
<body>
	
	<h2>Tu oro es: <c:out value="${total}"/></h2>
	
	<fieldset>
	<form method="POST" action="/farm">
	    <h4>Farm</h4>
	    <p>Ganas de 10 a 20 oros</p>
	    <button>Encuentra oro!</button>
	</form>

	<form method="POST" action="/cave">
	    <h4>Cave</h4>
	    <p>Ganas de 5 a 10 oros</p>
	    <button>Encuentra oro!</button>
	</form>

	<form method="POST" action="/house">
	    <h4>House</h4>
	    <p>Ganas de 2 a 5 oros</p>
	    <button>Encuentra oro!</button>
	</form>

	<form method="POST" action="/casino">
	    <h4>Casino!</h4>
	    <p>Ganas/pierdes de 0 a 50 oros</p>
	    <button>Encuentra oro!</button>
	</form>
	</fieldset>
	
	<h2>Actividades</h2>
	<fieldset>
	<c:forEach var="actividad" items="${actividades}" >
	<h4><c:out value="${actividad}"/></h4>
	</c:forEach>
	</fieldset>

</body>
</html>