<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lenguajes</title>
</head>
<body>
	<div id="mundo">
		<table>
		    <thead>
		        <tr>
		            <th>Nombre</th>
		            <th>Creador</th>
		            <th>Version</th>
		            <th>Acción</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${lenguajes}" var="leng">
		        <tr>
		            <td><a href="/lenguajes/<c:out value="${leng.id}"/>"><c:out value="${leng.name}"/></a></td>
		            <td><c:out value="${leng.creator}"/></td>
		            <td><c:out value="${leng.version}"/></td>
		            <td><a href="/lenguajes/delete/<c:out value="${leng.id}"/>">Borrar</a> <a href="lenguajes/edit/<c:out value="${leng.id}"/>">Editar</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
		
		<div>
			<form:form action="/lenguajes" method="POST" modelAttribute="addNew">		  
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
			        <form:label path="version">Version</form:label>
			        <form:input path="version"/>
     		 		<form:errors path="version"/>
			    </p>
			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
		</div>
	</div>
</body>
</html>