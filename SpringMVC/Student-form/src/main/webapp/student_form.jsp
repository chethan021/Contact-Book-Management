<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Form</title>
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

form {
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	padding: 20px;
	width: 300px;
}

label {
	display: block;
	margin-bottom: 8px;
}

input {
	width: 100%;
	padding: 8px;
	margin-bottom: 16px;
	box-sizing: border-box;
}

select {
	width: 100%;
	padding: 8px;
	margin-bottom: 16px;
	box-sizing: border-box;
}

button {
	background-color: #4caf50;
	color: #fff;
	padding: 10px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

button:hover {
	background-color: #45a049;
}
</style>
</head>
<body>

	<form action="save" method="post">
		<label for="studentName">Student Name:</label> <input type="text"
			id="studentName" name="student_Name" required> <label
			for="location">Location:</label> <input type="text" id="location"
			name="location" required> <label for="rollNo">Roll
			No:</label> <input type="text" id="rollNo" name="roll_no" required> <label
			for="gender">Gender:</label> <select id="gender" name="gender"
			required>
			<option value="male">Male</option>
			<option value="female">Female</option>
		</select> <label for="fatherName">Father's Name:</label> <input type="text"
			id="fatherName" name="father_Name" required>

		<button type="submit">Submit</button>
	</form>
</body>
</html>
