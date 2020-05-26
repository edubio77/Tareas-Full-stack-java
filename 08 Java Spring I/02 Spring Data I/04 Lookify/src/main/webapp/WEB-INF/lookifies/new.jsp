<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New song</title>
</head>
<body>
		<div>
			<a href="/dashboard">Inicio</a>
		</div>
		<form:form action="/process" method="post" modelAttribute="addNew">
			    <p>
			        <form:label path="titulo">Titulo</form:label>
			        <form:input path="titulo"/>
			        <form:errors path="titulo"/>

			    </p>
			    <p>
			        <form:label path="artista">Artista</form:label>
			        <form:input path="artista"/>
    				<form:errors path="artista"/>
			    </p>
			    <p>
				    <form:label path="clasificacion">Clasificacion:</form:label>
			        <form:select path="clasificacion">
			        	<form:option value="1">1</form:option>
			        	<form:option value="2">2</form:option>
			        	<form:option value="3">4</form:option>
			        	<form:option value="4">4</form:option>
			        	<form:option value="5">5</form:option>
			        	<form:option value="6">6</form:option>
			        	<form:option value="7">7</form:option>
			        	<form:option value="8">8</form:option>
			        	<form:option value="9">9</form:option>
			        	<form:option value="10">10</form:option>
			        </form:select>
	    		 	<form:errors path="clasificacion"/>
			    </p>
		    <input id="btn" type="submit" value="Agregar canción"/>
		</form:form>
</body>
</html>