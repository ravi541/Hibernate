<%@page import="com.ravi.userfactory.UserServiceFactory"%>
<%@page import="com.ravi.userservice.UserService"%>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register.jsp</title>
</head>
<body>
<%!
String uname;
String pwd;
String umob;
String status="";
String message="";
UserService userservice;
%>
 <%
uname=request.getParameter("uname");
pwd=request.getParameter("pwd");
umob=request.getParameter("umob");
userservice=UserServiceFactory.getuserservice();
status=userservice.register(uname, pwd, umob);
if(status.equals("success"))
{
	message="User registered succesfully";
	
}
if(status.equals("failure"))
{
	message="User registered failed";
	
}
if(status.equals("existed"))
{
	message="User already exists";
	
}

request.setAttribute("status_message",message);
%>
<jsp:forward page="Status.jsp"></jsp:forward>

</body>
</html>