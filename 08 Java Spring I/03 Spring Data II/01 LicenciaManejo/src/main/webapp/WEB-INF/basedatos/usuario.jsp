<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos del usuario</title>
</head>
<body>
	<a href="/">Página de inicio</a>
	<div>
		<h1><c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/></h1>
		<h3>Número de licencia: <c:out value="${person.license.number}"/></h3>
		<h3>Comuna: <c:out value="${person.license.state}"/></h3>
		<h3>Fecha de caducidad: <fmt:formatDate pattern ="MM-dd-yyyy" value ="${person.license.expirationDate}"/></h3>
	</div>
	
	<h1>Usuarios registrados</h1>
		<table>
			<thead>
				<tr>
					<th scope="col">Nombre</th>
					<th scope="col">Apellido</th>
 					<th scope="col">Licencia</th>
					<th scope="col">Comuna</th>
					<th scope="col">Fecha de caducidad</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listapersonas}" var="persona">
					<tr>
						<td><c:out value="${persona.firstName}"/></td>
						<td><c:out value="${persona.lastName}"/></td>
						<td><fmt:formatNumber value="${persona.license.number}"/></td>
						<td><c:out value="${persona.license.state}"/></td>
						<td><fmt:formatDate pattern="MMMM dd, yyyy" value="${persona.license.expirationDate}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>