<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> </title>
</head>
<body>
<form action="../updateproject" method="post">
		<input type="hidden" name="projectId" value="${project.projectId}">
		Project Name<input type="text" name="projectName" value="${project.projectName}"> <br> <br>
		Technology Name <input type="text" name="technologyName" value="${project.technologyName}">
		<br> <br>
		<input type="submit" value="Update Project">
		
	</form>
</body>
</html>