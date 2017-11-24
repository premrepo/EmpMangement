<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.test.employee.dto.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<h3><%=session.getAttribute("test")%></h3>
<%-- <%
	Employee emp = (Employee)session.getAttribute("emp");
	out.println(emp.getEmpName() + "<br/>");
	out.println(emp.getEmail() + "<br/>");
	out.println(emp.getMobile() + "<br/>");
%> --%>
	<ul>
		<li>${sessionScope.emp.username}</li>
		<li>${sessionScope.emp.empName}</li>
		<li>${sessionScope.emp.email}</li>
		<li>${sessionScope.emp.mobile}</li>
	</ul>
	see all employee details? <br/>
	<a href="home">Click Here</a>
</body>
</html>