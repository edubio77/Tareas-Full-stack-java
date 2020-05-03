  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Home</title>
</head>
<body>
	<h1>¿Cuál es el código?</h1>
	<form action="/code" method="post">
		<p><input id="campo" type="text" name="code"></p>
		<p><input id="boton" type="submit" value="Verificar"></p>
	</form>
	<h2><c:out value="${error}"/></h2>
</body>
</html>