<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva licencia</title>
</head>
<body>
<h1>Nueva Licencia</h1>
	<div>
		<a href="/">Página de inicio</a>
		<form:form action="/license/formulario" method="post" modelAttribute="licenseReal">
			    <p>
					<form:label path="person.id">Usuario: </form:label>
					<form:select path="person.id">
						<c:forEach items="${listapersonas}" var="person">
							<form:option value="${person.id}">
								<c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/>
							</form:option>
						</c:forEach>
					</form:select>
					<form:errors path="person.id" />
			    </p>
			    <p>
			        <form:label path="state">Comuna: </form:label>
					<form:select path="state">
						<c:forEach items="${states}" var="state">
							<form:option value="${state}">
								<c:out value="${state}"/>
							</form:option>
						</c:forEach>
					</form:select>
					<form:errors path="person" />
			    </p>
			    <p>
			        <form:label path="expirationDate">Fecha caducidad:</form:label>
			        <form:input type="date" path="expirationDate"/>
			        <form:errors path="expirationDate"/>
			    </p>
		    <input id="btn" type="submit" value="Crear"/>
		</form:form>
	</div>
</body>
</html>