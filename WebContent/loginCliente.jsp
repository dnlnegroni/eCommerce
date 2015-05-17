<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/template.css" />" />
	<title>Login Cliente</title>
</head>
<body>
	<form class="form-inline" action="<c:url value="/controller/cliente.logIn" />" method="get">
		<div class="form-group">
			<label class="sr-only">Email address</label>
			<input type="text" class="form-control" name="email" value="${param.email}" placeholder="Enter email">
		</div>
		<div class="form-group">
			<label class="sr-only">Password</label> 
			<input type="text" class="form-control" name="password" value="${param.password}" placeholder="Password">
		</div>
		<button type="submit" name="submit" value="invia" class="btn btn-default">Sign in</button>
	</form>	
</body>
</html>
