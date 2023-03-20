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
<h3>Assign Projects</h3>
 <form action="../savedeveloperproject" method="post">
		Developers :<select name="devId">
			<option> Select Developer</option>
			<c:forEach items="${developer}" var="d">
				<option value="${d.devId}">${d.devName}</option>
			</c:forEach>
		</select> 
		<br><br>
		Projects :<select name="projectId">
			<option> Select Project</option>
			<c:forEach items="${project}" var="p">
				<option value="${p.projectId}">${p.projectName}</option>
			</c:forEach>
		</select> 
		<br><br>
		<input type="submit" value="Assign">
</form>
<a href="/developerpros">List DeveloperProjects</a>
</body>
</html>