<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Required meta tags -->
<meta charset="utf-8">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<main role="main"> <!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">Hello, world!</h1>
			<p>Bienvenido al formulario</p>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn
					more &raquo;</a>
			</p>
		</div>
	</div>
	<form:form modelAttribute="persona" method="POST" action="formulario">
		<div class="form-group">
			<label for="nombrePersona">Nombre</label> 
			<form:input  path="nombre" type="text" class="form-control" id="nombrePersona"
				placeholder="Nombre"/>
		</div>
		<div class="form-group">
			<label for="apellidosPersona">Apellidos</label> 
			<form:input  path="apellidos" type="text" class="form-control" id="apellidosPersona"
				placeholder="Apellidos"/>
		</div>
		<div class="form-group">
			<label for="sexoPersona">Género</label> 
			<form:select  path="sexo" class="form-control" id="sexoPersona"
			items="${generos}"/>
		</div>
<!-- 		<fieldset> -->
<!-- 			<label>Generos</label> -->
<%-- 			<c:forEach items="${generos}" var="g"> --%>
<!-- 				<input type="radio" name="elRadio"> -->
<%-- 				<c:out value="${g}"></c:out></> --%>
<%-- 			</c:forEach> --%>
<!-- 		</fieldset> -->
		<button type="submit" class="btn btn-primary">Enviar</button>
	</form:form>
	</main>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>