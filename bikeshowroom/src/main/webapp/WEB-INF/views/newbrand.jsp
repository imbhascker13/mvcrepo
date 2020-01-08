<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"></script>

<title>Home page</title>
</head>
<body>
	<h1>ASSIGN BRAND TO DEALER</h1>
	<form action="/assignBrand" method="post">
		<div class="container text" style="border: 1px solid block"
			align="center">
			<label for="brandName">Brand Name :</label> 
			<select name="brandId" id="brandId">
				<c:forEach items="${brands}" var="brand">
					<option value="${brand.brandId}">${brand.brandName}</option>
				</c:forEach>
			</select>
			<label for="dealerName">Dealer Name :</label> 
			<select name="dealerId" id="dealerId">
				<c:forEach items="${dealers}" var="dealer">
					<option value="${dealer.dealerId}">${dealer.dealerName}</option>
				</c:forEach>
			</select>
			<!-- <div class="form-group">
				<label for="dcNumber">Debit Card Number : </label> <input
					type="number" class="form-control" id="dcNumber"
					placeholder="Enter Debit Card number" name="dcNumber">
			</div>
			<div class="form-group">
				<label for="expiryDate">Expiry Date : </label> <input type="date"
					class="form-control" id="expiryDate"
					placeholder="Enter Expiry Date " name="expiryDate">
			</div>
			<div class="form-group">
				<label for="cardType">Type : </label> <select class="form-control"
					id="cardType" name="cardType">
					<option value="visa">VISA</option>
					<option value="master">MASTER</option>
				</select>
			</div>
			<div class="form-group">
				<label for="amount">Amount : </label> <input type="number"
					class="form-control" id="amount" placeholder="amount" name="amount">
			</div> -->

			<div class="button">
				<a href="/message"><button type="submit"
						class="btn btn-primary">assign</button></a>
				<a href="/home"><button
						type="button" class="btn btn-primary">Back to home</button></a>
			</div>
		</div>
	</form>

</body>
<!-- <script>
	$.validator.addMethod("expiryDate", function(value, element) {
		var curDate = new Date();
		var inputDate = new Date(value);
		if (inputDate >= curDate)
			return true;
		return false;
	}, "Invalid Date!");
	$('form').validate({
		rules : {
			dcNumber : {
				required : true,
				minlength : 16,
				maxlength : 16,
			},
			amount : {
				required : true,
				min : 50000,
			},
			expiryDate : {
				required : true,
				expiryDate : true,
			}
		}
	});
</script> -->
</html>