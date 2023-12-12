<%@page import="com.jsp.ei.entity.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GET-ALL-USERS</title>
</head>
<body>
	<form action="get" method="get"></form>
	<%
	List<Employee> l = (ArrayList<Employee>) request.getAttribute("list");
	%>
	<%
	if (l != null) {
	%>
	<table border="2px solid black">
		<tr>
			<th>Employee_ID</th>
			<th>Employee_Name</th>
			<th>Employee_Sal</th>
			<th>DELETE EMPLOYEE</th>
			<th>UPDATE EMPLOYEE</th>
		</tr>
		<%
		for (Employee employee : l) {
		%>

		<%-- <%="User ID: " + user.getId() + " , Username: " + user.getName() + " , UserEmail: " + user.getEmail()
		+ " , UserPassword: " + user.getPassward()%> --%>
		<tr>
			<td><%=employee.getEmp_ID()%></td>
			<td><%=employee.getEmp_Name()%></td>
			<td><%=employee.getEmp_Sal()%></td>
			<td><a href="delete?id=<%=employee.getEmp_ID()%>">DELETE</a></td>
			<td><a href="update?id=<%=employee.getEmp_ID()%>">UPDATE</a></td>



		</tr>
		<%
		}
		%>
		<%
		} else {
		%>
		<%="USER NOT FOUND "%>
		<%
		}
		%>

	</table>

</body>
</html>