<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container-fluid">
	  <div class="row">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<h5>Update user info for <b>${requestScope.emp.username}</b></h5>
			<form action="edit" method="post" onsubmit="return validate()">
				<input class="form-control" type="hidden" name="username" id="username" value="${requestScope.emp.username}">
				<table>
					<tr>
						<td>Password</td>
						<td><input class="form-control" type="password" name="password" id="password" value="${requestScope.emp.userPassword}"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input class="form-control" type="text" name="empName" value="${requestScope.emp.empName}"></td>
					</tr>
					<tr>
						<td>Mobile</td>
						<td><input class="form-control" type="text" name="mobile" value="${requestScope.emp.mobile}"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input class="form-control" type="text" name="email" value="${requestScope.emp.email}"></td>
					</tr>
					<tr>
						<td></td>
						<td><input class="btn btn-success" type="submit" value="submit" /></td>
					</tr>
				</table>
			</form>
		</div>
		<div class="col-lg-4"></div>
	</div>
	</div>
</body>
</html>