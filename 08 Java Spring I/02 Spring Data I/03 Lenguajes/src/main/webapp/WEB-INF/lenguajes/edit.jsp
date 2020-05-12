<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="mundo">
	<div>
		<a href="/lenguajes">Inicio</a>
		<a href="/lenguajes/delete/<c:out value="${lenguaje.id}"/>">Borrar</a>
	</div>
		<form:form action="/lenguajes/${lenguaje.id}" method="post" modelAttribute="lenguaje">
		    <input type="hidden" name="_method" value="put">
			    <p>
			        <form:label path="name">Nombre</form:label>
			        <form:input path="name"/>
			        <form:errors path="name"/>

			    </p>
			    <p>
			        <form:label path="creator">Creador</form:label>
			        <form:input path="creator"/>
    				<form:errors path="creator"/>
			    </p>
			    <p>
			        <form:label path="version">Versión</form:label>
			        <form:input path="version"/>
     		 		<form:errors path="version"/>
			    </p>
		    <input id="btn" type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>