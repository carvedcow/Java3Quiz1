<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   
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
					<td><a href="editBook?bookId=${book.id}">update me!</a></td>
					<td><a href="deleteBook?bookId=${book.id}">delete me</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br>
	<br>
	<div align="left">
			<form:form action="saveCompBook" method="post"
				modelAttribute="book">
				<table>
					<tr>
						<td>Title</td>
						<td><form:input path="title" /></td>
					</tr>

					<tr>
						<td>Author</td>
						<td><form:input path="author" /></td>
					</tr>

					<tr>
						<td>Page Count</td>
						<td><form:input path="pageCount" /></td>
					</tr>

					<tr>
						<td>Year Published</td>
						<td><form:input path="year" /></td>
					</tr>

					<tr>
						<td colspan="2"><input type="submit" value="Save"></td>
					</tr>
				</table>

			</form:form>
		</div>
</body>
</html>