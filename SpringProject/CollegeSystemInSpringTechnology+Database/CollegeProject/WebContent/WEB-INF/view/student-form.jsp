<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Student Form</title>
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
		<h2>Student Form</h2>
		<form:form action="studentRegistration" modelAttribute="student"
			method="post">
			<form:hidden path="studentId" />
			<div class="form-group">
				<label>College Id:</label>
				<form:input path="collegeId" class="form-control"/>
				<form:errors path="collegeId" cssClass="error" />
			</div>
			<div class="form-group">
				<label>First Name:</label>
				<form:input path="firstName" class="form-control"/>
				<form:errors path="firstName" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Last Name:</label>
				<form:input path="lastName" class="form-control"/>
				<form:errors path="lastName" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Mobile:</label>
				<form:input path="mobile" class="form-control"/>
				<form:errors path="mobile" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Email:</label>
				<form:input path="email" class="form-control"/>
				<form:errors path="email" cssClass="error" />
			</div>
			<div class="form-group">
				<label>College Name:</label>
				<form:input path="collegeName" class="form-control"/>
				<form:errors path="collegeName" cssClass="error" />
			</div>
			<div class="form-group">
				<label>DOB:</label>
				<form:input path="dob" type="date" class="form-control"/>
				<form:errors path="dob" cssClass="error" />
			</div>
			<input type="submit" value="submit" class="btn btn-primary" />
			</table>
		</form:form>
	</div>
</body>
</html>

