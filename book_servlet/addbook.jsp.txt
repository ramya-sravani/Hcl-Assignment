<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="BookController" method="post">
<table>
<tr>
<td>isbn</td>
<td><input type="text" name="isbn"id="isbnId"/></td>
</tr>
<tr>
<td>title</td>
<td><input type="text" name="title"id="titleId"/></td>
</tr>
<tr>
<td>author</td>
<td><input type="text" name="author"id="authorId"/></td>
</tr>
<tr>
<td>pubDate</td>
<td><input type="text" name="Date"id="pubDateId"/></td>
</tr>
<tr>
<td>price</td>
<td><input type="text" name="price"id="priceId"/></td>
</tr>
<tr>
<td>
<input type="submit" name="submit" value="submit"/>
</td>
</tr>

</table>


</form>
</body>
</html>
