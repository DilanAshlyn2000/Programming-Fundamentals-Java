package com.chainsys.dao;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.model.BMCollegeManagement;

//import com.chainsys.day10.LoginSql;
//AdminStudent
public class LoginPage {
	private int id;
	BMCollegeManagement a=new BMCollegeManagement();
	public void LoginCredentials() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN: \n1.ADMIN\n2.STUDENT");
		char login = sc.next().charAt(0);
		String Username = "admin";
		String Password = "admin03";
		switch (login) {
		case '1': {
			System.out.println("ADMIN LOGIN");
			System.out.println("Enter your username: ");
			String username = sc.next();
			System.out.println("Enter your password: ");
			String password = sc.next();
			if (username.equals(Username) && password.equals(Password)) {
				AdminLogin back = new AdminLogin();
				back.adminLogin();
			} else {
				System.out.println("Incorrect Username/Password.Please try again.");
				//College d = new College();
				LoginCredentials();
			}
			break;
		}
		case '2': {
			System.out.println("\n1.SIGN IN\n2.SIGN UP");
			char choice = sc.next().charAt(0);
			RegistrationSql1 sql = new RegistrationSql1();
			if (choice == '1') {
				System.out.println("Enter your ID");
				int id = sc.nextInt();
				a.setId(id);
				System.out.println("Enter your password");
				String password = sc.next();
				a.getPassword();
				if (sql.loginUser(id, password)) {
					StudentLogin s = new StudentLogin();
					s.login();
					
			}

//        	insert(id, Password);

				/*
				 * System.out.println("ENTER YOUR STUDENT ID: "); int id = sc.nextInt(); if(id>0
				 * && id<500) { System.out.println("ENTER YOUR PASSWORD:"); String
				 * password=sc.next(); String regExpn =
				 * "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
				 * Pattern patterns = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
				 * Matcher matchers = patterns.matcher(password); boolean valid =
				 * matchers.matches(); if(valid) {
				 * System.out.println("_______________________");
				 * System.out.println("|LOGGED IN SUCCESSFULLY|");
				 * System.out.println("|______________________|"); StudentLogin z=new
				 * StudentLogin(); z.login(); } else
				 * System.out.println("Your password is invalid."); } else {
				 * System.out.println("Your id is invalid"); } }
				 */
//        	LoginSql.insert(id, password);
			} else if (choice == '2') {
				System.out.println("Enter your ID");
				int id = sc.nextInt();
				a.setId(id);
				System.out.println("Enter your name");
				String name = sc.next();
				a.getName();
				System.out.println("Enter your password");
				String password = sc.next();
				
				String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

				Pattern patterns = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
				Matcher matchers = patterns.matcher(password);
				boolean valid = matchers.matches();

				if (valid) {
				//System.out.println("Enter your name");
				//String name = sc.next();
				 RegistrationSql1.registerUser(id, name, password);
			}else {
				System.out.println("INVALID PASSWORD! IT SHOULD CONTAIN ATLEAST ONE UPPERCASE,LOWERCASE,A DIGIT AND A SPECIAL CHARACTER.");
			}
		}
			LoginCredentials();
		}
	}
}
}