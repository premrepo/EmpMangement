package com.test.employee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.employee.dao.EmployeeDao;
import com.test.employee.dto.Employee;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao;

	@Override
	public void init() throws ServletException {
		employeeDao = new EmployeeDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final Employee emp = new Employee();
		emp.setUsername(request.getParameter("username"));
		emp.setUserPassword(request.getParameter("password"));
		emp.setEmpName(request.getParameter("empName"));
		emp.setMobile(request.getParameter("mobile"));
		emp.setEmail(request.getParameter("email"));
		response.sendRedirect(employeeDao.save(emp) ? "success.jsp" : "regError.jsp");
	}

}
