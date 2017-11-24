package com.test.employee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.employee.dao.EmployeeDao;
import com.test.employee.dto.Employee;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao;

	public void init() throws ServletException {
		employeeDao = new EmployeeDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String username = request.getParameter("username");
		final Employee emp = employeeDao.getEmpRecords(username);

		request.setAttribute("emp", emp);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
		;
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final Employee emp = new Employee();
		emp.setUsername(request.getParameter("username"));
		emp.setUserPassword(request.getParameter("password"));
		emp.setEmpName(request.getParameter("empName"));
		emp.setMobile(request.getParameter("mobile"));
		emp.setEmail(request.getParameter("email"));
		employeeDao.update(emp);
		response.sendRedirect("home");

	}

}
