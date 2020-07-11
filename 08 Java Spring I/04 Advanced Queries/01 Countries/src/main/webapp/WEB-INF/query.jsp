<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta</title>
</head>
<body>
	<div>
        <a href="/p1">Pregunta 1</a>
        <a href="/p2">Pregunta 2</a>
        <a href="/p3">Pregunta 3</a>
        <a href="/p4">Pregunta 4</a>
        <a href="/p5">Pregunta 5</a>
        <a href="/p6">Pregunta 6</a>
        <a href="/p7">Pregunta 7</a>
        <a href="/p8">Pregunta 8</a>
    </div>
    <h1>${query}</h1>
    <h4>${pregunta}</h4>
    <br>
    <table>
        <thead>
            <tr>
                <c:forEach items="${columns}" var="name">
                    <th>${name}</th>
                </c:forEach>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${table}" var="row">
                <tr>
                <c:forEach items="${row}" var="data">
                    <td>${data}</td>
				</c:forEach>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>