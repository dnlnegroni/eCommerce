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
	<title>LoginCliente</title>
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
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
							Login
							<span class="caret"></span>
						</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<c:url value="/loginCliente.jsp" />">Cliente</a></li>
							<li class="divider"></li>
							<li><a href="<c:url value="/loginAmministratore.jsp" />">Amministratore</a></li>
						</ul>
					</li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<div align="center" style="border: 1px">
		<form class="form-inline" action="<c:url value="/controller/cliente.logIn" />" method="get">
			<div class="form-group">
				<label class="sr-only">Email address</label>
				<input type="text" class="form-control" placeholder="Email" name="email" value="${param.email}" required>
				<label class="sr-only">Password</label> 
				<input type="password" class="form-control" name="password" value="${param.password}" placeholder="Password" required>	
			</div>
			<button type="submit" name="submit" value="invia" class="btn btn-default">Sign in</button>
		</form>
		<br/>
		${loginFail}
	</div>
</body>
</html>
