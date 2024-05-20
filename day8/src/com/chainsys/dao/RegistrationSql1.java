package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.model.BMCollegeManagement;
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
        String insertQuery = "insert into studentdetails values(?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,null);
        preparedStatement.setInt(4,0);
        preparedStatement.setInt(5,0);
        preparedStatement.setFloat(6,0);
        preparedStatement.setInt(7,0);
        preparedStatement.setString(8,password);
        preparedStatement.setString(9, null);
        preparedStatement.setString(10, null);
        preparedStatement.setFloat(11,0);
        int executeUpdate = preparedStatement.executeUpdate();
        System.out.println(executeUpdate);
        return id;
    }
	
	public static void  adminInsert(int id,String departmentB,int year,int numberOfArrear,float gradePercentage ,float attendance) throws ClassNotFoundException, SQLException {
		Connection connection =  Connect1.getConnection();
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
	public static void feedbackInsert(int id,String feedback) throws ClassNotFoundException, SQLException {
		Connection connection =  Connect1.getConnection();
		String feedback1="update studentdetails set feedback=? where stu_id="+id;
		PreparedStatement preparedStatement = connection.prepareStatement(feedback1);
        preparedStatement.setString(1,feedback);
        int executeUpdate = preparedStatement.executeUpdate();
	}
	
	public static void feesInsert(int id,String feesPaid) throws ClassNotFoundException, SQLException {
		Connection connection =  Connect1.getConnection();
		String feedback1="update studentdetails set feesDetails=? where stu_id="+id;
		PreparedStatement preparedStatement = connection.prepareStatement(feedback1);
        preparedStatement.setString(1,feesPaid);
        int executeUpdate = preparedStatement.executeUpdate();
	}
	public static void internalMarkInsert(int id,float internalMark) throws ClassNotFoundException, SQLException {
		Connection connection =  Connect1.getConnection();
		String marksupdate="update studentdetails set CIA=? where stu_id="+id;
		PreparedStatement preparedStatement = connection.prepareStatement(marksupdate);
        preparedStatement.setFloat(1,internalMark);
        int executeUpdate = preparedStatement.executeUpdate();
	}
	public void deleteStudent(int id) throws ClassNotFoundException, SQLException {
		Connection connection =  Connect1.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ID:");
		id=sc.nextInt();
		System.out.println("Deleted Student Details");
		String delete="delete from studentdetails where stu_id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setFloat(1,id);
        int executeUpdate = preparedStatement.executeUpdate();
	}
	
	/*public void read1(int id)throws ClassNotFoundException,SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STUDENT ID:");
		 id=sc.nextInt();
		 Connection connection =  Connect1.getConnection();
		 String readQuery="SELECT(stu_id, name, departmentB, year, numberOfArrear, gradePercentage , attendance) FROM studentdetails WHERE stu_id =?";
			PreparedStatement preparedStatement = connection.prepareStatement(readQuery);
			preparedStatement.setInt(1, id);
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
	   }*/
	/*public void read1(int id)throws ClassNotFoundException,SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STUDENT ID:");
		id=sc.nextInt();
		 int stu_id=sc.nextInt();
		 Connection connection =  Connect1.getConnection();
		 String readQuery="SELECT name, departmentB, year, numberOfArrear, gradePercentage) FROM studentdetails WHERE stu_id value=?";
			PreparedStatement preparedStatement = connection.prepareStatement(readQuery);
			preparedStatement.setInt(1, stu_id);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        ResultSetMetaData set=resultSet.getMetaData();
	        int column=set.getColumnCount();
	        while(resultSet.next())
	        	for(int i=1;i<=column;i++)
	        	{ 
	        		String ColumnValue=resultSet.getString(i);
	        		System.out.println(set.getColumnName(i)+""+ColumnValue);
	        	}
	        	System.out.println();
	        
	
	}*/
	public static BMCollegeManagement ciaEligibility(int id)throws ClassNotFoundException,SQLException {
	 Connection connection =  Connect1.getConnection();
	 Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ID:");
		id=sc.nextInt();
	 String readQuery="SELECT attendance,feesDetails FROM studentdetails WHERE stu_id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(readQuery);
		preparedStatement.setInt(1,id);
       ResultSet resultSet = preparedStatement.executeQuery();
       Float attendance=0f;
       String feesDetail=null;
       while(resultSet.next()) {
       	attendance=resultSet.getFloat("attendance");
       	feesDetail=resultSet.getNString("feesDetails");
       }
       BMCollegeManagement bm=new BMCollegeManagement();
       bm.setAttendance(attendance);
       bm.setFeesPaid(feesDetail);
       return bm;
 }
	public static BMCollegeManagement ciaEligibilitysem(int id)throws ClassNotFoundException,SQLException {
		 Connection connection =  Connect1.getConnection();
		 
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE ID:");
			id=sc.nextInt();
		 String readQuery="SELECT attendance,CIA,numberOfArrears FROM studentdetails WHERE stu_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(readQuery);
			preparedStatement.setInt(1,id);
	       ResultSet resultSet = preparedStatement.executeQuery();
	       Float attendance=0f;
	       int numberOfArrears=0;
	       float internalMark=0f;
		   while(resultSet.next()) {
	       	attendance=resultSet.getFloat("attendance");
	       	internalMark=resultSet.getFloat("CIA");
	       	numberOfArrears=resultSet.getInt("numberOfArrears");
	       }
	       BMCollegeManagement bm=new BMCollegeManagement();
	       bm.setAttendance(attendance);
	       bm.setInternalMark(internalMark);
	       bm.setNumberOfArrears(numberOfArrears);
	       return bm;
	 }
	public static int insertFaculty(int facultyId, String facultyName, String facultyDepartment, String qualification) throws ClassNotFoundException, SQLException {
        Connection connection =  Connect1.getConnection();
        String insertQuery = "insert into facultydetails values(?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, facultyId);
        preparedStatement.setString(2,facultyName);
        preparedStatement.setString(3,facultyDepartment);
        preparedStatement.setString(4,qualification);
        int executeUpdate = preparedStatement.executeUpdate();
        System.out.println(executeUpdate);
        return facultyId;
    }
	public void deleteFaculty(int facultyId) throws ClassNotFoundException, SQLException {
		Connection connection =  Connect1.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ID:");
		facultyId=sc.nextInt();
		System.out.println("Deleted Faculty Details");
		String delete="delete from facultydetails where facultyId=?";
		PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setFloat(1,facultyId);
        int executeUpdate = preparedStatement.executeUpdate();
	}
}

