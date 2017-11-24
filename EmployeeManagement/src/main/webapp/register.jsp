<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container-fluid">
	  <div class="row">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<h5>Registration</h5>
			<form action="register" method="post" onsubmit="return validate()">
				<table>
					<tr>
						<td>Username</td>
						<td><input class="form-control" type="text" name="username" id="username"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input class="form-control" type="password" name="password" id="password"></td>
					</tr>
					<tr>
						<td>Confirm Password</td>
						<td><input class="form-control" type="password" name="password" id="repassword"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input class="form-control" type="text" name="empName"></td>
					</tr>
					<tr>
						<td>Mobile</td>
						<td><input class="form-control" type="text" name="mobile"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input class="form-control" type="text" name="email"></td>
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