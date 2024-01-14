<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Password and Email</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.container {
	text-align: center;
	background-color: #ffffff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	color: #333333;
}

form {
	display: flex;
	flex-direction: column;
	align-items: center;
}

label {
	margin: 10px 0;
}

input {
	padding: 8px;
	margin: 5px 0;
	width: 100%;
}

.error-message {
	color: red;
	margin-top: 5px;
}

button {
	background-color: #007bff;
	color: #ffffff;
	padding: 10px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
</style>
</head>
<body>
	<%-- <%Object email=(String) request.getAttribute("Email"); %> --%>

	<div class="container">
		<h1>Update Password and Email</h1>
		<form action="updatepassword" method="post"
			onsubmit="return validateForm()">

			<label for="userEmail">User Email:</label> <input type="email"
				name="userEmail"<%-- value="updatepassword?userEmail=<%=email%>" readonly="readonly" --%>>

			<label for="password">Change Password:</label> <input type="password"
				name="password"> <span class="error-message"
				id="password-error"></span> <label for="confirmPassword">Confirm
				Password:</label> <input type="password" name="confirmpass" required>
			<span class="error-message" id="confirm-password-error"></span>

			<button type="submit">Update</button>
		</form>

		<script>
            function validatePassword() {
                var password = document.getElementById("newPassword").value;
                var passwordRegex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$/;

                if (!passwordRegex.test(password)) {
                    document.getElementById("password-error").innerHTML = "Password must be at least 8 characters long and include at least one digit, one lowercase letter, one uppercase letter, and one special character.";
                    return false;
                } else {
                    document.getElementById("password-error").innerHTML = "";
                    return true;
                }
            }

            function validateForm() {
                var isPasswordValid = validatePassword();
                var isConfirmPasswordValid = validateConfirmPassword();

                return isPasswordValid && isConfirmPasswordValid;
            }

            function validateConfirmPassword() {
                var password = document.getElementById("password").value;
                var confirmPassword = document.getElementById("confirmPassword").value;

                if (password !== confirmPassword) {
                    document.getElementById("confirm-password-error").innerHTML = "Passwords do not match.";
                    return false;
                } else {
                    document.getElementById("confirm-password-error").innerHTML = "";
                    return true;
                }
            }
        </script>
		<div>
			style="position: fixed; bottom:10px; right: 10px;"><A href="logout">Logout</A>
		</div>
	</div>
</body>
</html>
