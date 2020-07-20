<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo usuario</title>
</head>
<body>
<h1>Nuevo usuario</h1>
	<div>
		<a href="/">Página de inicio</a>
		<form:form action="/person/formulario" method="post" modelAttribute="personReal">
			    <p>
			        <form:label path="firstName">Nombre</form:label>
			        <form:input path="firstName"/>
			        <form:errors path="firstName"/>
			    </p>
			    <p>
			        <form:label path="lastName">Apellido</form:label>
			        <form:input path="lastName"/>
    				<form:errors path="lastName"/>
			    </p>
		    <input id="btn" type="submit" value="Crear"/>
		</form:form>
	</div>
</body>
</html>