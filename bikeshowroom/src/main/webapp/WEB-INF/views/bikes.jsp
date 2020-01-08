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
	<h1>ASSIGN BIKES TO BRAND</h1>
	<form action="/assignBikes" method="post"
	onsubmit="return validate()" id="form">
		<div class="container text" style="border: 1px solid block"
			align="center">
			<label for="brandName">Brand Name :</label> 
			<select name="brandId" id="brandId">
				<c:forEach items="${brands}" var="brand">
					<option value="${brand.brandId}">${brand.brandName}</option>
				</c:forEach>
			</select>
			<div class="form-group">
				<label for="bikeName">Bike Name : </label> 
				<input type="text"
					class="form-control" id="bikeName"
					placeholder="Enter Bike Name " name="bikeName">
			</div>
			<!-- <div class="form-group">
				<label for="cardType">Type : </label> <select class="form-control"
					id="cardType" name="cardType">
					<option value="visa">VISA</option>
					<option value="master">MASTER</option>
				</select>
			</div> -->
			<div class="form-group">
				<label for="bikePrice">Bike Price : </label> <input type="number"
					class="form-control" id="bikePrice" placeholder="bikePrice" name="bikePrice">
			</div> 

			<div class="button">
				<a href="/message"><button type="submit"
						class="btn btn-primary">assign</button></a>
				<a href="/home"><button
						type="button" class="btn btn-primary">Back to home</button></a>
			</div>
		</div>
	</form>

</body>
 <script>
	/* $.validator.addMethod("expiryDate", function(value, element) {
		var curDate = new Date();
		var inputDate = new Date(value);
		if (inputDate >= curDate)
			return true;
		return false;
	}, "Invalid Date!"); */
	$.validator.addMethod("alphabetsndigits", function(value, element) {
		return this.optional(element) || /^[a-zA-Z0-9 ]*$/.test(value);
	});
	$('form').validate({
		rules : {
			bikeName : {
				required : true,
				minlength : 4,
				alphabetsndigits: true
			},
			bikePrice : {
				required : true,
				range : [ 50000, 100000000 ]
			}
			
		}
	});
	</script>
	</html>