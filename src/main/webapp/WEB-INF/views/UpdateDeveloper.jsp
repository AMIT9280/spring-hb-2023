<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> </title>
</head>
<body>
<form action="../updatedeveloper" method="post">
<input type="hidden" name="devId" value="${developer.devId}">
		Developer Name<input type="text" name="devName" value="${developer.devName}"> <br> <br>
		<input type="submit" value="Add Developer">
		
	</form>
</body>
</html>