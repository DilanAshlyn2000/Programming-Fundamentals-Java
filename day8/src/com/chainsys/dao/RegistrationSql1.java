package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.chainsys.util.Connect1;

public class RegistrationSql1 {
	public static boolean registerUser(int id, String name,String password) throws ClassNotFoundException, SQLException {
        insertUser(id, name, password); 
        System.out.println("USER REGISTERED SUCCESSFULLY");
        return true;
    }
	
	public  boolean loginUser(int userId, String password) throws ClassNotFoundException, SQLException {
        Connection connection =  Connect1.getConnection();

        String loginQuery = "SELECT stu_id,password FROM studentdetails WHERE stu_id = ? && password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
        preparedStatement.setInt(1, userId);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        } else {
            System.out.println("Invalid User ID or password. Please try again.");
            return false;
        }
     }
	public static int insertUser(int id, String name,String password) throws ClassNotFoundException, SQLException {
        Connection connection =  Connect1.getConnection();

        String insertQuery = "insert into studentdetails values(?,?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,null);
        preparedStatement.setInt(4,0);
        preparedStatement.setInt(5,0);
        preparedStatement.setFloat(6,0);
        preparedStatement.setInt(7,0);
        preparedStatement.setString(8,password);
        int executeUpdate = preparedStatement.executeUpdate();
        System.out.println(executeUpdate);
        return id;
    }
	
	public static void  adminInsert(int id,String departmentB,int year,int numberOfArrear,float gradePercentage ,float attendance) throws ClassNotFoundException, SQLException {
		Connection connection =  Connect1.getConnection();
     
	//  String loginQuery = "SELECT stu_id FROM studentdetails WHERE stu_id = ? ";
		String addStudent="update studentdetails set stu_department=?,pursuing_year=?,numberOfArrears=?,gradePercentage=?,attendance=? where stu_id="+id;
		PreparedStatement preparedStatement = connection.prepareStatement(addStudent);
        preparedStatement.setString(1,departmentB);
        preparedStatement.setInt(2,year);
        preparedStatement.setInt(3,numberOfArrear);
        preparedStatement.setFloat(4,gradePercentage);
        preparedStatement.setFloat(5,attendance);
        int executeUpdate = preparedStatement.executeUpdate();    
	}
	public void read()throws ClassNotFoundException,SQLException {
		 Connection connection =  Connect1.getConnection();
		 String readQuery="SELECT( id, name, departmentB, year, numberOfArrear, gradePercentage , attendance) FROM studentdetails";
			PreparedStatement preparedStatement = connection.prepareStatement(readQuery);
	        ResultSet resultSet = preparedStatement.executeQuery();
	        ResultSetMetaData set=resultSet.getMetaData();
	        int column=set.getColumnCount();
	        while(resultSet.next()) {
	        	for(int i=1;i<=column;i++)
	        	{
	        		String ColumnValue=resultSet.getString(i);
	        		System.out.println(set.getColumnName(i)+""+ColumnValue);
	        	}
	        	System.out.println();
	        }  
	
		
	   }
}
