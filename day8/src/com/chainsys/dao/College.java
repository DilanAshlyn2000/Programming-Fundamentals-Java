package com.chainsys.dao;

import java.sql.SQLException;

import java.util.Scanner;

import com.chainsys.model.BMCollegeManagement;

public class College {
	BMCollegeManagement a=new BMCollegeManagement();
	public void userInput() throws ClassNotFoundException, SQLException {
		String departmentB;
		//String departmentM,course;
	    int id,yearB,numberOfArrears;
	    //int yearM;
	    float gradePercentage,attendance;
	    //BMCollegeManagement a=new BMCollegeManagement();
		Scanner sc=new Scanner(System.in);
		System.out.println("ADDING STUDENT");
		System.out.println("ENTER THE STUDENT ID:");
		id=sc.nextInt();
		
		/*System.out.println("ENTER COURSE:(BACHELORS/MASTERS)");
		course=sc.next();
		switch(course.toUpperCase()) {
		case "BACHELORS":
			System.out.println("THE COURSES OFFERED IN UNDER GRADUATION ARE:\n*BCA\n*ENGLISH\n*TAMIL\n*ZOOLOGY\n*MATHS");*/
			System.out.println("ENTER THE DEPARTMENT:\nTHE COURSES OFFERED ARE:\n*BCA\n*ENGLISH\n*TAMIL\n*ZOOLOGY\n*MATHS");
			departmentB=sc.next();
			a.setDepartmentB(departmentB);
			System.out.println("ENTER THE YEAR:(1/2/3)");
			yearB=sc.nextInt();
			a.setYearB(yearB);
			/*break;
		case "MASTERS":
			System.out.println("THE COURSES OFFERED IN POST GRADUATION ARE:\n*TAMIL\n*ENGLISH\n*MATHS");
			System.out.println("ENTER THE DEPARTMENT:");
			departmentM=sc.next();
			a.setDepartmentM(departmentM);
			System.out.println("ENTER THE YEAR:(1/2)");
			yearM=sc.nextInt();
			a.setYearM(yearM);
		    break;
		default:
			System.out.println("INVALID");
			return;
		}*/
		System.out.println("ENTER THE NUMBER OF ARREARS:");
		numberOfArrears=sc.nextInt();
		System.out.println("ENTER GRADE PERCENTAGE:");
		gradePercentage=sc.nextFloat();
		System.out.println("ENTER THE ATTENDANCE PERCENTAGE:");
	    attendance=sc.nextFloat();
	    a.setId(id);
		a.setNumberOfArrears(numberOfArrears);
		a.setGradePercentage(gradePercentage);
		a.setAttendance(attendance);
		RegistrationSql.adminInsert(id,departmentB, yearB, numberOfArrears, gradePercentage, attendance);
		System.out.println("\n***********************************************");
	    System.out.println("            ABC COLLEGE");
		System.out.println("***********************************************");
		System.out.println("Student Details:");
		System.out.println("----------------");
		System.out.println("ID                   :"+a.getId());
		//if((course.equals("BACHELORS")) || (course.equals("Bachelors"))||(course.equals("bachelors"))){
	    System.out.println("DEPARTMENT           :"+a.getDepartmentB());
	    System.out.println("YEAR                 :"+a.getYearB());
	   // }
	/*	if((course.equals("MASTERS"))||(course.equals("Masters"))||(course.equals("masters"))) {
	    System.out.println("DEPARTMENT           :"+a.getDepartmentM());
	    System.out.println("YEAR                 :"+a.getYearM());
	    }*/
		System.out.println("ARREARS              :"+a.getNumberOfArrears());
		System.out.println("GRADE PERCENTAGE     :"+a.getGradePercentage());
		System.out.println("ATTENDANCE PERCENTAGE:"+a.getAttendance());
		System.out.println("***********************************************");
	    System.out.println("          STUDENT DETAILS UPDATED");

	}
	public void internalMarks() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STUDENT'S ID:");
		int id=sc.nextInt();
	    a.setId(id);
		System.out.println("ENTER THE INTERNAL MARK PERCENTAGE:");
		float internalMark=sc.nextFloat();
		a.setInternalMark(internalMark);
		RegistrationSql1.internalMarkInsert(id, internalMark);
		System.out.println("***********************************************");
		System.out.println("               MARKS UPDATED!");
		}
	}



