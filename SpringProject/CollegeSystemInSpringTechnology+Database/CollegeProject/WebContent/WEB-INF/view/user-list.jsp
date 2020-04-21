<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>User List</title>
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

	<div class="container-fluid">
		<div align="left" class="table-responsive">
			<table class="table table-bordered"">
				<thead class="thead-dark">
					<tr>
						<th>User Id</th>
						<th>Role Id</th>
						<th>Lock</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Username</th>
						<th>Mobile</th>
						<th>Gender</th>
						<th>DOB</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				</tbody>
				<c:forEach var="tempUser" items="${user}">
					<c:url var="updateLink" value="/user/userFormForUpdate">
						<c:param name="user" value="${tempUser.userId}" />
					</c:url>
					<c:url var="deleteLink" value="/user/user-delete">
						<c:param name="user" value="${tempUser.userId}" />
					</c:url>
					<tr>
						<td>${tempUser.userId}</td>
						<td>${tempUser.roleId}</td>
						<td>${tempUser.lock}</td>
						<td>${tempUser.firstName}</td>
						<td>${tempUser.lastName}</td>
						<td>${tempUser.login}</td>
						<td>${tempUser.mobile}</td>
						<td>${tempUser.gender}</td>
						<td>${tempUser.dob}</td>
						<td><a href="${updateLink}" class="btn btn-primary">Update</a></td>
						<td><a href="${deleteLink}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>