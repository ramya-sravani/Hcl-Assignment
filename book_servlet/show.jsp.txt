<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tr>
<th>id</th>
<th>isbn</th>
<th>title</th>
<th>author</th>
<th>pubDate</th>
<th>price</th>
</tr>
</thead>
<tbody>
<c:forEach items="${books}" var="book">
<tr>
<td>${book.id}</td>
<td>${book.isbn}</td>
<td>${book.title}</td>
<td>${book.author}</td>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${book.id}"/></td>
<td>${book.price}</td>
<td><a href="BookController?action=updateBook&id=<c:out value="${book.id}"/>">update</a></td>
<td><a href="BookController?action=delBook&id=<c:out value="${book.id}"/>">delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="BookController?action=addBook">add new book</a>

</body>
</html>