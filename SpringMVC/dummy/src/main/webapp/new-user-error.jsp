<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Already Present</title>
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

        p {
            color: #666666;
            margin-bottom: 20px;
        }

        a {
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
		
		<%   Object s= request.getAttribute("usermail"); %>
	
    <div class="container">
        <h1>User is already present</h1>
        <p>If you want to change your password, click <a href="updatepassword?email=<%=s%>">here</a>.</p>
         <p>If you want to change your password, click <a href="updatepassword">here</a>.</p>
        <p>If you need to log in, click <a href="welcome.jsp">here</a>.</p>
        <div> style="position: fixed; bottom:10px; right: 10px;"><A href="logout">Logout</A>
</div>
    </div>
</body>
</html>

