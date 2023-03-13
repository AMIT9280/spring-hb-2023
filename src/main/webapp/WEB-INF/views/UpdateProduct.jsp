<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 
</head>
<body>
<h1>Update Product</h1>
<form action="../EditProduct"  method="post">
		<input type="hidden" name="productId" value="${product.productId}">
		
		Product Name : <input type="text" name="productName" value="${product.productName}"> <br>
		<br> Price :<input type="text" name="price" value="${product.price}"> <br> <br>
		Qty :<input type="text" name="qty" value="${product.qty}"> <br> <br>
		<input type="submit"  >
	</form>
</body>
</html>