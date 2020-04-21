<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>College Form</title>
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
		<h2>College Form</h2>
		<form:form action="collegeRegistration" modelAttribute="college"
			method="post">
			<form:hidden path="id" />
			<div class="form-group">
				<label>College Name:</label>
				<form:input path="name" class="form-control" />
				<form:errors path="name" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Address:</label>
				<form:input path="address" class="form-control" />
				<form:errors path="address" cssClass="error" />
			</div>
			<div class="form-group">
				<label>State:</label>
				<form:input path="state" class="form-control" />
				<form:errors path="state" cssClass="error" />
			</div>
			<div class="form-group">
				<label>City:</label>
				<form:input path="city" class="form-control" />
				<form:errors path="city" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Phone No.:</label>
				<form:input path="phone" class="form-control" />
				<form:errors path="phone" cssClass="error" />
			</div>

			<input type="submit" value="submit" class="btn btn-primary" />


		</form:form>
	</div>
</body>
</html>

