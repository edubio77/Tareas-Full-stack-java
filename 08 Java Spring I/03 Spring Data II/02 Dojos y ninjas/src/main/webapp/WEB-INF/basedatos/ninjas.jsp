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
<title>Ninjas</title>
</head>
<body>
<h1>Nuevo Ninja</h1>
	<div>
			<a href="/">Página de inicio</a>
			<a href="/dojos/new">Crear dojo</a>
			<div class="col-5">
					<form action="addNinja" method="post">
				    <div>
			        <label>Dojo: </label>
			        <div>
			        	<select name="dojoId">
			        		<c:forEach items="${ dojos }" var="dojo">
			        			<option value="${ dojo.id }"><c:out value="${ dojo.name }"></c:out></option>
			        		</c:forEach>
			        	</select>
			        </div>
				    </div>
				    <div>
			        <label for="firstName">First Name: </label>
			        <div>
			        	<input type="text" name="firstName"/>
			        </div>
				    </div>
				    <div>
			        <label for="lastName">Last Name: </label>
			        <div>
			        	<input type="text" name="lastName"/>
			        </div>
				    </div>
				    <div>
			        <label for="age">Age: </label>
			        <div>
			        	<input type="number" name="age"/>
			        </div>
				    </div>
				    <input type="submit" class="btn" value="Crear"/>
					</form>
				</div>
		</div>
</body>
</html>