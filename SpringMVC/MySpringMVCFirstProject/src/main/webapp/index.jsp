<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.signup-form {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

.signup-form input {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	box-sizing: border-box;
}

.signup-form button {
	width: 100%;
	padding: 10px;
	background-color: #4caf50;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.signup-form button:hover {
	background-color: #45a049;
}
</style>
<title>Sign Up Form</title>
</head>
<body>

	<div class="signup-form">
		<h2>Sign Up</h2>
		<form action="signup" method="post">
			<input type="text" name="Firstname" placeholder="First Name" required>
			<br> <input type="text" name="Lastname" placeholder="Last Name"
				required> <br> <input type="email" name="Email"
				placeholder="Email" required> <br> <input type="tel"
				name="Contact_No" placeholder="Contact No" required> <br>
			<button type="submit">Sign Up</button>
		</form>
	</div>

</body>
</html>
