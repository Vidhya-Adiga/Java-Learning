package com.ineuron.assignment.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* This java class is to provide options for the customer to select any of the CRUD operations
 *  and based on this respective operation is performed and here we are using preparedStatement.
 *  Along with the above we have added new feature to ask customer if they select update operation 
 *  then we will provide options to select which attribute they need update*/

public class Driver {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select from given options 1(Create),2(Read),3(Update),4(Delete) : ");
		
		Integer input=sc.nextInt();
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rs=null;
		
		try {
			conn=JdbcUtil.getJdbcConnection();
			
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
				
				if(conn!=null) {
					String createQuery = "insert into student(sid,sname,sage,saddr) values(?,?,?,?)";
					PreparedStatement pmst=conn.prepareStatement(createQuery);
					pmst.setInt(1, sid);
					pmst.setString(2, sname);
					pmst.setInt(3, sage);
					pmst.setString(4, saddr);
					
					int noOfRowsInserted=pmst.executeUpdate();
					System.out.println("No of rows inserted are : "+noOfRowsInserted);
				}
				break;
				
			case 2:
				System.out.println("Enter id : ");
				Integer sid1=sc.nextInt();
				
				if(conn!=null) {
					String insertQuery = "select * from student where sid=? "; 
					PreparedStatement pmst=conn.prepareStatement(insertQuery);
					pmst.setInt(1, sid1);
					
					
					rs=pmst.executeQuery();
					
					if(rs!=null) {
						if(rs.next()) {
						System.out.println("Sid\tSname\tSage\tSaddr");
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
						}
					
						else {
							System.out.println("No record for the Id :"+sid1);
						}
					}
				}
				break;
				
			case 3:
				System.out.println("Enter id : ");
				Integer sid2=sc.nextInt();
				System.out.println("Enter what to update 1-name,2-age,3-address");
				Integer updateSel=sc.nextInt();
				
				switch(updateSel) {
				case 1:
					System.out.println("Enter name : ");
					String sname2=sc.next();
					
					
					if(conn!=null) {
						String createQuery = "update student set sname=? where sid=?";
						PreparedStatement pmst=conn.prepareStatement(createQuery);
						pmst.setString(1, sname2);
						pmst.setInt(2, sid2);
						
						int noOfRowsUpdated=pmst.executeUpdate();
						System.out.println("No of rows updated are : "+noOfRowsUpdated);
					}
					break;
				case 2:
					System.out.println("Enter age : ");
					Integer sage2=sc.nextInt();
					
					
					if(conn!=null) {
						String createQuery = "update student set sage=? where sid=?";
						PreparedStatement pmst=conn.prepareStatement(createQuery);
						pmst.setInt(1, sage2);
						pmst.setInt(2, sid2);
						
						int noOfRowsUpdated=pmst.executeUpdate();
						System.out.println("No of rows updated are : "+noOfRowsUpdated);
					}
					break;
				case 3:
					System.out.println("Enter addr : ");
					String saddr2=sc.next();
					
					
					if(conn!=null) {
						String createQuery = "update student set saddr=? where sid=?";
						PreparedStatement pmst=conn.prepareStatement(createQuery);
						pmst.setString(1, saddr2);
						pmst.setInt(2, sid2);
						
						int noOfRowsUpdated=pmst.executeUpdate();
						System.out.println("No of rows updated are : "+noOfRowsUpdated);
					}
					break;
					default:
						System.out.println("Please enter valid number 1-3");
						break;
				}
				
				break;
				
			case 4:
				System.out.println("Enter id : ");
				Integer sid3=sc.nextInt();
				
				if(conn!=null) {
					String insertQuery = "delete from student where sid=? "; 
					PreparedStatement pmst=conn.prepareStatement(insertQuery);
					pmst.setInt(1, sid3);
					
					
					int noOfRowsDeleted=pmst.executeUpdate();
					
					System.out.println("No of rows deleted are : "+noOfRowsDeleted);
					
				}
				break;
				default:
					System.out.println("Please enter valid option 1-4");

			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs==null) {
				JdbcUtil.closeConnection(null, statement, conn);
			}
			else {
			JdbcUtil.closeConnection(rs, statement, conn);
			}
		}
	}

}
