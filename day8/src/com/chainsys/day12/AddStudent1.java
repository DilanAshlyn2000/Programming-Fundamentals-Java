package com.chainsys.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class AddStudent1 {
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
	insert();
	}
	public static  void insert() throws ClassNotFoundException, SQLException {
	    Connection connection = Connect2.getConnection();
        System.out.println(connection);
        String query="insert into StudentDetails values(303,'AMUTHA','COMPUTER SCIENCE',1,0,82.67,78)";
        PreparedStatement prepareStatement = connection.prepareStatement(query);
        int rows = prepareStatement.executeUpdate();
        System.out.println(rows+" inserted");
}*/
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	      
	        Connection connection = Connect2.getConnection();
         //   AddStudent student=new AddStudent();
            Scanner sc = new Scanner(System.in);
	         
	            System.out.println("ENTER STUDENT ID:");
	            int id = sc.nextInt();
	            sc.nextLine(); 

	            System.out.println("ENTER STUDENT NAME:");
	            String name = sc.nextLine();

	            System.out.println("ENTER THE DEPARTMENT:");
	            String departmentB = sc.nextLine();

	            System.out.println("ENTER THE PURSUING YEAR:");
	            int yearB=sc.nextInt();
	            
	            System.out.println("ENTER THE NUMBER OF ARREARS:");
	            int numberOfArrears=sc.nextInt();
	            
	            System.out.println("ENTER THE GRADE PERCENTAGE:");
	            float gradePercentage=sc.nextFloat();
	            
	            System.out.println("ENTER THE ATTENDANCE:");
	            float attendance=sc.nextFloat();
	            
	            
	            AddStudent add = new AddStudent(id,name,departmentB,yearB,numberOfArrears,gradePercentage,attendance);
	            insert(add);
//	            read();

	            sc.close();
	        }
	    public static void insert(AddStudent add) throws ClassNotFoundException, SQLException {
	        Connection connection = Connect2.getConnection();

	        String insertQuery = "INSERT INTO StudentDetails (stu_id,stu_name,stu_department,pursuing_year,numberOfArrears,gradePercentage,attendance) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

	        preparedStatement.setInt(1, AddStudent.getId());
	        preparedStatement.setString(2, AddStudent.getName());
	        preparedStatement.setString(3, AddStudent.getDepartmentB());
	        preparedStatement.setInt(4, AddStudent.getYearB());
	        preparedStatement.setInt(5, AddStudent.getNumberOfArrears());
	        preparedStatement.setFloat(6, AddStudent.getGradePercentage());
	        preparedStatement.setFloat(7, AddStudent.getAttendance());
	        
	        int rows = preparedStatement.executeUpdate();
	        System.out.println(rows + " rows inserted");
	    }
	    

	}

