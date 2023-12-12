<%@page import="com.jsp.sf.entity.Student"%>
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
	<form></form>
	<%
	List<Student> student = (ArrayList<Student>) request.getAttribute("list");
	%>
	
	<%
	if (student != null) {
	%>
	<table border="2px solid black">
		<tr>
			<th>Student_RollNo</th>
			<th>Student_Name</th>
			<th>Student_location</th>
			<th>Student_father_name</th>
			<th>Student_Gender</th>
			<th>Update_Student</th>
			<th>Delete_Student</th>
			<th>Get_Student_Details</th>
		</tr>
		<%
		for (Student students : student) {
		%>

		
		<tr>
			<td><%=students.getRoll_no()%></td>
			<td><%=students.getStudent_Name()%></td>
			<td><%=students.getLocation()%></td>
			<td><%=students.getFather_Name()%></td>
			<td><%=students.getGender()%></td>
			<td><a href="delete?id=<%=students.getStudent_Id()%>">DELETE</a></td>
			<td><a href="update?id=<%=students.getStudent_Id()%>">UPDATE</a></td>
			<td><a href="getbyid.jsp?id=<%=students.getStudent_Id()%>">GET_DETAILS</a></td>
			
		</tr>
		<%
		}
		%>
		<%
		} else {
		%>
		<%="USERS NOT FOUND "%>
		<%
		}
		%>

	</table>

</body>
</html>