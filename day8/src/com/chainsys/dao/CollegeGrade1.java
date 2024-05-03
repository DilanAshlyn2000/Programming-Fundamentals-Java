package com.chainsys.dao;

import java.util.Scanner;

public class CollegeGrade1 extends CollegeGrade {
	public static void examEligibility() {
		float attendance,gradePercentage;
		int numberOfArrears;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR ATTENDANCE PERCENTAGE:");
		attendance=sc.nextFloat();
		System.out.println("ENTER YOUR EXAM PERCENTAGE:");
		gradePercentage=sc.nextFloat();
		System.out.println("NO.OF ARREARS:");
		numberOfArrears=sc.nextInt();
		if((attendance>0 && attendance<=100)&&(gradePercentage>0 && gradePercentage<=100)&&(numberOfArrears>=0 && numberOfArrears<=8))
		{
		System.out.println("\nELIGIBILITY FOR SEMESTER EXAM:\n 1) ATTENDANCE PERCENTAGE = 75 and above \n 2) GRADE PERCENTAGE = 50 and above \n 3) NO. OF ARREARS = NIL");
		System.out.println("\nATTENDANCE PERCENTAGE: "+attendance);
		System.out.println("GRADE PERCENTAGE     : "+gradePercentage);
		System.out.println("ARREARS              : "+numberOfArrears);
		if((attendance>75&&attendance<100)&&(gradePercentage>50 && gradePercentage<=100)&&(numberOfArrears==0)) {
			System.out.println("RESULT:ELIGIBLE TO TAKE UP SEMESTER EXAM");
		}
		else
			{
			System.out.println("RESULT:NOT ELIGIBLE TO TAKE UP SEMESTER EXAM, COMPLETE YOUR ARREARS!");
			}
		}
		else
		{
		System.out.println("INVALID INPUT");	
		examEligibility();
		}
		
    System.out.println("---------------------------------------------------------------------");
}
}
