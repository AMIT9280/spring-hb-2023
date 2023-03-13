<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> </title>
</head>
<body>
	<h3>List Users</h3>
	
	<table border="1">
		<tr>
			
			<th>UserId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>	
			<th>Role</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${users }" var="u">
		<tr>
			<td>${u.userId }</td>
			<td>${u.firstName }</td>
			<td>${u.lastName }</td>
			<td>${u.email }</td>
			<td>${u.role.roleName }</td>
			<td><a href="/deleteUser/${u.userId}">Delete</a></td>
			<td><a href="/UpdateUser/${u.userId}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>