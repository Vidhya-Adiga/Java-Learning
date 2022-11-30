package com.ineuron.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestSQLApp {

	public static void main(String[] args) throws SQLException {
		
		Connection conn=null;
		Statement statement=null;
//		ResultSet rs=null;
				
		String url="jdbc:mysql://localhost:3306/schooldb";
		String user="root";
		String password="Sree@2022";
		
		
		try {
				conn=DriverManager.getConnection(url, user, password);

				if(conn!=null) {
					statement=conn.createStatement();
					
					if(statement!=null) {
						String query="select * from student";
						ResultSet rs=statement.executeQuery(query);
						System.out.println(rs);
						System.out.println("Sid\tSname\tSage\tSaddr");
						while(rs.next()) {
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
						}
												
				}			
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if(statement!=null)
				statement.close();
			if(conn!=null)
				conn.close();
		}
		
}

}
