<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<table border="1">
		<tr>
			<th>Developer Id</th>
			<th>Developer Name</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${developer}" var="p">
		<tr>
			<td>${p.devId }</td>
			<td>${p.devName }</td>
		 
			<td><a href="/deleteDeveloper/${p.devId}">Delete</a></td>
			<td><a href="/UpdateDeveloper/${p.devId}">Edit</a> ${p.projects.size()} </td>
			 
		</tr>
		</c:forEach>
	</table>
</body>
</html>