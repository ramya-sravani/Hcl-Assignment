<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
    rel="stylesheet">
<style type="text/css">
.error, h4 {
	color:red;
}
</style>
</head>
<body>
<br>
<h3>Bank employee login</h3>
<h4>${message}</h4>
	<form:form action="login" method="post" modelAttribute="loginBean">
		<table>
			<tr>
				<td>Enter username:</td>
				<td><form:input path="username" /><form:errors path="username" class="error"></form:errors> </td>
			</tr>

			<tr>
				<td>Enter password:</td>
				<td><form:input path="password" /><form:errors path="password" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="login"> </td>				
			</tr>
		</table>
	</form:form>
</body>
</html>