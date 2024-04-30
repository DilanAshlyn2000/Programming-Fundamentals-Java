package com.chainsys.day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
		insert();
		update();
		delete();
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDetails","root","Welcome#22");
        return connection;
}
	
	public static void insert() throws SQLException, ClassNotFoundException {
		Connection connection = getConnection();
		String query="INSERT INTO Employee(emp_id,name,age,job_description,salary,branch_name)values(501,'SIVA',25,'MANAGER',56000,'KOCHADAI')";
		  PreparedStatement prepareStatement = connection.prepareStatement(query);
		  System.out.println("INSERTED!");
		  prepareStatement.execute();
		  connection.close();
	}
	public static void update() throws SQLException, ClassNotFoundException {
		Connection connection = getConnection();
		String query="UPDATE Employee SET job_description='DEVELOPER' WHERE emp_id=101";
		  PreparedStatement prepareStatement = connection.prepareStatement(query);
		  System.out.println("UPDATED!");
		  prepareStatement.execute();
		  connection.close();
	}
	public static void delete() throws SQLException, ClassNotFoundException {
		Connection connection = getConnection();
		String query="DELETE FROM Employee WHERE emp_id=672";
		  PreparedStatement prepareStatement = connection.prepareStatement(query);
		  System.out.println("DELETED!");
		  prepareStatement.execute();
		  connection.close();
}
}