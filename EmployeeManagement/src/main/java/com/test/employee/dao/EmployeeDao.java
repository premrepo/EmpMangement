package com.test.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.employee.dto.Employee;

public class EmployeeDao {

	public boolean save(final Employee emp) {
		final Map<Integer, String> params = new HashMap<>();
		params.put(1, emp.getUsername());
		params.put(2, emp.getUserPassword());
		params.put(3, emp.getEmpName());
		params.put(4, emp.getMobile());
		params.put(5, emp.getEmail());
		return DBUtil.executeQuery("INSERT INTO REGISTRATION VALUES(?, ?, ?, ?, ?)", params);
	}

	public Employee getEmpRecords(final String username) {
		final Map<Integer, String> params = new HashMap<>();
		params.put(1, username);
		final ResultSet rs = DBUtil.getResultSet("Select * FROM REGISTRATION WHERE USERNAME=?", params);
		try {
			rs.next();
			Employee employee = new Employee();
			employee.setUsername(rs.getString(1));
			employee.setUserPassword(rs.getString(2));
			employee.setEmpName(rs.getString(3));
			employee.setMobile(rs.getString(4));
			employee.setEmail(rs.getString(5));
			return employee;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public List<Employee> getAllEmpRecords() {
		final List<Employee> empList = new ArrayList<>();
		try {
			final ResultSet rs = DBUtil.getResultSet("Select * FROM REGISTRATION");
			while (rs.next()) {
				final Employee employee = new Employee();
				employee.setUsername(rs.getString(1));
				employee.setUserPassword(rs.getString(2));
				employee.setEmpName(rs.getString(3));
				employee.setMobile(rs.getString(4));
				employee.setEmail(rs.getString(5));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	public void removeEmployee(String username) {
		try {
			DBUtil.runQuery("DELETE FROM REGISTRATION WHERE USERNAME=?", username);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public void update(Employee emp) {
		final Map<Integer, String> params = new HashMap<>();
		params.put(1, emp.getUserPassword());
		params.put(2, emp.getEmpName());
		params.put(3, emp.getMobile());
		params.put(4, emp.getEmail());
		params.put(5, emp.getUsername());
		DBUtil.executeQuery("UPDATE REGISTRATION SET USER_PASSWORD=?,EMP_NAME=?,MOBILE=?,EMAIL=? WHERE USERNAME=?",
				params);

	}
}
