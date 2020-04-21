<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>College Application - Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>

<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="index.jsp">College
					System</a></li>
		</ul>
	</nav>
	<br>
	<div class="container">
		<center>
			<h1>College System In Spring Technology</h1>
		</center>
		<h2>Login</h2>
		<c:if test="${err!=null}">
			<p class="error">${err}</p>
		</c:if>
		<c:if test="${param.act eq 'reg'}">
			<p class="success">User created Successfully! Kindly Login.</p>
		</c:if>
		<c:if test="${param.act eq 'succ'}">
			<p class="success">User created Successfully! Kindly Login.</p>
		</c:if>
		<s:url var="url_login" value="/login"></s:url>
		<f:form action="${url_login}" modelAttribute="command">
			<div class="form-group">
				<label>Username</label>
				<f:input path="login" class="form-control" />
			</div>
			<div class="form-group">
				<label>Password</label>
				<f:password path="password" class="form-control" />
			</div>
			<button class="btn btn-primary">Login</button>
			<button type="reset" class="btn btn-danger">Reset</button>
			</table>
		</f:form><br>
		<div>
			<table class="table border">
				<tr>
					<th>Id</th>
					<th>Role</th>
				</tr>
				<tr>
					<td>1</td>
					<td>Admin Role</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Students Role</td>
				</tr>
				<tr>
					<td>5</td>
					<td>College Role</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>