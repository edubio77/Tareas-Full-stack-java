<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cat</title>
</head>
<body>
	<h3>Tu haz creado un <c:out value="${cat.breed}"/></h3>
	<h3><c:out value="${cat.showAffection()}"/></h3>
</body>
</html>