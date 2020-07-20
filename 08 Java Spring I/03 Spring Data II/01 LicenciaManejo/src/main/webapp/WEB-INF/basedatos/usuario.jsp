<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Datos del usuario</title>
</head>
<body>
	<a href="/">Página de inicio</a>
	<div>
		<h1><c:out value="${license.person.firstName}"/> <c:out value="${license.person.lastName}"/></h1>
		<h3>Número de licencia: <c:out value="${license.number}"/></h3>
		<h3>Comuna: <c:out value="${license.state}"/></h3>
		<h3>Fecha de caducidad: <fmt:formatDate pattern ="MM-dd-yyyy" value ="${license.expirationDate}"/></h3>
	</div>
</body>
</html>