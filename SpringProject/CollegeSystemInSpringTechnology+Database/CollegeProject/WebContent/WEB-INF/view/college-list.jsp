<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>College List</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
	<jsp:include page="menu.jsp"></jsp:include>
	<br>

	<div class="container-fluid">
		<div align="left" class="table-responsive">
			<table class="table table-bordered">
				<thead class="thead-dark">
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Address</th>
						<th>State</th>
						<th>City</th>
						<th>Phone</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tempCollege" items="${college}">
						<c:url var="updateLink" value="/college/collegeFormForUpdate">
							<c:param name="college" value="${tempCollege.id}" />
						</c:url>
						<c:url var="deleteLink" value="/college/college-delete">
							<c:param name="college" value="${tempCollege.id}" />
						</c:url>
						<tr>
							<td>${tempCollege.id}</td>
							<td>${tempCollege.name}</td>
							<td>${tempCollege.address}</td>
							<td>${tempCollege.state}</td>
							<td>${tempCollege.city}</td>
							<td>${tempCollege.phone}</td>
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