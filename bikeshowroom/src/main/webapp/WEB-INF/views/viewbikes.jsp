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
	<form action="/getBikes" method="post">
		<div class="container text" style="border: 1px solid block"
			align="center">
			<label for="dealerName">Dealer Name :</label> 
			<select name="dealerId" id="dealerId">
				<c:forEach items="${dealers}" var="brand">
					<option value="${brand.dealerId}">${brand.dealerName}</option>
				</c:forEach>
			</select>
			<div class="button">
				<a href="/getBikes"><button type="submit"
						class="btn btn-primary">GET BIKES</button></a>
				<a href="/"><button
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