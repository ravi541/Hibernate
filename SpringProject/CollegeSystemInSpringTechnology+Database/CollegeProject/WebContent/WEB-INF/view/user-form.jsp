<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>User Form</title>
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
		<h2>User Form</h2>
		<form:form action="userRegistration" modelAttribute="user"
			method="post">
			<form:hidden path="userId" />
			<div class="form-group">
				<label>Role Id:</label>
				<form:input path="roleId" class="form-control"/>
				<form:errors path="roleId" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Lock:</label>
				<form:input path="lock" class="form-control"/>
				<form:errors path="lock" cssClass="error" />
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
				<label>Username:</label>
				<form:input path="login" class="form-control"/>
				<form:errors path="login" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Password:</label>
				<form:input path="password" class="form-control"/>
				<form:errors path="password" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Confirm Password:</label>
				<form:input path="confirmPassword" class="form-control"/>
				<form:errors path="confirmPassword" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Mobile:</label>
				<form:input path="mobile" class="form-control"/>
				<form:errors path="mobile" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Gender:</label>
				<form:input path="gender" class="form-control"/>
				<form:errors path="gender" cssClass="error" />
			</div>
			<div class="form-group">
				<label>dob:</label>
				<form:input path="dob" type="date" class="form-control"/>
				<form:errors path="dob" cssClass="error" />
			</div>
			<input type="submit" value="submit" class="btn btn-primary" />
		</form:form>
	</div>
</body>
</html>

