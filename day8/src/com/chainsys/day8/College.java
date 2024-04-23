package com.chainsys.day8;

import java.util.Scanner;

public class College {

	public void userInput() {
		String departmentB ,departmentM,course;
	    int id,yearB,yearM,numberOfArrears;
	    float gradePercentage,attendance;
	    BMCollegeManagement a=new BMCollegeManagement();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STUDENT ID:");
		id=sc.nextInt();
		System.out.println("ENTER COURSE:(BACHELORS/MASTERS)");
		course=sc.next();
		switch(course.toUpperCase()) {
		case "BACHELORS":
			System.out.println("THE COURSES OFFERED IN UNDER GRADUATION ARE:\n*COMPUTER SCIENCE\n*ENGLISH\n*TAMIL\n*ZOOLOGY\n*MATHS");
			System.out.println("ENTER THE DEPARTMENT:");
			departmentB=sc.next();
			a.setDepartmentB(departmentB);
			System.out.println("ENTER THE YEAR:(1/2/3)");
			yearB=sc.nextInt();
			a.setYearB(yearB);
			break;
		case "MASTERS":
			System.out.println("THE COURSES OFFERED IN POST GRADUATION ARE:\n*COMPUTER SCIENCE\n*ENGLISH\n*MATHS");
			System.out.println("ENTER THE DEPARTMENT:");
			departmentM=sc.next();
			a.setDepartmentM(departmentM);
			System.out.println("ENTER THE YEAR:(1/2)");
			yearM=sc.nextInt();
			a.setYearM(yearM);
			
		    break;
		default:
			System.out.println("INVALID!");
			return;
		
		}
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
	    System.out.println("\n             ABC COLLEGE");
		System.out.println("    Bachelor's Degree Student Details");
		System.out.println("***********************************************");
		System.out.println("ID                   :"+a.getId());
		if((course.equals("BACHELORS")) || (course.equals("Bachelors"))||(course.equals("bachelors"))){
	    System.out.println("DEPARTMENT           :"+a.getDepartmentB());
	    System.out.println("YEAR                 :"+a.getYearB());
	    }
		if((course.equals("MASTERS"))||(course.equals("Masters"))||(course.equals("masters"))) {
	    System.out.println("DEPARTMENT           :"+a.getDepartmentM());
	    System.out.println("YEAR                 :"+a.getYearM());
	    }
		System.out.println("ARREARS              :"+a.getNumberOfArrears());
		System.out.println("GRADE PERCENTAGE     :"+a.getGradePercentage());
		System.out.println("ATTENDANCE PERCENTAGE:"+a.getAttendance());
		System.out.println("***********************************************");
	    
		}
	}



