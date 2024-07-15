<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
</head>
<body>

	<h2>All Products</h2>
	<a href="/" >+ Add New Product</a>
	
	<table border="1" >
		<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
		</tr>
		</thead>
		
		<c:forEach items="${products}" var="product" varStatus="index">
			<tr>
				<td>${index.count}</td>
				<td>${product.pname}</td>
				<td>${product.price}</td>
				<td>${product.quantity}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>