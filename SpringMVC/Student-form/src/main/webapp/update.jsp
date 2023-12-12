<%-- <%@page import="com.jsp.sf.entity.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Student student=(Student)request.getAttribute("student");
%>
<form action="updating" method="post">
		id:<input name="id" type="number" value="<%=student.getStudent_Id() %> "readonly="readonly" >
		<br>
		<h1><%=student.getStudent_Id() %></h1>
		roll num :<input name="roll_no" type="number" value="<%=student.getRoll_no()%> " > <br>
		name: <input name="student_Name" type="text" value="<%=student.getStudent_Name()%> "><br>
	loc:	<input name="location" type="text" value="<%=student.getLocation() %> "><br>
		father: <input name="father_Name" type="text" value="<%=student.getFather_Name() %> "><br>
		gender : <input name="gender" type="text" value="<%=student.getGender() %> "><br>
		<input type="submit" name="SUBMIT">
	</form>
</body>
</html> --%>
<%@page import="com.jsp.sf.entity.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
</head>
<body>
    <% 
        Student student = (Student) request.getAttribute("student");
    %>
    <form action="updating" method="post">
        Id: <input name="id" type="number" value="<%= student.getStudent_Id() %>" readonly="readonly"><br>
        Roll Number: <input name="roll_no" type="text" value="<%= student.getRoll_no() %>"><br>
        Name: <input name="student_Name" type="text" value="<%= student.getStudent_Name() %>"><br>
        Location: <input name="location" type="text" value="<%= student.getLocation() %>"><br>
        Father's Name: <input name="father_Name" type="text" value="<%= student.getFather_Name() %>"><br>
        Gender: <input name="gender" type="text" value="<%= student.getGender() %>"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
