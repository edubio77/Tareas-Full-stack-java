<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Nuevo producto</title>
	</head>
	<body>
		<div>
		<a href="../categories/new">Crear Categoria</a>
		<h1>New Product</h1>
			<div>
				<div>
					<form:form action="addProduct" method="post" modelAttribute="product">
				    <div>
			        <form:label path="name">Name: </form:label>
			        <form:errors path="name"/>
			        <div>
			        	<form:input type="text" class="form-control" path="name"/>
			        </div>
				    </div>
				    <div>
			        <form:label path="description">Description: </form:label>
			        <form:errors path="description"/>
			        <div>
			        	<form:textarea path="description"/>
			        </div>
				    </div>
				    <div>
			        <form:label path="price">Price: </form:label>
			        <form:errors path="price"/>
			        <div>
			        	<form:input type="number" step="0.01" path="price"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form:form>
				</div>
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
						  <c:forEach items="${ products }" var="product">
							  <tr>
						      <th scope="row"><%=cc++ %></th>
						      <td><c:out value="${ product.name }"></c:out></td>
						      <td><a href="<c:out value="${ product.id }"></c:out>">Ver</a></td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>