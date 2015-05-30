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
	<title>InserimentoFornitore</title>
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
					<li><a href="<c:url value="/newCliente.jsp" />">Non sei registrato?</a></li>
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
	<div align="center" style="border: 1px; border-color: black">
		<form class="form-inline" action="<c:url value="/controller/fornitore.create" />" method="get">
			<table >
				<tr>
					<td>
						Piva: <input type="text" class="form-control" name="partitaIva" value="${param.partitaIva}" required/>
					</td>
				</tr>
				<tr>
					<td>
						Telefono: <input type="text" class="form-control" name="telefono" value="${param.telefono}" required/> ${telErr}
					</td>
				</tr>
				<tr>
					<td>
						Indirizzo: <input type="text" class="form-control" name="indirizzo" value="${param.indirizzo}" required/>
					</td>
				</tr>
				<tr>
					<td>
						Email: <input type="text" class="form-control" name="email" value="${param.email}" required/>
					</td>
				</tr>
				<tr align="right">
					<td>
						<button type="submit" name="submit" value="invia" class="btn btn-default">Inserisci Fornitore</button>
					</td>
				</tr>
				<tr/>
				<tr align="right">
					<td class="input_scoreMedium">
						<a class="btn btn-default" href="<c:url value="/controller/prodotto.inserisci" />" role="button">Conferma Inserimento Prodotto</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
