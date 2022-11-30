package com.ineuron.assignment.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* This java class is used to get JDBC connection and also to close resourses*/
public class JdbcUtil {
	
	private JdbcUtil() {
		
	}
	
	public static Connection getJdbcConnection() throws SQLException {
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "Sree@2022");
		
		if(conn!=null) {                 
			return conn;
		}
		
		return conn;
		
	}
	
	public static void closeConnection(ResultSet rs,Statement statement,Connection conn) throws SQLException {
		
		if(rs!=null) {
			rs.close();
		}
		if(statement!=null) {
			statement.close();
		}
		if(conn!=null) {
			conn.close();
		}

	}

}
