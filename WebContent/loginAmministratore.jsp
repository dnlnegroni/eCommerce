<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<title>Login Amministratore</title>
</head>
<body>
	<form action="<c:url value="/controller/amministratore.logIn" />" method="get">
	<div>Email: <input type="text" name="email" value="${param.email}"/> </div>
	<div>Password: <input type="text" name="password" value="${param.password}"/> </div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>
</body>
</html>
