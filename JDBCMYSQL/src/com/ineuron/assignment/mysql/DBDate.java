package com.ineuron.assignment.mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class DBDate {

	public static void main(String[] args) throws  ParseException {
		
		Connection conn=null;
		PreparedStatement pmst =null;
		
		
		try {
		
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter a name :");
				String name=sc.next();
				
				System.out.println("Enter a addr :");
				String address=sc.next();
				
				System.out.println("Enter a gender :");
				String gender=sc.next();
				
				System.out.println("Enter a DOB :");
				String DOB=sc.next();
				
				System.out.println("Enter a DOJ :");
				String DOJ=sc.next();
				
				System.out.println("Enter a DOM :");
				String DOM=sc.next();
				
				
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date uDOB = sdf1.parse(DOB);
				
				SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
				java.util.Date uDOJ = sdf2.parse(DOJ);
				
				
				java.sql.Date sqlDOB= new java.sql.Date(uDOB.getTime());
				java.sql.Date sqlDOJ= new java.sql.Date(uDOJ.getTime());
				
				java.sql.Date sqlDOM=java.sql.Date.valueOf(DOM);
				
				System.out.println(uDOB+" "+uDOJ);
		
				System.out.println(sqlDOB+" "+sqlDOJ);
				
				 conn=JdbcUtil.getJdbcConnection();
				
				if(conn!=null) {
					String query="insert into userdata(`name`,`address`,`gender`,`DOB`,`DOJ`,`DOM`) values (?,?,?,?,?,?)";
					pmst=conn.prepareStatement(query);
					
					if(pmst!=null) {
						pmst.setString(1,name);
						pmst.setString(2,address);
						pmst.setString(3,gender);
						pmst.setDate(4, sqlDOB);
						pmst.setDate(5, sqlDOJ);
						pmst.setDate(6, sqlDOM);
						int noOfRowsAffected=pmst.executeUpdate();
						System.out.println("Enter num of rows : "+noOfRowsAffected);
					}
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				JdbcUtil.closeConnection(null, pmst, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
