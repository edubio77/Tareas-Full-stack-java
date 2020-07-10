<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva categoría</title>
</head>
<body>
	<div>
		<div>
			<h1>Nueva categoría</h1>
			<a href="/products/new">Registra un nuevo producto</a>
			
			<form:form action="/agregarcategoria" method="post" modelAttribute="categoryReal">
			    <h2>
			        <form:label path="name">Nombre:</form:label>
			        <form:input path="name"/>
			        <form:errors path="name"/>
			    </h2>

			    <input id="btn" type="submit" value="Crear"/>	 
			</form:form>
		</div>
		<div>
		</div>
	</div>
</body>
</html>