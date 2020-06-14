<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Números</title>
</head>
<body>
	<div>
		<h1>Juego del número</h1>
		<h3>Estoy pensando en un número del 1 al 100</h3>
		<h3>Adivina cual es!</h3>
		<div>
			<% String resp = (String) session.getAttribute("respuesta");
				if(resp == "correcto"){ %>
					<div>
						<h3>Correcto!</h3>
						<a href="nuevo"><button>Otra vez!</button></a>
					</div>
			<% } else if(resp == "bajo"){%>
	
					<div>
						<h3>Muy bajo</h3>
					</div>
			<% } else if(resp == "alto"){ %>
					<div>
						<h3>Muy alto</h3>
					</div>
			<% } %>
		</div>
		<form action="/greatnumber/index" method="post">
			<p><input type="text" name="achunte"></p>
			<p><input type="submit" value="Submit"></p>
		</form>	
	</div>
</body>
</html>