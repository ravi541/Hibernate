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
<style type="text/css">
<!--
.style2 {color: #000000}
.style3 {color: #FF33FF}
-->
</style>
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
                <%@ page import="com.dts.uas.model.*"%>
  <%@ page import="com.dts.uas.dao.*"%>
  <%@ page import="com.dts.core.util.*" %>
  <%@ page import="java.util.*" %>	
  
  <%
  String collegename=request.getParameter("collegename");
  Courses acourses=new Courses();
  acourses.setCollegename(collegename);
  CoursesDAO acoursedao=new CoursesDAO();
  CoreHash acorehash=acoursedao.viewCourses(acourses);
  Enumeration aenumeration=acorehash.keys();
 %>
 <table width="490" border="1"><tr bgcolor="#999900"><td width="86"><span class="style2">CollegeName</span></td>
 <td width="79"><span class="style2">Course</span></td>
 <td width="71"><span class="style2">Branch</span></td>
 <td width="76"><span class="style2">Noofseats</span></td>
 <td width="76"><span class="style2">BCSeats</span></td>
 <td width="74"><span class="style2">SCseats</span></td>
 </tr>
 <% while(aenumeration.hasMoreElements())
  {
  Integer i1=(Integer)aenumeration.nextElement();
  Courses acourses1=(Courses)acorehash.get(i1);
  String course=acourses1.getCourses();
  String branch=acourses1.getBranch();
  String noofseats=acourses1.getNoofseats();
  String bcseats=acourses1.getBcseats();
  String scseats=acourses1.getScseats();
  
  %>
  <tr><td><span class="style3"><%=collegename%></span></td><td><span class="style3"><%=course %></span></td><td><span class="style3"><%=branch %></span></td><td><span class="style3"><%=noofseats%></span></td><td><span class="style3"><%=bcseats %></span></td><td><span class="style3"><%=scseats %></span></td></tr>  
  <%} %>
  </table>
  
                
				  </li>
				</ul>
		  </div>
	  </div>
		</div>
</div>
<div id="footer"></div>
</body>
</html>
