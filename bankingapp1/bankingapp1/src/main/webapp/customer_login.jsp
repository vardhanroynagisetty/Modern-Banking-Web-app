<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Login</title>
    <link rel="stylesheet" href="static/css/customer.css">
</head>
<body>
    <div class="container">
        <h1>Customer Login</h1>
        <form action="customerLogin" method="post">
            <label for="customer-account-number">Account Number:</label>
            <input type="text" id="customer-account-number" name="customer-account-number" required>

            <label for="customer-password">Password:</label>
            <input type="password" id="customer-password" name="customer-password" required>

            <button type="submit" class="btn">Login</button>
        </form>
    </div>
</body>
</html>
