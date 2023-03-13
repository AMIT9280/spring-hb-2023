<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<h1>Add Product</h1>
	<form action="saveProduct" method="post">
		Product Name : <input type="text" name="productName"> <br>
		<br> Price :<input type="text" name="price"> <br> <br>
		Qty :<input type="text" name="qty"> <br> <br> <input
			type="submit" value="Add Product">
	</form>
	<a href="/products">List Products</a>
</body>
</html>