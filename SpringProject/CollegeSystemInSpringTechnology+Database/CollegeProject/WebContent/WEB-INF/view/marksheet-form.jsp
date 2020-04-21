<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Marksheet Form</title>
<style>
.error {
	color: red
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

	<jsp:include page="menu.jsp"></jsp:include>
	<br>

	<div class="container">
		<h2>Marksheet Form</h2>
		<form:form action="marksheetRegistration" modelAttribute="marksheet"
			method="post">
			<form:hidden path="id" />
			<div class="form-group">
					<label>Roll No:</label>
					<form:input path="rollno" class="form-control"/>
					<form:errors path="rollno" cssClass="error" />
				</div>
				<div class="form-group">
					<label>Name:</label>
					<form:input path="name" class="form-control"/>
					<form:errors path="name" cssClass="error" />
				</div>
				<div class="form-group">
					<label>Physics:</label>
					<form:input path="physics" class="form-control"/>
					<form:errors path="physics" cssClass="error" />
				</div>
				<div class="form-group">
					<label>Chemistry:</label>
					<form:input path="chemistry" class="form-control"/>
					<form:errors path="chemistry" cssClass="error" />
				</div>
				<div class="form-group">
					<label>Maths:</label>
					<form:input path="maths" class="form-control"/>
					<form:errors path="maths" cssClass="error" />
				</div>
				<div class="form-group">
					<label>Student Id:</label>
					<form:input path="studentId" class="form-control"/>
					<form:errors path="studentId" cssClass="error" />
				</div>
				
					<input type="submit" value="submit" class="btn btn-primary"/>
				
			</table>
		</form:form>
	</div>
</body>
</html>

