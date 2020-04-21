<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Student List</title>
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
		<div align="left" class="table-responsive">
			<table class="table table-bordered"">
				<thead class="thead-dark">
					<tr>
						<th>Student Id</th>
						<th>College Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Mobile</th>
						<th>Email</th>
						<th>College Name</th>
						<th>DOB</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tempStudent" items="${studentList}">
						<c:url var="updateLink" value="/student/studentFormForUpdate">
							<c:param name="student" value="${tempStudent.studentId}" />
						</c:url>
						<c:url var="deleteLink" value="/student/student-delete">
							<c:param name="student" value="${tempStudent.studentId}" />
						</c:url>
						<tr>
							<td>${tempStudent.studentId}</td>
							<td>${tempStudent.collegeId}</td>
							<td>${tempStudent.firstName}</td>
							<td>${tempStudent.lastName}</td>
							<td>${tempStudent.mobile}</td>
							<td>${tempStudent.email}</td>
							<td>${tempStudent.collegeName}</td>
							<td>${tempStudent.dob}</td>
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