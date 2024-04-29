package com.chainsys.day10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewUserLogin {
	String departmentB, departmentM;

	public void newUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" REGISTRATION FORM");
		System.out.println("ENTER YOUR STUDENT ID: ");
		int id = sc.nextInt();
		System.out.println("ENTER COURSE:(BACHELORS/MASTERS)");
		String course = sc.next();
		switch (course.toUpperCase()) {
		case "BACHELORS":
			System.out.println("SELECT DEPARTMENT:BCA, ENGLISH, TAMIL, ZOOLOGY, MATHS");
			System.out.println("ENTER THE DEPARTMENT:");
			departmentB = sc.next();
			break;
		case "MASTERS":
			System.out.println("SELECT DEPARTMENT:TAMIL, ENGLISH, MATHS");
			System.out.println("ENTER THE DEPARTMENT:");
			departmentM = sc.next();
			break;
		default:
			System.out.println("INVALID! ");
			newUser();
			return;
		}
		System.out.println("ENTER YOUR PASSWORD:");
		String password = sc.next();
		String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

		Pattern patterns = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
		Matcher matchers = patterns.matcher(password);
		boolean valid = matchers.matches();

		if (valid) {
			if (id > 0 && id < 500) {
				System.out.println("________________________________");
				System.out.println("  STUDENT ID    : " + id);
				if ((course.equals("MASTERS")) || (course.equals("Masters")) || (course.equals("masters"))) {
					System.out.println("  DEPARTMENT    : " + departmentM);
				}
				if ((course.equals("BACHELORS")) || (course.equals("Bachelors")) || (course.equals("bachelors"))) {
					System.out.println("  DEPARTMENT    : " + departmentB);
				}
				System.out.println("________________________________");
				System.out.println("|  REGISTRACTION SUCCESSFUL    |");
				System.out.println("|______________________________|");

				LoginPage log = new LoginPage();
				log.LoginCredentials();

			} else {
				System.out.println("INVALID");
				newUser();
			}
		} else {
			System.out.println("INVALID");
			newUser();
		}
	}
}
