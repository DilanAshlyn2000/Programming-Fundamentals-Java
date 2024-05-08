package com.chainsys.dao;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminLogin {
	public void adminLogin() throws ClassNotFoundException, SQLException {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER YOUR CHOICE:");
	System.out.println("------------------");
	System.out.println("1. ADD STUDENT\n2. VIEW STUDENT DETAILS\n3. UPDATE FEES PAID/UNPAID\n4. UPDATE INTERNAL MARKS\n5. EXIT");
	char choice=sc.next().charAt(0);
	switch(choice) {
	case '1':
		College add=new College();
	    add.userInput();
	    adminLogin();
		break;
	case '2':
		StudentListAdmin view=new StudentListAdmin();
		RegistrationSql display=new RegistrationSql();
		display.show();
		//view.studentList();
		adminLogin();
		break;
	case '3':
		FeesCollege fee=new FeesCollege();
		fee.feesPaid();
		adminLogin();
		break;
	case '4':
		College mark=new College();
		mark.internalMarks();
		adminLogin();
		break;
	case '5':
		LoginPage exit=new LoginPage();
		exit.LoginCredentials();
		break;
	default:
		System.out.println("INVALID");
		adminLogin();
		break;
	 }
	
   }
}
