<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Categorías</title>
	</head>
	<body>
		  <a href="/">LOGO</a>
		  <div>
		    <ul>
		      <li>
		        <a href="#">Home <span>(current)</span></a>
		      </li>
		      <li>
		        <a href="../products/new">Ingresar Producto</a>
		      </li>
		      <li>
		        <a href="/categories/new">Crear Categoria</a>
		      </li>
		    </ul>
		  </div>
		<div>
			<h1><c:out value="${ category.name }"/></h1>
			<div>
				<div>
					<h3>Productos</h3>
					<ul>
						<c:forEach items="${ category.products }" var="product">
							<li><c:out value="${ product.name }"/></li>							
						</c:forEach>
					</ul>
				</div>
				<div>
					<form action="addCategoProd" method="post">
				    <div>
			        <label for="name">Add Product: </label>
			        <div>
			        	<select name="prodId">
			        		<c:forEach items="${ products }" var="product">
			        			<option value="<c:out value="${ product.id }"/>"><c:out value="${ product.name }"/></option>
			        		</c:forEach>
			        	</select>
			        </div>
				    </div>
				    <input type="hidden" name="categoId" value="<c:out value="${ categoId }"/>"/>
				    <input type="submit" class="btn btn-primary" value="Add"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>