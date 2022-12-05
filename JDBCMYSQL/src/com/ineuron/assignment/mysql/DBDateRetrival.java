package com.ineuron.assignment.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DBDateRetrival {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a name : ");
		String name=sc.next();
		
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		
		String sqlSelectQuery = "select * from userdata where name = ?";
		
		try {
			conn=JdbcUtil.getJdbcConnection();
			
			if(conn!=null) 
				 psmt=conn.prepareStatement(sqlSelectQuery);
			if(psmt!=null) {
				psmt.setString(1, name);
				rs=psmt.executeQuery();
			}
			if(rs!=null) {
				if(rs.next()) {
					String uname=rs.getString(1);
					String uaddress=rs.getString(2);
					String ugender=rs.getString(3);
					java.sql.Date uDOB=rs.getDate(4);
					java.sql.Date uDOJ=rs.getDate(5);
					java.sql.Date uDOM=rs.getDate(6);
					
					SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyy");
					String sDOB=sdf.format(uDOB);
					String sDOJ=sdf.format(uDOJ);
					String sDOM=sdf.format(uDOM);
					
					System.out.println("Name :"+uname);
					System.out.println("Address :"+uaddress);
					System.out.println("Gender :"+ugender);
					System.out.println("DOB : "+uDOB);
					System.out.println("DOJ : "+uDOJ);
					System.out.println("DOM : "+uDOM);
				}
			}
			
				
		}catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcUtil.closeConnection(rs, psmt, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
