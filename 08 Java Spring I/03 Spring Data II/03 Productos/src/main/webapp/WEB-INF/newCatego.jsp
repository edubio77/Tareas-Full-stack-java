<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Nueva categoría</title>
	</head>
	<body>
		<a href="../products/new">Crear Producto</a>
		<h1>New Category</h1>
			<div>
				<div>
					<form:form action="addCategory" method="post" modelAttribute="category">
				    <div>
			        <form:label path="name">Name: </form:label>
			        <form:errors path="name"/>
			        <div>
			        	<form:input type="text" path="name"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form:form>
				</div>
			</div>
			<div>
				<div>
					<table>
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Name</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  <tbody>
					  	<%int cc=1; %>
						  <c:forEach items="${ categories }" var="category">
							  <tr>
						      <th scope="row"><%=cc++ %></th>
						      <td><c:out value="${ category.name }"></c:out></td>
						      <td><a href="<c:out value="${ category.id }"></c:out>">Ver</a></td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
	</body>
</html>