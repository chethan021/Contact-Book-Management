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

.product-form {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

.product-form input {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	box-sizing: border-box;
}

.product-form button {
	width: 100%;
	padding: 10px;
	background-color: #4caf50;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.product-form button:hover {
	background-color: #45a049;
}
</style>
<title>Product Form</title>
</head>
<body>

	<div class="product-form">
		<h2>Add Product</h2>
		<form action="save" method="post">
			<input type="text" name="productId" placeholder="Product ID" required>
			<br> <input type="text" name="productName"
				placeholder="Product Name" required> <br> <input
				type="number" name="productPrice" placeholder="Product Price"
				required> <br>
			<button type="submit">Save</button>
		</form>
	</div>

</body>
</html>
