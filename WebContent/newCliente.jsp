<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<title>New Cliente</title>
</head>
<body>
	<form action="<c:url value="/controller/cliente.create" />" method="get">
	<div>Name: <input type="text" name="nome" value="${param.nome}"/> ${nomeErr}</div>
	<div>Cognome: <input type="text" name="cognome" value="${param.cognome}"/> ${cognomeErr}</div>
	<div>Indirizzo: <input type="text" name="indirizzo" value="${param.indirizzo}"/> ${indirizzolErr}</div>
	<div>Email: <input type="text" name="email" value="${param.email}"/> ${emailErr}</div>
	<div>Password: <input type="text" name="password" value="${param.password}"/>${passwordErr}</div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>
</body>
</html>
