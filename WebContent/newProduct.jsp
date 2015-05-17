<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<title>New Product</title>
</head>
<body>
	<form action="<c:url value="/controller/product.create" />" method="get">
	<div>Name: <input type="text" name="nome" value="${param.nome}"/> ${nameErr}</div>
	<div>Code: <input type="text" name="codice" value="${param.codice}"/> ${codeErr}</div>
	<div>Price: <input type="text" name="costo" value="${param.costo}"/> ${priceErr}</div>
	<div>Description: <textarea rows="4" cols="50" name="descrizione">${param.descrizione}</textarea></div>
	<div>Quantita: <input type="text" name="quantita" value="${param.quantita}"/> ${priceErr}</div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>
</body>
</html>
