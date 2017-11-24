package com.test.employee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.employee.dao.EmployeeDao;
import com.test.employee.dto.Employee;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao;

	public void init() throws ServletException {
		employeeDao = new EmployeeDao();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final String username = req.getParameter("username");
		final String password = req.getParameter("password");
		final Employee emp = employeeDao.getEmpRecords(username);
		final String valid = validate(username, password, emp);
		if (valid.equals("SUCCESS")) {
			req.getSession().setAttribute("test", "Welcome");
			req.getSession().setAttribute("emp", emp);
			resp.sendRedirect("home.jsp");
		} else {
			req.setAttribute("error", valid);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}

	public String validate(final String username, final String password, final Employee emp) {
		if (emp == null)
			return "INVALID_USER";
		return (emp.getUsername().equals(username) && emp.getUserPassword().equals(password)) ? "SUCCESS"
				: "INVALID_PASS";
	}

}
