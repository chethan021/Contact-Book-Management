
<%@page import="com.jsp.ei.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Employee emp=(Employee)request.getAttribute("list");
	
	%>
	<form action="updating" method="post">
		<input name="id" type="number"
			value="<%=emp.getEmp_ID() %> " >
		<input name="ame" type="text" value="<%=emp.getEmp_Name() %> ">
		<input name="empSal" type="number" value="<%=emp.getEmp_Sal() %> ">
		<input type="submit" name="SUBMIT">
	</form>
</body>
</html>