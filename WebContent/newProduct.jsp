<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	<title>new Product</title>
</head>
<body>
	<h1 align="center">
		eCommerce <br /> <small> Progetto Siw </small>
	</h1>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Mobile View -->
			<div class="navbar-header">
				<a class="navbar-brand" href="<c:url value="/indexCliente.jsp" />">eCommerce</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li>	
						<a href="#"> Bentornato, ${amministratore.nome} ${amministratore.cognome}	</a>
					</li>
					<li>
						<a href="<c:url value="/controller/amministratore.logout"/>">
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
		<form id="createProduct" action="<c:url value="/controller/product.create" />" role="form" data-toggle="validator" method="get">
			<div class="form-group">
				Name: 
				<input type="text" name="nome" class="form-control" value="${param.nome}" required/>
			</div>
			<div class="form-group">
				Code: 
				<input type="text" name="codice" class="form-control" value="${param.codice}" required/>
			</div>
			<div class="form-group">
				Price: 
				<input type="text" name="costo" class="form-control" value="${param.costo}" required/> ${priceErr}
			</div>
			<div class="form-group">
			 	<label class="control-label">Quantita</label>
				<input type="text" name="quantita" id = "quantita" class="form-control" value="${param.quantita}" required/>
			</div>
			<div class="form-group">
				Description: 
				<textarea rows="4" cols="50" class="form-control" name="descrizione">${param.descrizione}</textarea>
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-default" name="sumbit" value="invia" />
			</div>
		</form>
	</div>
</body>
</html>
