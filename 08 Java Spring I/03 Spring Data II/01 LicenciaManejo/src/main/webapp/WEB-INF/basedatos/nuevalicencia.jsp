<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nueva licencia</title>
</head>
<body>
<h1>Nueva Licencia</h1>
	<div>
		<a href="/">Página de inicio</a>
		<form:form action="/license/formulario" method="post" modelAttribute="licenseReal">
			    <p>
					<form:label path="person">Usuario: </form:label>
					<form:select path="person">
						<c:forEach items="${listapersonas}" var="persona">
							<form:option value="${persona.id}">
								<c:out value="${persona.firstName}"/> <c:out value="${persona.lastName}"/>
							</form:option>
						</c:forEach>
					</form:select>
					<form:errors path="person" />
			    </p>
			    <p>
			        <form:label path="state">Comuna:</form:label>
			        <form:select path="state">
			        	<form:option value="1">Cunco</form:option>
			        	<form:option value="2">Temuco</form:option>
			        	<form:option value="3">Padre las Casas</form:option>
			        </form:select>
	    		 	<form:errors path="state"/>
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