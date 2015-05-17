<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="US-ASCII">
<title>eCommerce</title>
</head>
<body>
	<ul>
		<li>
			<a href="<c:url value="/newProduct.jsp" />">Insert a new product</a>
		</li>
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