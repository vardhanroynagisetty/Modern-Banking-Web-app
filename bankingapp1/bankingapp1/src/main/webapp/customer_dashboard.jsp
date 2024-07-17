<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String s=(String) session.getAttribute("acc_no"); %>
<!DOCTYPE html>
<html lang="en">
<head>
<style type="text/css">
	.btn{
		width:200px;
	}
</style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Dashboard</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Customer Dashboard</h1>
        <div class="dashboard">
        	<center>
        	<h1><%=s %></h1>
        	<table>
        		<tr><td> <a href="deposit.jsp" class="btn">Deposit</a> </td></tr>
        		<tr><td> <a href="balance.jsp" class="btn">Balance</a> </td></tr>
        		<tr><td> <a href="withdraw.jsp" class="btn">Withdraw</a> </td></tr>
        		<tr><td> <a href="change_password.jsp" class="btn">Change Password</a> </td></tr>
        		<tr><td> <a href="close_account.jsp" class="btn">Close Account</a> </td></tr>
        		<tr><td> <a href="index.jsp" class="btn">Logout</a> </td></tr>
        	</table>
        	</center>
            
            
            
            
            
            
            
        </div>
    </div>
</body>
</html>
