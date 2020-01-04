<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container text" style="border: 1px solid black">
		<form action="getstudentdetails" method="get" id='theForm'>

			<select id="classSection" name="classSection"
				value='${class1Dto.classSection}'
				onchange="(()=>{document.getElementById('theForm').submit()})()">
				<option value=""></option>
				<option value="A">A</option>
				<option value="B">B</option>
				<option value="C">C</option>
			</select> <br>

			<div class="button">
				<button type="submit" class="btn btn-primary" value="submit">Submit</button>

			</div>
		</form>
	</div>
	<h1>STUDENTSDETAILS</h1>

	<table border="1" width="70%" cellpadding="2">

		<tr>
			<td>StudentName</td>
			<td>StudentDob</td>
			<td>StudentAge</td>
			<td>ClassSection</td>
		</tr>

		<c:forEach var="student" items="${class1Dto.getStudentDto()}">

			<tr>

				<td>${student.studentName}</td>
				<td>${student.studentDob}</td>
				<td>${student.studentAge}</td>
				<td>${class1Dto.classSection}</td>


			</tr>
		</c:forEach>

	</table>


	<a href="getsections">back</a>


</body>
</html>