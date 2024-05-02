package com.chainsys.day12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
	   
		
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CollegeDetails","root","Welcome#22");
        return connection;
}
	
}