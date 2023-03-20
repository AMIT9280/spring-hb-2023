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
			<th>DeveloperPro Id</th>
			<th>Developer Id</th>
			<th>Project Id</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${developerpros}" var="dp">
		<tr>
			<td>${dp.devproId }</td>
			<td>${dp.devId }</td>
			<td>${dp.projectId }</td>
		 
			<td><a href="/deleteDeveloperPro/${dp.devproId}">Delete</a></td>
			<td><a href="/UpdateDeveloperPro/${dp.devproId}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href="/addDevPro">Assign Project</a>
</body>
</html>