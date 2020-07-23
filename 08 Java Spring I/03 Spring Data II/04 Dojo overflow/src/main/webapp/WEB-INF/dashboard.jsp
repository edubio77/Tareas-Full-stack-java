<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Question!</title>
	</head>
	<body>
		        <a href="../">Home</a>
		        <a href="../questions">Dashboard</a>
		        <a href="/questions/new">Ingresar Pregunta</a>

					<h1>Questions Dashboard</h1>
					
					<table>
						<thead>
							<tr>
								<th>Question</th>
								<th>Tags</th>
							</tr>
						</thead>		
						<tbody>
							<c:forEach items="${ questions }" var="q">
								<tr>
									<td>
										<a href="/questions/<c:out value='${ q.id }'/>"><c:out value="${ q.question }"></c:out></a>
									</td>
									<td><c:out value="${ q.tags[0].tag }"></c:out></td>
								</tr>			
							</c:forEach>
						</tbody>			
					</table>

	</body>
</html>
