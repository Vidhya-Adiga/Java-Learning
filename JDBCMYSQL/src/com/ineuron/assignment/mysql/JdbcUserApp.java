package com.ineuron.assignment.mysql;

import java.sql.*;

/* This java class is to ask for customer to select any of the CRUD options and then using statement object executing them and printing result*/
import java.util.Scanner;

public class JdbcUserApp {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select from given options 1(Create),2(Read),3(Update),4(Delete) : ");
		
		Integer input=sc.nextInt();
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rs=null;
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "Sree@2022");

		
		switch(input) {
		case 1:
			
			System.out.println("Enter id : ");
			Integer sid=sc.nextInt();
			System.out.println("Enter name : ");
			String sname=sc.next();
			System.out.println("Enter age : ");
			Integer sage=sc.nextInt();
			System.out.println("Enter address : ");
			String saddr=sc.next();
			
			
			try {
				if(conn!=null) {
					statement= conn.createStatement();
					if(statement!=null) {
						String createquery=String.format("insert into Student(`sid`,`sname`,`sage`,`saddr`) values(%d,'%s',%d,'%s')", sid,sname,sage,saddr);
						int output = statement.executeUpdate(createquery);
						System.out.println("No of rows updated are : "+output);
					}
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if(rs!=null) {
					rs.close();
				}
				if(statement!=null) {
					statement.close();
				}
				if(conn!=null) {
					conn.close();
				}
				if(sc !=null) {
					sc.close();
				}
			}
			
		case 2:
			System.out.println("Enter your Id : ");
			Integer id=sc.nextInt();
			
			try {
				if(conn!=null) {
					statement = conn.createStatement();
					if(statement!=null) {
						String selectQuery = String.format("select * from Student where sid=%d", id);
						rs=statement.executeQuery(selectQuery);
						
						if(rs!=null) {
							System.out.println("Sid\tSname\tSage\tSaddr");
							while(rs.next()) {
								System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
							}
						}
					}
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if(rs!=null) {
					rs.close();
				}
				if(statement!=null) {
					statement.close();
				}
				if(conn!=null) {
					conn.close();
				}
				if(sc !=null) {
					sc.close();
				}

			}
			
			
		case 3:
			System.out.println("Enter Id for which you need update : ");
			Integer id1=sc.nextInt();
			System.out.println("Enter new age : ");
			Integer age=sc.nextInt();
			
			try {
				if(conn!=null) {
					statement = conn.createStatement();
					if(statement !=null) {
						String updateQuery=String.format("update Student set sage=%d where sid=%d", age,id1);
						int noOfRows = statement.executeUpdate(updateQuery);
						System.out.println("No of rows updated : "+noOfRows);
						
					}
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if(rs!=null) {
					rs.close();
				}
				if(statement!=null) {
					statement.close();
				}
				if(conn!=null) {
					conn.close();
				}
				if(sc !=null) {
					sc.close();
				}
			}
			
		case 4:
			System.out.println("Enter Id you want to delete : ");
			int id2=sc.nextInt();
			
			try {
				if(conn!=null) {
					statement=conn.createStatement();
					if(statement!=null) {
						String deleteQuery=String.format("delete from student where sid=%d", id2);
						int n=statement.executeUpdate(deleteQuery);
						System.out.println("No of rows deleted : "+n);
						
					}
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if(rs!=null) {
					rs.close();
				}
				if(statement!=null) {
					statement.close();
				}
				if(conn!=null) {
					conn.close();
				}
				if(sc !=null) {
					sc.close();
				}
			}
			
			
		}
			

	}

}
