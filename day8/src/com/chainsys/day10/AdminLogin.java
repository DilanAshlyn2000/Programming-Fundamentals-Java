package com.chainsys.day10;

import java.util.Scanner;

public class AdminLogin {
	public void adminLogin() {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER YOUR CHOICE:");
	System.out.println("------------------");
	System.out.println("1. ADD STUDENT\n2. VIEW STUDENT DETAILS\n3. EXIT");
	char choice=sc.next().charAt(0);
	switch(choice) {
	case '1':
		College add=new College();
	    add.userInput();
	    adminLogin();
		break;
	case '2':
		StudentListAdmin view=new StudentListAdmin();
		view.studentList();
		adminLogin();
		break;
	case '3':
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
