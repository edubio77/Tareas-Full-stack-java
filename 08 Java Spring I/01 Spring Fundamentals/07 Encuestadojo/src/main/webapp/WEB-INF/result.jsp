<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resultado</title>
</head>
<body>

	<div id="mundo">
	<fieldset>
		<h2>Información enviada</h2>
		<h2>Nombre: <c:out value="${nombre}"/></h2>
		<h2>Dojo Location: <c:out value="${ubicacion}"/></h2>
		<h2>Lenguaje favorito: <c:out value="${lenguajes}"/></h2>
		<h2>Comentario: <c:out value="${comentario}"/></h2>
	</fieldset>
	</div>
	
	<a href="/">Volver al inicio</a>
</body>
</html>