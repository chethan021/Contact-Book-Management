<%@page import="com.jsp.contactbook.entity.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Dashboard</title>

<style>
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f8f8f8;
	color: #333;
}

.container {
	max-width: 800px;
	margin: 20px auto;
	background-color: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 5px;
	overflow: hidden;
	padding: 20px;
	text-align: center;
}

a {
	text-decoration: none;
	color: #333;
	padding: 8px;
	margin: 5px;
	border: 1px solid #333;
	border-radius: 5px;
	display: inline-block;
}

a:hover {
	background-color: #333;
	color: #fff;
}

h3 {
	color: #ff5722;
}
</style>
</head>
<body>
	<div class="container">
		<%
		User user = (User) session.getAttribute("user");
		Contact contact = (Contact) session.getAttribute("contact");

		if (user != null) {
		%>

		<h3>
			Welcome,
			<%=user.getUserName()%>!
		</h3>
		<p>
			Email:
			<%=user.getUserEmail()%></p>

		<a href="AddContact?uid=<%=user.getUserId()%>">Add Contact</a> <br>
		<%-- <a href="update-user?userId=<%= user.getUserId() %>">Update User</a> <br> --%>
		<a href="delete-user?userId=<%=user.getUserId()%>">Delete User</a> <br>
		<%-- <a href="update-contact?contactId=<%=1%>">Update Contact</a> --%>
		<a href="show-all-contact?">show contact</a>
		<div
			style="position: fixed; bottom:10px; right: 10px;"><A href="logout">Logout</A>
		</div>
		<%
		} else {
		String error = (String) request.getAttribute("error");
		//if (error == null) {
		//  error = "User is not authenticated! Please Login.";
		//} this is not required because it will not go inside..anyways error will not be null
		%>
		<h3><%=error%></h3>
		<%-- <h1><%=user %></h1> --%>
		<br> <a href="add-user">Register</a> <br> <a href="login">Login</a>
		<%
		}
		%>
	</div>
</body>
</html>
