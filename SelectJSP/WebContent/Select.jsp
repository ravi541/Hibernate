<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
String tname=request.getParameter("tname");
%>
<%
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
	
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
Statement st=con.createStatement();

ResultSet rs=st.executeQuery("Select * from "+tname);
ResultSetMetaData rsmd=rs.getMetaData();
for(int i=1;i<=rsmd.getColumnCount();i++)
{
	out.print(rsmd.getColumnName(i)+"\t");
	 
}
out.println();
while(rs.next())
{
	 
	 for(int i=1;i<=rsmd.getColumnCount();i++)
	 {
		 out.print(rs.getString(i)+"\t");
	 }
	 out.println();
}

}
catch(Exception e)
{
	out.println(e);
}

%>
</body>
</html>