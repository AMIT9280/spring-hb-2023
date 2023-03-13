<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 
</head>
<body>
<h1>List Products</h1>

	<table border="1">
		<tr>
			<th>ProductId</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Qty</th>	
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${products }" var="p">
		<tr>
			<td>${p.productId }</td>
			<td>${p.productName }</td>
			<td>${p.price }</td>
			<td>${p.qty }</td>
			<td><a href="/deleteProduct/${p.productId}">Delete</a></td>
			<td><a href="/UpdateProduct/${p.productId}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>