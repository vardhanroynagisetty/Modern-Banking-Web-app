<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link rel="stylesheet" href="static/css/admin_login.css">
</head>
<body>
    <div class="container">
        <h1>Admin Login</h1>
        <form action="adminLogin" method="post">
            <label for="admin-username">Username:</label>
            <input type="text" id="admin-username" name="admin-username" required>

            <label for="admin-password">Password:</label>
            <input type="password" id="admin-password" name="admin-password" required>

            <button type="submit" class="btn">Login</button>
        </form>
    </div>
</body>
</html>
