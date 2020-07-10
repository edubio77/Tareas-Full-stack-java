<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo Producto</title>
</head>
<body>
	<div>
		<div>
			<h1>Nuevo Producto</h1>
			<a href="/products/new">Registra un nuevo producto</a>
			
			<form:form action="/agregarproducto" method="post" modelAttribute="productReal">
	  
			    <h2>
			        <form:label path="name">Nombre:</form:label>
			        <form:input path="name"/>
			        <form:errors path="name"/>
			    </h2>
   			    <h2>
			        <form:label path="description">Descripción:</form:label>
			        <form:input path="description"/>
			        <form:errors path="description"/>
			    </h2>
   			    <h2>
			        <form:label path="price">Precio:</form:label>
			        <form:input path="price"/>
			        <form:errors path="price"/>
			    </h2>
			    <input id="btn" type="submit" value="Crear"/>	 
			</form:form>
		</div>
		<div>
		</div>
	</div>
</body>
</html>