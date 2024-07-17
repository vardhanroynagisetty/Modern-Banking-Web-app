<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Close Account</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Close Account</h1>
        <form action="closeAccount" method="post">
            <label for="account-number">Account Number:</label>
            <input type="text" id="account-number" name="account-number" required>

            <button type="submit" class="btn">Close Account</button>
        </form>
    </div>
</body>
</html>
