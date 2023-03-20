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
 

<table border="1">
		<tr>
			<th>ProjectId</th>
			<th>Project Name</th>
			<th>Technology Name</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${projects }" var="p">
		<tr>
			<td>${p.projectId }</td>
			<td>${p.projectName }</td>
			<td>${p.technologyName }</td>
			<td><a href="/deleteProject/${p.projectId}">Delete</a></td>
			<td><a href="/UpdateProject/${p.projectId}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>