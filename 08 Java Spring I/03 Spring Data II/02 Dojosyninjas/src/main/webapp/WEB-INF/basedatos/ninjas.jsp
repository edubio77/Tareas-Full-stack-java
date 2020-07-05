<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninjas</title>
</head>
<body>
<h1>Nuevo Ninja</h1>
	<div>
			<a href="/">Página de inicio</a>
			<form:form action="/agregarninjas" method="post" modelAttribute="ninjaReal">
				<p>
					<form:label path="dojo">Dojo: </form:label>
					<form:errors path="dojo" />
					<form:select path="dojo">
						<c:forEach items="${dojos}" var="dojo">
							<form:option value="${dojo.id}">
								<c:out value="${dojo.name}"/>
							</form:option>
						</c:forEach>
					</form:select>
				</p>
				<p>
					<form:label path="firstName">Nombre: </form:label>
					<form:errors path="firstName" />
					<form:input path="firstName" />
				</p>
				
				<p>
					<form:label path="lastName">Apellido: </form:label>
					<form:errors path="lastName" />
					<form:input path="lastName" />
				</p>
				
				<p>
					<form:label path="age">Edad: </form:label>
					<form:errors path="age" />
					<form:input  path="age" />
				</p>
				
				<input class="btn" type="submit" value="Crear" />
			</form:form>
		</div>
</body>
</html>