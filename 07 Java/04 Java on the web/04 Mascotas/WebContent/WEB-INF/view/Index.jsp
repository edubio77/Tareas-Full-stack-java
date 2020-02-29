<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>
	<body>
		<div id="mundo">
			<h1>Perro</h1>
			<form action="/Mascotas/Dogs" method="get">
				<h2>Nombre:
				<input class="inputs" type="text" name="nombre"></h2>
				<h2>Raza:
				<input class="inputs" type="text" name="raza"></h2>
				<h2>Peso:
				<input class="inputs" type="text" name="peso"></h2>
				<input class="btn" type="submit" value='Enviar'>
			</form>	
			<h1>Gato</h1>	
			<form action="/Mascotas/Cats" method="get">
				<h2>Nombre:
				<input class="inputs" type="text" name="nombre"></h2>
				<h2>Raza:
				<input class="inputs" type="text" name="raza"></h2>
				<h2>Peso:
				<input class="inputs" type="text" name="peso"></h2>
				<input class="btn" type="submit" value='Enviar'>
			</form>
		</div>
	</body>
</html>