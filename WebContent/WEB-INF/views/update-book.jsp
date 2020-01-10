<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>
</head>
<body>
	<div align="center">
	<!-- action attribute defines the RequestMapping chosen inside the controller
		method attribute is method
		modelAttribute defines the book object used to perform the update that is created inside the controller. -->
		<form:form action="updateBook" method="post" 
			modelAttribute="updatedBook">
			<table>
				<tr hidden="true">
					<td>id</td>
					<td><form:hidden path="id" /></td>
				</tr>
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
					<td colspan="2"><input type="submit" value="Update Book"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>