<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Home</title>
<style type="text/css">
	h2, h4 {
		color: orange;
	}
</style>
</head>
<body>
<br>
<h2>Hello, ${sessionScope.account.name}</h2><h4>(account number - ${sessionScope.account.accountNumber})</h4><br>
	<h4><a href="transactionhistory?id=${sessionScope.account.accountId}"> Transaction History</a></h4>
 	<h4><a href="transfer"> Transfer</a></h4>
	<h4><a href="withdraw"> Withdraw</a></h4>
	<h4><a href="deposit"> Deposit</a></h4>
	<h4><a href="customerlogout"> Logout</a></h4>
</body>
</html>