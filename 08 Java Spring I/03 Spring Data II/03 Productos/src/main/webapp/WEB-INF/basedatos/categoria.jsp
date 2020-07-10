<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${category.name}"/></title>
</head>
<body>
	<div>
		<div>
			<h1><c:out value="${category.name}"/></h1>
			<h2>Productos:</h2>
			<c:forEach items="${category.products}" var="prod">
				<h3>-<c:out value="${prod.name}"/></h3>
			</c:forEach>
		</div>

	</div>			
</body>
</html>