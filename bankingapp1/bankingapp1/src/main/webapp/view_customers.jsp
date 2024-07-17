<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.banking.model.User, java.util.List, java.util.ArrayList , java.util.Iterator" %>
<% List<User> l=(ArrayList<User>) session.getAttribute("view");
	Iterator<User> it=l.iterator();
	String s="<tr> <td> <b>Account_Number </b> </td> <td> <b>Full_name </b> </td> <td> <b>Balance</b> </td> </tr>";
	while(it.hasNext()){
		User us=it.next();
		s+="<tr> <td> "+us.getAccountNumber()+" </td> <td> "+us.getFullName()+" </td> <td> "+us.getBalance()+" </td> </tr> ";
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View All Customers</title>
    <link rel="stylesheet" href="static/css/view.css">
</head>
<body>
    <div class="container">
        <h1>View All Customers</h1>
        <table>
        	<%=s %>
        </table>
    </div>
</body>
</html>
