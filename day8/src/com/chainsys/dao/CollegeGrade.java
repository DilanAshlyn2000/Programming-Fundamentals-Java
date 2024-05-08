package com.chainsys.dao;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CollegeGrade {

	public static void examEligibility(){
		float attendance;
		String feeDetails;
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ID:");
		id=sc.nextInt();
		System.out.println("ENTER YOUR ATTENDANCE PERCENTAGE:");
		attendance=sc.nextFloat();
		System.out.println("ENTER IF THE FEES IS PAID OR UNPAID:");
		feeDetails=sc.next();
		if((attendance>0 && attendance<=100)&&(feeDetails.equals("PAID"))||(feeDetails.equals("UNPAID")))
		{
		System.out.println("\nELIGIBILITY FOR CIA EXAM:\n 1) ATTENDANCE PERCENTAGE = 75 and above \n 2) FEES SHOULD BE PAID ");
		System.out.println("\nATTENDANCE PERCENTAGE: "+attendance);
		System.out.println("FEES UPDATE            : "+feeDetails);
		if((attendance>75&&attendance<100)&&(feeDetails.equals("PAID"))) {
			System.out.println("RESULT:ELIGIBLE TO TAKE UP THE EXAM");
		}
		else {
			System.out.println("RESULT:NOT ELIGIBLE TO TAKE UP CIA EXAM");
		}
	        System.out.println("---------------------------------------------------------------------");
		}
		else
		{
			System.out.println("INVALID INPUT!");
			examEligibility();
		}
}
	public static void percentageCalculation(int classHeld) {
		int percentage,classAttended;
		Scanner sc=new Scanner(System.in);
		 System.out.println("\nENTER THE NUMBER OF CLASSES ATTENDED FOR 75 days:");
	      try {
		 classAttended = sc.nextInt();
		 percentage= (classAttended*100)/classHeld;
	        if(classHeld>classAttended) {
	        System.out.println("PERCENTAGE CALCULATION:");
	        System.out.println("NUMBER OF CLASSES HELD     : "+classHeld);
	        System.out.println("NUMBER OF CLASSES ATTENDED : "+classAttended);
	        System.out.println("PERCENTAGE                 : "+ percentage+"%");
	        System.out.println("\nNOTE:YOUR PERCENTAGE HAS TO BE ABOVE 75 TO TAKE UP THE SEMESTER EXAM");
	        System.out.println("---------------------------------------------------------------------");
	        } else {
	        	System.out.println("INVALID! ENTER CORRECT NUMBER OF CLASSES ATTENDED");
	        	percentageCalculation(75);
	        }
	      }
	      catch(InputMismatchException e) {
	    	  System.out.println("InputMismatchException: CLASS ATTENDED SHOULD BE LESS THAN 75");
	      }
	      
	   }
}