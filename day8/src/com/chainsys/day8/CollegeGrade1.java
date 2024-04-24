package com.chainsys.day8;

public class CollegeGrade1 extends CollegeGrade {
	public static void examEligibility(float attendance,float gradePercentage,int numberOfArrears) {
	
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
    System.out.println("---------------------------------------------------------------------");
}
}
