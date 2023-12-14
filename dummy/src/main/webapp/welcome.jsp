<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Instagram-like Login</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #fafafa;
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

input {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	box-sizing: border-box;
}

button {
	background-color: #3897f0;
	color: white;
	padding: 10px;
	width: 100%;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

button:hover {
	background-color: #357ae8;
}

.signup-link {
	margin-top: 10px;
	text-align: center;
}

.signup-link a {
	color: #3897f0;
	text-decoration: none;
}
</style>
</head>
<body>
	<div class="container">
		<h2>ContactBook</h2>
		<form action="login" method="get">
			<input type="text" placeholder="Email" required> <input
				type="password" placeholder="Password" required>
			<button type="submit">Log In</button>
		</form>
		<div class="signup-link">
			<p>
				Don't have an account? <a href="add-user">Sign up</a>
			</p>
		</div>
	</div>
</body>
</html>
