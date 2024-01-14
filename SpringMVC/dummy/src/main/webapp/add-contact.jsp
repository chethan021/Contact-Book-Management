<%@page import="com.jsp.contactbook.entity.User"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Add Contact</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f5f5f5;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 600px;
	margin: 50px auto;
	background-color: #fff;
	padding: 20px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 5px;
}

h2 {
	text-align: center;
	color: #333;
}

form {
	display: flex;
	flex-direction: column;
}

label {
	margin-bottom: 8px;
	color: #555;
}

input, button {
	margin-bottom: 16px;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
	font-size: 14px;
}

.error-message {
	color: red;
	margin-top: 5px;
}

button {
	background-color: #007BFF;
	color: #fff;
	cursor: pointer;
}
</style>
<script>
        // Your existing JavaScript functions here
        function validatePhoneNumber() {
            var phoneNumber = document.getElementById("phoneNumber").value;
            var phoneRegex = /^\d{10}$/;

            if (!phoneRegex.test(phoneNumber)) {
                document.getElementById("phoneNumberError").innerText = "Invalid phone number format";
                return false;
            } else {
                document.getElementById("phoneNumberError").innerText = "";
                return true;
            }
        }

        function validateForm() {
            return validatePhoneNumber();
        }
    </script>
</head>
<body>
	<% 
        User user = (User) session.getAttribute("user");
    %>
	<div class="container">
		<h2>Add Contact</h2>

		<form:form action="AddContact" method="post" modelAttribute="contact"
			onsubmit="return validateForm()">
			<label for="UserId">User Id</label>
			<form:input path="user.userId" value="<%=user.getUserId() %>" readonly="true" />
			<label for="firstName">First Name:</label>
			<form:input path="contactFirstName" id="firstName" required="true" />

			<label for="lastName">Last Name:</label>
			<form:input path="contactLastName" id="lastName" required="true" />

			<label for="phoneNumber">Phone Number:</label>
			<form:input path="contactPhno" id="phoneNumber" required="true" />


			<%--   <label for="userr">hh</label>
            <form:input path="user" id="userr"  required="true"/> --%>


			<span id="phoneNumberError" class="error-message"></span>

			<button type="submit">Add Contact</button>
			<div style="position: fixed; bottom:10px; right: 10px;"><A href="logout">Logout</A>
</div>
		</form:form>
	</div>
</body>
</html>
