<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@page import="com.jsp.contactbook.entity.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User SignIN</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f5f5f5;
	margin: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	background-color: white;
	border: 1px solid #ccc;
	border-radius: 8px;
	padding: 20px;
	width: 300px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	box-sizing: border-box;
}

input[type="submit"] {
	background-color: #4caf50;
	color: white;
	padding: 10px;
	width: 100%;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}

.error-message {
	color: red;
	margin-top: 5px;
}
</style>
<script>
	function validatePassword() {
		var password = document.getElementById("password").value;
		var passwordRegex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$/;

		if (!passwordRegex.test(password)) {
			document.getElementById("password-error").innerHTML = "Password must be at least 8 characters long and include at least one digit, one lowercase letter, one uppercase letter, and one special character.";
			return false;
		} else {
			document.getElementById("password-error").innerHTML = "";
			return true;
		}
	}
</script>
</head>
<body>

	<%
	User user = (User) session.getAttribute("user");
	Contact contact = (Contact) session.getAttribute("contact");
	if (user != null) {
	%>
	<div class="container">
		<h2>User SignIN</h2>
		<f:form modelAttribute="user" action="add-user" method="post"
			onsubmit="return validatePassword();">
			<f:input path="userName" placeholder="Username" />
			<f:input path="userEmail" placeholder="Email" />
			<f:input path="password" placeholder="Password" type="password"
				id="password" />
			<span id="password-error" class="error-message"></span>
			<input type="submit" value="SAVE">
		</f:form>
	</div>
	<%
	} else {
	String error = (String) request.getAttribute("error");
	if (error == null) {
		error = "User is not authemticated!! Pls Login";
	}
	%>
	<h3><%=error%></h3>
	<%
	}
	%>
</body>
</html>
