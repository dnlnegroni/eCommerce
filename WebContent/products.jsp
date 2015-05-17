<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Product</title>
</head>
<body>
<h1>Products</h1>
<table>
	<tr>
		<th>Name</th><th>Price</th>
	</tr>
	<c:forEach var="prodotto" items="${products}">
		<tr><td><a href="<c:url value="/controller/product.get?id=${prodotto.id}" />">${prodotto.nome}</a></td><td>${prodotto.costo}</td></tr>
	</c:forEach>
</table>
</body>
</html>