package com.chainsys.dao;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.chainsys.model.BMCollegeManagement;

public class CollegeGrade1 extends CollegeGrade {
	public static void examEligibility() throws ClassNotFoundException, SQLException {
	
		BMCollegeManagement ciaEligibilitysem = RegistrationSql1.ciaEligibilitysem(0);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("ENTER YOUR ATTENDANCE PERCENTAGE:");
//		try{
//		attendance=sc.nextFloat();
//		System.out.println("ENTER YOUR EXAM PERCENTAGE:");
//		gradePercentage=sc.nextFloat();
//		System.out.println("NO.OF ARREARS:");
//		numberOfArrears=sc.nextInt();
	//	if((ciaEligibilitysem.getAttendance()>=0 && ciaEligibilitysem.getAttendance()<=100)&&(ciaEligibilitysem.getInternalMark()>=0 && ciaEligibilitysem.getInternalMark()>=100)&&(ciaEligibilitysem.getNumberOfArrears()>=0 && ciaEligibilitysem.getNumberOfArrears()<=8))
			
		//if((attendance>=0 && attendance<=100)&&(gradePercentage>0 && gradePercentage<=100)&&(numberOfArrears>=0 && numberOfArrears<=8))		
		
		System.out.println("\nELIGIBILITY FOR SEMESTER EXAM:\n 1) ATTENDANCE PERCENTAGE = 75 and above \n 2) INTERNAL MARKS = 50 and above \n 3) NO. OF ARREARS = NIL");
		System.out.println("\nATTENDANCE PERCENTAGE: "+ciaEligibilitysem.getAttendance());
		System.out.println("INTERNAL MARKS       : "+ciaEligibilitysem.getInternalMark());
		System.out.println("ARREARS              : "+ciaEligibilitysem.getNumberOfArrears());
		
		//if((attendance>75&&attendance<100)&&(gradePercentage>50 && gradePercentage<=100)&&(numberOfArrears==0)) {
		if((ciaEligibilitysem.getAttendance()>=75 && ciaEligibilitysem.getAttendance()<=100)&&(ciaEligibilitysem.getInternalMark()>=50 && ciaEligibilitysem.getInternalMark()>=100)&&(ciaEligibilitysem.getNumberOfArrears()==0))
		{	
		System.out.println("RESULT:ELIGIBLE TO TAKE UP SEMESTER EXAM");
		}
		else
		{
			System.out.println("RESULT:NOT ELIGIBLE TO TAKE UP SEMESTER EXAM, COMPLETE YOUR ARREARS!");
		}
		
		//
//	}
//		catch(InputMismatchException  e) {
//			System.out.println("InputMismatchException");
//		}
    System.out.println("---------------------------------------------------------------------");

}
}
