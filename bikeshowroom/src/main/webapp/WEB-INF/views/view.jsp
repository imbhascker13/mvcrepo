<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
<body>
	<h1>View Investment Details</h1>
	<hr>
	<%-- <div class="form">
		<form action="/" method="get"></form>
	</div> --%>
	<%--  <c:forEach var="bike" items="${dealers}">
		<label>Dealer Name:${dealer.dealerName }</label> --%>
	<table class="table-active" border="2" width="70%" cellpadding="2">
		<tr>
			<th class="table-success">Brand Name</th>
			<th class="table-success">Investment</th>
			<!-- <th class="table-warning">CARD TYPE</th>
				<th class="table-danger">EXPIRY DATE</th> -->
			<!-- <th class="table-primary">Bike Price</th> -->
			<!-- <th class="table-primary">Age</th> -->
			<!-- <th class="table-success">Update</th> -->

		</tr>
		<c:forEach var="brand" items="${brands}">
			<tr class="info">
				<td>${brand.brandName}</td>
				<td>${brand.investment}</td>
			</tr>
		</c:forEach>


		<%-- <td>${debitCard.expiryDate}</td>
					<td>${debitCard.amount}</td>
					<td>${customer.age}</td>
					<td><a href="/update/${debitCard.debitcardId}">Update</a> --%>



	</table>
	<%-- </c:forEach> --%>
	<a href="/">
		<button>back</button>
	</a>
</body>
</html>