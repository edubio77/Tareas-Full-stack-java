<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/cssIndex.css" type="text/css" >
	<title>Tablero ajedrez</title>
</head>
<body>

	<!-- Agregar valores deseados -->
	<%
	int ancho=8; 
	int alto=8;  
	%>
	<%if(request.getParameter("ancho") != null){
		ancho = Integer.parseInt(request.getParameter("ancho"));	
		}
	if(request.getParameter("alto") != null){
		alto = Integer.parseInt(request.getParameter("alto"));
		}%>
		<h1>Tablero <%= ancho %>cuadros X <%= alto %>cuadros</h1>
	<%
	int index2=1;
	%>
	<div id="container">
		<% while(index2 < alto) {%>
			<% for(int index1 = 1; index1 < ancho; index1++) { %>
				<%if (index1%2==0) {%>
	        	<div class= "cuadrosblancos"></div>
	        	<% } else {%>
	        	<div class= "cuadrosnegros"></div>
	        	<% } %>
	    	<% } %>
	    	<br>
	    	<% for(int index1 = 1; index1 < ancho; index1++) { %>
				<%if (index1%2!=0) {%>
	        	<div class= "cuadrosblancos"></div>
	        	<% } else {%>
	        	<div class= "cuadrosnegros"></div>
	        	<% } %>
	    	<% } %>
	    	<br>
	    	<% index2 = index2 + 2; %>
	    <% } %>
	</div>
</body>
</html>