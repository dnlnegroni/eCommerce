<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<title>indexAmministratore</title>
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
		<h1>Lista Ordini</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>
						IdOrdine
					</th>
					<th>
						Data Apertura
					</th>
					<th>
						Data Chiusura
					</th>
					<th>
						Data Evasione
					</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ordine" items="${ordini}">
					<tr>
						<td>
							${ordine.id}
						</td>
						<td>
							<fmt:formatDate value="${ordine.dataApertura}" pattern="dd/MM/yyyy" />
						</td>
						<td>
							<fmt:formatDate value="${ordine.dataChiusura}" pattern="dd/MM/yyyy" />
						</td>
						<td>
							<fmt:formatDate value="${ordine.dataEvasione}" pattern="dd/MM/yyyy" />
						</td>
						<td>
							<a class="btn btn-default" href="<c:url value="/controller/ordine.evadi?id=${ordine.id}" />" role="button">Evadi Ordine</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>