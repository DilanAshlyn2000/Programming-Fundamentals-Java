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
		College d=new College();
	    d.userInput();
	    adminLogin();
		break;
	case '2':
		StudentListAdmin a=new StudentListAdmin();
		a.studentList();
		adminLogin();
		break;
	case '3':
		AdminStudent b=new AdminStudent();
		b.LoginCredentials();
		break;
	default:
		System.out.println("INVALID!");
		adminLogin();
		break;
	 }
   }
}
