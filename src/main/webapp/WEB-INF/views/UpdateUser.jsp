<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
</head>
<body>
<form action="../updateUser" method="post">
		 
		 <input type="hidden" value="${user.userId}" name="userId">
		 <input type="hidden" value="${user.role.roleId} " name="role.roleId">
		firstName: <input type="text" name="firstName" value="${user.firstName} "> <br> <br>
		lastName:<input type="text" name="lastName" value="${user.lastName} "> <br> <br>
		email:<input type="text" name="email" value="${user.email} "> <br> <br>
	 
		<input type="submit" value="Update User">
	</form>
</body>
</html>