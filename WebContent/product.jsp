<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
	<meta charset="ISO-8859-1" />
	<script type="text/javascript" src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/bootstrap/js/jquery-ui.js" />"></script>
	<script type="text/javascript" src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
	<link rel="stylesheet" type="text/css" href="<c:url value="/bootstrap/css/bootstrap.min.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/template.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/bootstrap/css/jquery-ui.css" />" />
	<title>Dettaglio Prodotto</title>
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
		<h1>${product.nome} <br/>
			<small>Dettaglio Prodotto</small>
		</h1>
		<div>Codice: ${product.codice}</div>
		<div>Prezzo: ${product.costo}</div>
		<div>Descrizione: ${product.descrizione}</div>
	</div>
</body>
</html>