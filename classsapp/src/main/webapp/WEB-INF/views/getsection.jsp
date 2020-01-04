<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="container text" style="border: 1px solid black">
		<form action="addstudent" method="post">

			<select id="classSection" name="classSection">
				<option value="A">A</option>
				<option value="B">B</option>
				<option value="C">C</option>
			</select> <br>


			<div class="form-group">
				<label for="studentName">StudentName</label> <input type="text"
					class="form-control" id="studentName"
					placeholder="Enter student Name" name="studentName">

			</div>


			<div class="form-group">
				<label for="studentDob">StudentDob</label> <input type="date"
					class="form-control" id="studentDob"
					placeholder="Enter student dob" name="studentDob">

			</div>

			<div class="form-group">
				<label for="studentAge">StudentAge</label> <input type="text"
					class="form-control" id="studentAge"
					placeholder="Enter student age" name="studentAge">

			</div>

			<div class="button">
				<button type="submit" class="btn btn-primary" value="submit">Submit</button>

			</div>
		</form>
	</div>

	<script>
		$.validator.addMethod("studentDob", function(value, element) {
			var curDate = new Date();
			var inputDate = new Date(value);
			if (inputDate > curDate)
				return true;
			return false;
		}, "Invalid Date!");
		$('form').validate({

			rules : {

				studentName : {
					required : true,
					lettersonly : true,
					minlength : 8
				},

				studentAge : {
					required : true,
					digits : true,
				},
				studentDob : {
					required : true,
					studentDob : true
				}

			}
		});
	</script>

</body>
</html>