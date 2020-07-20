<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos</title>
</head>
<body>
<h1>Nuevo Dojo</h1>
		<div>
			<a href="/">Página de inicio</a>
			<a href="/ninjas/new">Crear ninja</a>
			
			<form:form action="addDojo" method="post" modelAttribute="dojo">
				<p>
					<form:label path="name">Nombre: </form:label>
					<form:errors path="name" />
					<form:input path="name" />
				</p>
				<input class="btn" type="submit" value="Crear" />
			</form:form>
		</div>
</body>
</html>