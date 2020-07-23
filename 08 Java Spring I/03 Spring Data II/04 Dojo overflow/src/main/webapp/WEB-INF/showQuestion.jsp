<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Show Question!</title>
	</head>
	<body>
		        <a href="../">Home</a>
		        <a href="../questions">Dashboard</a>
		        <a href="/questions/new">Ingresar Pregunta</a>


				<h1><c:out value="${ question.question }"></c:out></h1>
				<h4>Tags <c:out value="${ question.tags[0].tag }"></c:out></h4>

					<table class="table table-strip table-hover">
						<thead>
							<tr>
								<th>Answers</th>
							</tr>
						</thead>		
						<tbody>
							<c:forEach items="${ question.answers }" var="answer">
								<tr>
									<td><c:out value="${ answer.answer }"></c:out></td>
								</tr>			
							</c:forEach>
						</tbody>			
					</table>
	
		
					<form action="addAnswerQuestion" method="post">
						<div>
							<label>Answer: </label>
			        <div>
			        	<textarea name="answer"></textarea>
			        </div>
						</div>
						<input type="hidden" name="questionId" value="${ question.id }" />
						<input type="submit" class="btn btn-primary" value="Answer it" />
					</form>
	</body>
</html>