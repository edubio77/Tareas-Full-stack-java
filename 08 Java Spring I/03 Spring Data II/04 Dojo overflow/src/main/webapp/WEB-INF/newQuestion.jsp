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

					<form action="addQuestionTag" method="post">
				    <div>
			        <label>Question: </label>
			        <div>
			        	<input type="text" name="question"/>
			        </div>
				    </div>
				    <div>
			        <label>Tags: </label>
			        <div>
			        	<input type="text" name="tag"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form>
	
	</body>
</html>