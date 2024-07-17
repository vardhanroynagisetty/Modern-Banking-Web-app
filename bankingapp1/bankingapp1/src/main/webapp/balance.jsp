<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
	double d=0;
	if(session.getAttribute("balance")!=null){
	d=(Double) session.getAttribute("balance");
	}%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Balance</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Account Balance</h1>
        <div class="balance-info">
           <form action="balance" method="post">
           	<table>
           		<tr><td>Enter Account number</td><td><input name="acc_no"></td></tr>
           		<tr><td><button type="submit">check</button></td></tr>
           		<tr><td><%= d %></td></tr>
           	</table>
           </form>
        </div>
        <a href="customer_dashboard.jsp" class="btn">Back to Dashboard</a>
    </div>
</body>
</html>
