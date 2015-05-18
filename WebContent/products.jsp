<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/bootstrap/css/bootstrap.min.css" />" />
	<script type="text/javascript" src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/jquery/jquery-1.11.3.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/template.css" />" />
	<title>Lista Prodotti</title>
    
    <!-- Javascript -->
    <script type="text/javascript">
    
    </script>
</head>
<body>
	<div class="container">
		<h1>Lista Prodotti</h1>
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