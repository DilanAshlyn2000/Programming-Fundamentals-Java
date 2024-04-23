package com.chainsys.day8;

import java.util.Scanner;

public class CollegeGrade {

	public static void examEligibility(float attendance,float gradePercentage) {
		System.out.println("\nELIGIBILITY FOR CIA EXAM:\n 1) ATTENDANCE PERCENTAGE = 75 and above \n 2) GRADE PERCENTAGE = 50 and above ");
		System.out.println("\nATTENDANCE PERCENTAGE: "+attendance);
		System.out.println("GRADE PERCENTAGE     : "+gradePercentage);
		if((attendance>75&&attendance<100)&&(gradePercentage>50 && gradePercentage<=100)) {
			
			System.out.println("RESULT:ELIGIBLE TO TAKE UP THE EXAM");
		}
		else {
			System.out.println("RESULT:NOT ELIGIBLE TO TAKE UP CIA EXAM");
		}
	        System.out.println("---------------------------------------------------------------------");
	
}
	public static void percentageCalculation(int classHeld) {
		int percentage,classAttended;
		Scanner sc=new Scanner(System.in);
		 System.out.println("\nEnter the number of classes attended:");
	      classAttended = sc.nextInt();
	        
	        percentage= (classAttended*100)/classHeld;
	        if(classHeld>classAttended) {
	        System.out.println("PERCENTAGE CALCULATION:");
	        System.out.println("NUMBER OF CLASSES HELD     : "+classHeld);
	        System.out.println("NUMBER OF CLASSES ATTENDED : "+classAttended);
	        System.out.println("PERCENTAGE                 : "+ percentage);
	        System.out.println("\nNOTE:YOUR PERCENTAGE HAS TO BE ABOVE 75 TO TAKE UP THE SEMESTER EXAM");
	        System.out.println("---------------------------------------------------------------------");
	        }
	        else {
	        	System.out.println("INVALID");
	        }
	}
}