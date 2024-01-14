<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Login • Contact Book App</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
            background-color: #fafafa;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
        }

        h2 {
            color: #262626;
            font-size: 28px;
            margin-bottom: 20px;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 1px solid #dbdbdb;
            border-radius: 4px;
            background-color: #fafafa;
        }

        input[type="submit"] {
            background-color: #3897f0;
            color: #fff;
            cursor: pointer;
            font-weight: bold;
            margin-top: 10px;
        }

        input[type="submit"]:hover {
            background-color: #357ae8;
        }

        input::placeholder {
            color: #999;
        }

        .signup-link {
            margin-top: 10px;
            text-align: center;
            color: #00376b;
            font-weight: bold;
        }

        .signup-link a {
            color: #00376b;
            text-decoration: none;
        }

        .signup-link a:hover {
            text-decoration: underline;
        } 
    </style>
</head>
<body>
   <f:form modelAttribute="login" method="post" > 
        <h2>Contact Book App</h2>
        
            <input type="text" name="email" placeholder="Enter Email" required>
            <br>
            <input type="password" name="password" placeholder="Enter Password" required>
            <br>
            <input type="submit" value="Log In">
            <div class="signup-link">
            <span>Don't have an account? <a href="add-user">Sign Up</a></span>
        </div>
        
        </f:form>
      
   
</body>
</html>
