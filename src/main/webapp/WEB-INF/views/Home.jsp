<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h2>Welcome ${emp.employeeName}</h2>
	<form action="saveaddress" method="post">
		AddressLine: <input type="text" name="addressLine"> <br>
		<br> City: <input type="text" name="city"> <br> <br>
		<input type="submit" value="Add Address">
	</form>
</body>
</html>