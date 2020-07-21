<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Dojo!</title>
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
			<div>
				<div>
					<h1><c:out value="${ product.name }"/></h1>
				</div>
			</div>
			<div>
				<div>
					<h3>Categories</h3>
					<ul>
						<c:forEach items="${ product.categories }" var="category">
							<li><c:out value="${ category.name }"/></li>							
						</c:forEach>
					</ul>
				</div>
				<div>
					<form action="addProdCatego" method="post">
				    <div>
			        <label for="name">Add Category: </label>
			        <div>
			        	<select name="categoId">
			        		<c:forEach items="${ categories }" var="category">
			        			<option value="<c:out value="${ category.id }"/>"><c:out value="${ category.name }"/></option>
			        		</c:forEach>
			        	</select>
			        </div>
				    </div>
				    <input type="hidden" name="prodId" value="<c:out value="${ prodId }"/>"/>
				    <input type="submit" class="btn" value="Add"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
