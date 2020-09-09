<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<c:import url="/WEB-INF/jsp/header.jsp" />

		<h4>Setores</h4>
		<a href="setor" class="btn btn-success">Adicionar</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>nome</th>
					<th>Descrição</th>
					<th>ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="setor" items="${listaSetor}">
					<tr>
						<td>${setor.id}</td>
						<td>${setor.nome}</td>
						<td>${setor.descricao}</td>
						<td><a href="/setor/excluir/${setor.id}">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>