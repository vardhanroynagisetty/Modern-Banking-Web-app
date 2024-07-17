<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Change Password</h1>
        <form action="changePassword" method="post">
            <label for="account-number">Account Number:</label>
            <input type="text" id="account-number" name="account-number" required>

            <label for="current-password">Current Password:</label>
            <input type="password" id="current-password" name="current-password" required>

            <label for="new-password">New Password:</label>
            <input type="password" id="new-password" name="new-password" required>

            <button type="submit" class="btn">Change Password</button>
        </form>
    </div>
</body>
</html>
