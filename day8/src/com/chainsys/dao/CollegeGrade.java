package com.chainsys.dao;


import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.chainsys.model.BMCollegeManagement;

public class CollegeGrade {

	public static void examEligibility() throws ClassNotFoundException, SQLException{
		BMCollegeManagement ciaEligibility = RegistrationSql1.ciaEligibility(0);
//		System.out.println("ENTER YOUR ATTENDANCE PERCENTAGE:");
//		attendance=sc.nextFloat();
//		System.out.println("ENTER IF THE FEES IS PAID OR UNPAID:");
//		feeDetails=sc.next();
		
		if((ciaEligibility.getAttendance()>=0 && ciaEligibility.getAttendance()<=100)&&(ciaEligibility.getFeesPaid().equals("PAID"))||ciaEligibility.getFeesPaid().equals("UNPAID"))
		{
		System.out.println("\nELIGIBILITY FOR CIA EXAM:\n 1) ATTENDANCE PERCENTAGE = 75 and above \n 2) FEES SHOULD BE PAID ");
		System.out.println("\nATTENDANCE PERCENTAGE: "+ ciaEligibility.getAttendance());
		System.out.println("FEES UPDATE            : "+ ciaEligibility.getFeesPaid());
		if((ciaEligibility.getAttendance()>=75 && ciaEligibility.getAttendance()<=100)&&(ciaEligibility.getFeesPaid().equals("PAID"))) {
			System.out.println("RESULT:ELIGIBLE TO TAKE UP THE EXAM");
			StudentLogin log=new StudentLogin();
			 log.login();
		}
		else {
			System.out.println("RESULT:NOT ELIGIBLE TO TAKE UP CIA EXAM");
			StudentLogin log=new StudentLogin();
			 log.login();
		}
		
	        System.out.println("---------------------------------------------------------------------");
	}
		else
		
			System.out.println("INVALID INPUT!");
			examEligibility();
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