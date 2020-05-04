<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Encuesta</title>
</head>
<body>
	<div id="mundo">
		<fieldset>
		<form method="POST" action="/submit" >
			<h2>Nombre: <input type="text" name="nombre"></h2>
			<h2>Elige tu comuna:</h2>
				<select name="ubicacion">
				  <option value="Temuco">Temuco</option>
				  <option value="Padre las Casas">Padre las Casas</option>
				  <option value="Cunco">Cunco</option>
				  <option value="Villarrica">Villarrica</option>
  				  <option value="Otra">Otra</option>
				</select>
			<h2>Lenguaje favorito: </h2>
				<select name="lenguajes">
				  <option value="Java">Java</option>
				  <option value="Python">Python</option>
				  <option value="C++">C++</option>
				</select>
			<h2>Comentario (opcional):</h2>
			<textarea name="comentario"></textarea>
			<input type="submit" value="submit" name="submit">
		</form>
		</fieldset>
	</div>
</body>
</html>