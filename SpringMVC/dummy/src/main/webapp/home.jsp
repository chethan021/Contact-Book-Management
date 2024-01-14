<%@page import="com.jsp.contactbook.entity.*"%>
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
	User user = (User) session.getAttribute("user");
	Contact contact=(Contact)session.getAttribute("contact");
	if (user != null) {
	%>

	<A href="add-contact">Add-Contact</A>
	<br>
	<a href="update-user?userId=<%=user.getUserId()%>">Update-user</a>
	<br>
	<a href="delete-user?userId=<%=user.getUserId()%>">Delete-user</a>
	<br>
	<a href="update-contact?contactId=<%=1%>">Update-Contact</a>
	<%
	} else {
	String error = (String) request.getAttribute("error");
	if (error == null) {
		error = "User is not authemticated!! Pls Login";
	}
	%>
	<h3><%=error%></h3>
	<br>
	<a href="add-user">Register</a>
	<br>
	<a href="login">login</a>

	<%
	}
	%>

</body>
</html>