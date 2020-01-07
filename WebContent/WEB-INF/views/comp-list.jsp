<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computer Book List</title>
</head>
<body>
	<!-- Computer Book List table -->
	<div align="center">
		Computer Book List
		<table border="1">
			<tr>
				<th>title</th>
				<th>author</th>
				<th>pageCount</th>
				<th>year</th>
			</tr>

			<c:forEach var="book" items="${compList}">
				<tr>
					<td><c:out value="${book.title}"></c:out></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.pageCount}"></c:out></td>
					<td><c:out value="${book.year}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>