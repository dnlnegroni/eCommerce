<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
	<title>Crea Ordine</title>
    
    <!-- Javascript -->
    <script type="text/javascript">
    
    </script>
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
						<a href="#"> Prodotti nel carrello: ${prodottiNelCarrello}</a>
					</li>
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
	<div class="container">
		<h1>Catalogo Prodotti</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>
						NomeProdotto
					</th>
					<th>
						Costo
					</th>
					<th>
						Quantita In magazzino
					</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="prodotto" items="${products}">
					<tr>
						<td>
							<a href="<c:url value="/controller/product.get?id=${prodotto.id}" />">
								${prodotto.nome}
							</a>
						</td>
						<td>${prodotto.costo}</td>
						<td>${prodotto.quantita}</td>
						<td>
							<a class="btn btn-default" href="<c:url value="/controller/product2.get?id=${prodotto.id}" />" role="button">Aggiungi al carrello</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
	<a class="btn btn-default" href="<c:url value="/controller/ordine.dettaglio" />" role="button">Dettaglio Ordine</a>
</body>
</html>