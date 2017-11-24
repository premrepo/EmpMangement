<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DashBoard</title>
<script type="text/javascript">
function confirmDelete(username){
	var r = confirm("Are you sure want to delete?");
	if (r == true) {
		window.location = 'delete?username=' + username;
	} else {
		return;
	} 
}
</script>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<table class="table">
	<tr>
		<td>Username</td>
		<td>Password</td>
		<td>Email</td>
		<td>Mobile</td>
		<td>Delete</td>
		<td>Edit</td>
	</tr>
	<c:forEach var="emp" items="${requestScope.empList}">
		<tr>
			<td>${emp.username}</td>
			<td>${emp.empName}</td>
			<td>${emp.email}</td>
			<td>${emp.mobile}</td>
			<td><a href="#" onclick="confirmDelete('${emp.username}')">Delete</a></td>
			<td><a href="edit?username=${emp.username}">Edit</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>