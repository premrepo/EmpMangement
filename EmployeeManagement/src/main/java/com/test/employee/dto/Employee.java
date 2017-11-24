package com.test.employee.dto;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = -5585977581497055328L;
	private String username;
	private String userPassword;
	private String empName;
	private String mobile;
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", userPassword=" + userPassword + ", empName=" + empName
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}
