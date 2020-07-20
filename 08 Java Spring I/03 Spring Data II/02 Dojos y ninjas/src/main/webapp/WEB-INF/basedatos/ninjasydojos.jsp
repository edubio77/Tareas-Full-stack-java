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
<title>Ninjas y Dojos</title>
</head>
<body>
<h1>Información</h1>
<a href="/">Página de inicio</a>
<a href="/dojos/new">Crear dojo</a>
<a href="/ninjas/new">Crear ninja</a>

<h2>Sede <c:out value="${dojos.name}"/> Ninjas</h2>

			<table>
			<thead>
				<tr>
					<th>#</th>
			    	<th>Nombre</th>
			      	<th>Apellido</th>
			      	<th>Edad</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojos.ninjas}" var="ninja">
				<tr>
					<th><c:out value="${ninja.id}"></c:out></th>
				    <td><c:out value="${ninja.firstName}"/></td>
				    <td><c:out value="${ninja.lastName}"/></td>
				    <td><c:out value="${ninja.age}"/></td>
				 </tr>
				 </c:forEach>
			 </tbody>
			</table>
</body>
</html>