<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<title>Lista Prodotti</title>
	
	<!-- Import dei css -->
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<!-- <link rel="stylesheet" href="bootstrap/css/bootstrap.css.map">
	<link rel="stylesheet" href="bootstrap/css/bootstrap.css" >
	<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css" >
	<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">  -->
    <!-- <link rel="stylesheet" type="text/css" href="<c:url value="/css/template.css" />" />  -->
    
    <!-- Javascript -->
    <script type="text/javascript">
    
    </script>
</head>
<body>
	<div class="container">
		<h1>Products</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>
						NomeProdotto
					</th>
					<th>
						Costo
					</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="prodotto" items="${products}">
					<tr>
						<td>
							<a href="<c:url value="/controller/product.get?id=${prodotto.id}" />">
								${prodotto.nome}
							</a>
						</td>
						<td>${prodotto.costo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>