<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Natural Beauties by Free Css Templates</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="header">
	<div id="logo">
		<h1><jsp:include page="header.html"/></h1>
		
  </div>
	<div id="menu">
		<ul>
		 <jsp:include page="Adminoptions1.html"/>
        </ul>
	</div>
</div>

<div id="content">
  <div id="sidebar1">
		<div id="archives" class="boxed">
			Welcome to the Administrator<br/><br/><%=(String)session.getAttribute("user") %>
			<div class="content">
				<ul><li>
				<form action="ProcessAddApplicationDetails.jsp">
                <table width="200" border="1">
  <tr>
    <td>University</td>
    <td><input name="university" type="text" /></td>
  </tr>
  <tr>
    <td>ApplicationCourses</td>
    <td><input name="course" type="text" /></td>
  </tr>
  <tr>
    <td>startdate</td>
    <td><input name="startdate" type="text" /></td>
  </tr>
  <tr>
    <td>Latedate</td>
    <td><input name="lastdate" type="text" /></td>
  </tr>
</table>
</form>
				  </li>
				</ul>
		  </div>
	  </div>
		</div>
</div>
<div id="footer"></div>
</body>
</html>
