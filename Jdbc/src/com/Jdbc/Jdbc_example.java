package com.Jdbc;

import java.util.Scanner;

import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class Jdbc_example {

	public static void main(String[] args) {
		
		try
		{
//			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/kishore?characterEncoding=utf8";
			
			String username="root";
			
			String password="kishore@2003";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement stmt=con.createStatement();
			
			ResultSet rs;
			
			PreparedStatement st=null;
			
			String qry="";
			
			int id,age,rollno;
			
			String name,address,dept;
			
			Scanner sc = new Scanner(System.in);
			
			Scanner str=new Scanner(System.in);
			
			while(true)
			{
				System.out.println(" MYSQL JAVA CRUD OPERATION ");
				
				System.out.println(" 1.INSERT ");
				
				System.out.println(" 2.DELETE ");
				
				System.out.println(" 3.VIEW ALL RECORDS ");
				
				System.out.println(" 4.UPDATE ");
				
				System.out.println(" 5.EXIT ");
				
				System.out.println(" Enter your choice : ");
				
				int choice=sc.nextInt();
				
				System.out.println("---------------------------------------------------");
				
				switch(choice)
				{
				case 1:
					System.out.println(" Enter the stu_name : ");
					
					name = str.nextLine();
					
					System.out.println(" Enter the Stu_address : ");
					
					address = str.nextLine();
					
					System.out.println(" Enter the Stu_dept : ");
					
					dept = str.nextLine();
					
					System.out.println(" Enter the stu_age : ");
					
					age=sc.nextInt();
					
					System.out.println(" Enter the stu_rollno : ");
					
					rollno = sc.nextInt();
					
					qry="insert into student (stu_name,stu_address,stu_dept,stu_age,stu_rollno) values (?,?,?,?,?)";  
					
					st=con.prepareStatement(qry);
					
					st.setString(1, name);
					
					st.setString(2, address);
					
					st.setString(3, dept);
					
					st.setInt(4, age);
					
					st.setInt(5, rollno);
					
					st.executeUpdate();
					
					System.out.println(" DATA INSERTED SUCCESSFULLY ");
					
					break;
					
				case 2:
					
					System.out.println(" 2.Deleting a data ");
					
					System.out.println(" Enter the ID : ");
					
					id = sc.nextInt();
					
					qry="delete from student where stu_id=?";
					
					st=con.prepareStatement(qry);
					
					st.setInt(1, id);
					
					st.executeUpdate();
					
					System.out.println(" Data Deleted Successfully ");
					
					break;
					
					
				case 3:	
					System.out.println(" 3.print all Records ");
					
					qry="SELECT* from student";
					
					rs=stmt.executeQuery(qry);
					
					while(rs.next())
					{
						id=rs.getInt("stu_id");
						
						name=rs.getString("stu_name");
						
						address=rs.getString("stu_address");
						
						dept=rs.getString("stu_dept");
						
						age=rs.getInt("stu_age");
						
						rollno=rs.getInt("stu_rollno");
						
						
						System.out.print(id+" ");
						
						System.out.print(name+" ");
						
						System.out.print(address+" ");
						
						System.out.print(dept+" ");
						
						System.out.print(age+" ");
						
						System.out.println(rollno+" ");
					}
					
					break;
					
				case 4:
					
					System.out.println("4.Updating a Data");
					
					System.out.println(" Enter ID : ");
					
					id=sc.nextInt();
					
					System.out.println(" Enter name : ");
					
					name = str.nextLine();
					
					System.out.println(" Enter address : ");
					
					address=str.nextLine();
					
					System.out.println(" Enter department : ");
					
					dept=str.nextLine();
					
					System.out.println(" Enter age : ");
					
					age=sc.nextInt();
					
					System.out.println(" Enter rollno : ");
					
					rollno=sc.nextInt();
					
					qry="update student set stu_name=?,stu_address=?,stu_dept=?,stu_age=?,stu_rollno=? where stu_id=?";
					
					st.setString(1, name);
					
					st.setString(2, address);
					
					st.setString(3, dept);
					
					st.setInt(4, age);
					
					st.setInt(5,rollno);
					
					st.executeUpdate();
					
					System.out.println("Data Update Successfully");
					
	 				break;
					
					
				case 5:	
					
					System.out.println(" Thank you ");
					
					break;
					
				default:
					
					System.out.println("INVALID SELECTION");
					
					break;
				}
				
				System.out.println("-------------------------------------------");
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		// TODO Auto-generated method stub

	}

}
