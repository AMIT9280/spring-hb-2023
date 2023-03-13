<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	<form action="saveUser" method="post">
		<select name="role">
			<option> Select Role</option>
			<c:forEach items="${roles}" var="r">
				<option value="${r.roleId}">${r.roleName}</option>
			</c:forEach>

		</select> 
		<br><br>
		firstName: <input type="text" name="firstName"> <br> <br>
		lastName:<input type="text" name="lastName"> <br> <br>
		email:<input type="text" name="email"> <br> <br>
		password:<input type="text" name="password"> <br> <br>
		<input type="submit" value="Add User">
	</form>
</body>
</html>