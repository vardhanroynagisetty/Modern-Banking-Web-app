<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Customer</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Register Customer</h1>
        <form action="registerCustomer" method="post">
            <label for="full-name">Full Name:</label>
            <input type="text" id="full-name" name="full-name" required>

            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>

            <label for="mobile-no">Mobile No:</label>
            <input type="text" id="mobile-no" name="mobile-no" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="account-type">Account Type:</label>
            <select id="account-type" name="account-type" required>
                <option value="Savings">Savings</option>
                <option value="Current">Current</option>
            </select>

            <label for="balance">Balance:</label>
            <input type="number" id="balance" name="balance" required>

            <label for="date-of-birth">Date of Birth:</label>
            <input type="date" id="date-of-birth" name="date-of-birth" required>

            <label for="id-proof">ID Proof:</label>
            <input type="text" id="id-proof" name="id-proof" required>

            <label for="account-number">Account Number:</label>
            <input type="text" id="account-number" name="account-number" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <button type="submit" class="btn">Register</button>
        </form>
    </div>
</body>
</html>
