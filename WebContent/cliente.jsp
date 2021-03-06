<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<script type="text/javascript" src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/bootstrap/js/jquery-ui.js" />"></script>
	<script type="text/javascript" src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
	<link rel="stylesheet" type="text/css" href="<c:url value="/bootstrap/css/bootstrap.min.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/template.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/bootstrap/css/jquery-ui.css" />" />
<title>Dettaglio Cliente</title>
</head>
<body>
	<h1 align="center">
		eCommerce <br /> <small> Progetto Siw </small>
	</h1>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">eCommerce</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li>	
						<a href="<c:url value="/controller/cliente.get?id=${cliente.id}"/>"> Bentornato, ${cliente.nome} ${cliente.cognome}	</a>
					</li>
					<li>
						<a href="<c:url value="/controller/cliente.logout"/>">
							Logout
						</a>
					</li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<div align="center">
		<h1>${cliente.nome} <br/>
			<small>Dettaglio Cliente</small> 
		</h1>
		<div>Nome: ${cliente.nome}</div>
		<div>Cognome: ${cliente.cognome}</div>
		<div>Indirizzo: ${cliente.indirizzo}</div>
		<div>Email: ${cliente.email}</div>
		<div>
			Data di Nascita: 
			<fmt:formatDate value="${cliente.dataNascita}" pattern="dd/MM/yyyy" />
		</div>
		<div>
			Data di Registrazione: 
			<fmt:formatDate value="${cliente.dataRegistrazione}" pattern="dd/MM/yyyy" />
		</div>
	</div>
</body>
</html>