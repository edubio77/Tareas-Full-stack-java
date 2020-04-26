<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<div id="mundo">
		<div id="perro">
			<form action="/Mascotas/Dogs" method="get">
				<h4>Nombre:<input class="inputs" type="text" name="name"></h4>
				<h4>Raza:<input class="inputs" type="text" name="breed"></h4>
				<h4>Peso(Kg):<input class="inputs" type="text" name="weight"></h4>
				<input class="btn" type="submit" value="Submit">
			</form>	
		</div>
		
		<div id="gato">
			<form action="/Mascotas/Cats" method="get">
				<h4>Nombre:<input class="inputs" type="text" name="name"></h4>
				<h4>Raza:<input class="inputs" type="text" name="breed"></h4>
				<h4>Peso(Kg):<input class="inputs" type="text" name="weight"></h4>
				<input class="btn" type="submit" value="Submit">
			</form>	
		</div>
	</div>
</body>
</html>