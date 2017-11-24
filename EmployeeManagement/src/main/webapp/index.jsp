<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="C:\\Users\chinmaya\j2ee\EmployeeManagement\imagefolder\background_m3_login_for_m1_by_andreascy-d3ecbzg.jpg">
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container-fluid">
	  <div class="row">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="panel panel-success">
			  <div class="panel-heading">Login</div>
			  <div class="panel-body">
			  	<form action="LoginServlet" method="post" onsubmit="return validate()">
					<div class="form-group">
						<label for="username">Username:</label> 
						<input type="text" name="username" class="form-control" id="username" />
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> 
						<input type="password" class="form-control" id="password" name="password">
					</div>
					<input type="submit" class="btn btn-success" value="Login" />
				</form>
				Not a user ?
				<a href="register.jsp">SignUp</a>
				<c:if test="${requestScope.error eq 'INVALID_USER' }">
					<h5 style="color: red">Invalid user !</h5>
				</c:if>
				<c:if test="${requestScope.error eq 'INVALID_PASS' }">
					<h5 style="color: red">Invalid password !</h5>
				</c:if>
			  </div>
			  </div>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>

	
</body>
</html>