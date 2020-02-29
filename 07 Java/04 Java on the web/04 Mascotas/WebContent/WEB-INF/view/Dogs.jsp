<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Perros</title>
</head>
<body>
	<h2>Haz creado un perro de raza <c:out value="${perro.raza}"/></h2>
	<h2><c:out value="${perro.showAffection()}"/></h2>
</body>
</html>