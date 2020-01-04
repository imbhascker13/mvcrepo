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
	<form action="/addclass" method="post">
		<div class="container text" style="border: 1px solid black">



			<div class="form-group">
				<label for="classSection">ClassSection</label> <input type="text"
					class="form-control" id="classSection"
					placeholder="Enter class Name" name="classSection">

			</div>

			<div class="form-group">
				<label for="classTeacherName">ClassTeacherName</label> <input
					type="text" class="form-control" id="classTeacherName"
					placeholder="Enter teacher price" name="classTeacherName">

			</div>

			<div class="form-group">
				<label for="noOfStudents">NoOfStudents</label> <input type="text"
					class="form-control" id="noOfStudents"
					placeholder="Enter no of students" name="noOfStudents">

			</div>

			<div class="button">
				<button type="submit" class="btn btn-primary" value="submit">Submit</button>

			</div>
		</div>
	</form>
	<script>
		$('form').validate({

			rules : {
				
				classSection : {
					required : true,
					lettersonly : true,
					maxlength:1
				},

				classTeacherName : {
					required : true,
					lettersonly : true,
					minlength : 8
				},

				noOfStudents : {
					required : true,
					number : true,
					range:[1,3]
				}
				
				
			}
		});
	</script>

</body>
</html>