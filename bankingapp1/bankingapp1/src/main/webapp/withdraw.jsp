<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Withdraw</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Withdraw</h1>
        <form action="withdraw" method="post">
            <label for="account-number">Account Number:</label>
            <input type="text" id="account-number" name="account-number" required>

            <label for="amount">Amount:</label>
            <input type="number" id="amount" name="amount" required>

            <button type="submit" class="btn">Withdraw</button>
        </form>
    </div>
</body>
</html>
