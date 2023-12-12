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

.employee-form {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

.employee-form input {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	box-sizing: border-box;
}

.employee-form button {
	width: 100%;
	padding: 10px;
	background-color: #4caf50;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.employee-form button:hover {
	background-color: #45a049;
}
</style>
<title>Product Form</title>
</head>
<body>

	<div class="employee-form" >
		<h2>Add Employee</h2>
		<form action="save" method="post" >
			<input type="text" name="id" placeholder="id" required>
			<br> <input type="text" name="ame"
				placeholder="Employee Name" required> <br> <input
				type="number" name="empSal" placeholder="EmpSal"
				required> <br>
			<button type="submit">Save</button>
		</form>
	</div>

</body>
</html>
