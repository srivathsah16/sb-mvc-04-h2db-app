<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products Application</title>
</head>
<body>
	<h1>Store Product</h1>
	<form:form action="save" method="POST" modelAttribute="p">
		<p>
			<font color="green">${message}</font>
		</p>
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="pname" /></td>
			</tr>

			<tr>
				<td>Price:</td>
				<td><form:input path="price" /></td>
			</tr>

			<tr>
				<td>Quantity:</td>
				<td><form:input path="quantity" /></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button>Save</form:button></td>
			</tr>
		</table>
	</form:form>
	<a href="products">View Products</a>
</body>
</html>