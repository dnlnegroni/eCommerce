<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/template.css" />" />
	<title>eCommerce</title>
</head>
<body>
	<ul>
		<li>
			<a href="<c:url value="/controller/product.list" />">List all product</a>
		</li>
		<li>
			<a href="<c:url value="/loginAmministratore.jsp" />">login Amministratore</a>
		</li>
		<li>
			<a href="<c:url value="/loginCliente.jsp" />">login Cliente</a>
		</li>
	</ul>
</body>
</html>