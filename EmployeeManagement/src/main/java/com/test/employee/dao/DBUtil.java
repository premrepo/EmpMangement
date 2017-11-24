package com.test.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * Database object to load drivers and perform queries
 * 
 * @author chinmaya kumar patra
 */

public class DBUtil {
	private static Connection con;
	private static final String Driver = "oracle.jdbc.driver.OracleDriver";
	private static final String ConnectionString = "jdbc:oracle:thin:@empdb.cgji2xlltpjt.ap-south-1.rds.amazonaws.com:1521:ORCL";
	private static final String user = "chinu";
	private static final String pwd = "chinu123";

	/**
	 * create Database object
	 */
	/**
	 * 
	 * to load the database base driver
	 * 
	 * @return a database connection
	 * @throws SQLException
	 *             throws an exception if an error occurs
	 */

	static {
		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(ConnectionString, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * 
	 * to get a result set of a query
	 * 
	 * @param query
	 *            custom query
	 * @return a result set of custom query
	 * @throws SQLException
	 *             throws an exception if an error occurs
	 */

	public static ResultSet getResultSet(String query) throws SQLException {
		ResultSet rs;
		PreparedStatement st = con.prepareStatement(query);
		rs = st.executeQuery();
		return rs;

	}

	public static ResultSet getResultSet(final String query, final Map<Integer, String> params) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = con.prepareStatement(query);
			for (final Map.Entry<Integer, String> entry : params.entrySet()) {
				preparedStatement.setString(entry.getKey(), entry.getValue());
				return preparedStatement.executeQuery();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	/**
	 * 
	 * to run an update query such as update, delete
	 * 
	 * @param query
	 *            custom query
	 * @throws SQLException
	 *             throws an exception if an error occurs
	 */

	public static void runQuery(String query, String username) throws SQLException {
		PreparedStatement preparedStatement;
		preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1, username);
		preparedStatement.executeUpdate();
	}

	public static boolean executeQuery(String query, final Map<Integer, String> params) {
		try {
			final PreparedStatement preparedStatement = con.prepareStatement(query);
			for (final Map.Entry<Integer, String> entry : params.entrySet()) {
				preparedStatement.setString(entry.getKey(), entry.getValue());
			}
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static void closeConnection() throws SQLException {
		con.close();
	}

}
