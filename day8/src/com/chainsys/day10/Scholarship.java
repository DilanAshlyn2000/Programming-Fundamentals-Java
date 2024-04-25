package com.chainsys.day10;

import java.util.Scanner;

public class Scholarship {
	public void scholarshipCollege(int scholarship1, int scholarship2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SCHOLARSHIP");
		System.out.println("-----------");
		char firstGraduate;
		System.out.println("ARE YOU A FIRST GRADUATE:(Y/N)");
		firstGraduate = sc.next().charAt(0);
		System.out.println("ENTER YOUR ANNUAL FAMILY INCOME");
		float income = sc.nextFloat();
		System.out.println("ENTER YOUR GPA:");
		float grade = sc.nextFloat();

		if (((firstGraduate == 'Y') || (firstGraduate == 'y')) && ((income > 0) && (income < 50000))
				&& ((grade > 0) && (grade > 7.5) && (grade <= 10))) {
			System.out.println("\nYOU ARE ELIGIBLE FOR A SCHOLARSHIP OF Rs." + scholarship1);
		} else if (((income > 0) && (income < 50000)) && ((grade > 0) && (grade > 7.5) && (grade <= 10))) {
			System.out.println("\nYOU ARE ELIGIBLE FOR A SCHOLARSHIP OF Rs." + scholarship2);
		} else {
			System.out.println("\nYOU ARE NOT ELIGIBLE FOR SCHOLARSHIP.");
		}
	}
}
