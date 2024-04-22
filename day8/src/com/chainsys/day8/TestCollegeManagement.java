package com.chainsys.day8;

import java.util.Scanner;

public class TestCollegeManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       /*String studentName,department;
    int id,year,numberOfArrears;
    float gradePercentage,attendance; */
		System.out.println("ENTER STUDENT NAME:");
		String studentName=sc.nextLine();
		System.out.println("ENTER THE DEPARTMENT'S NAME:");
		String department=sc.nextLine();
		System.out.println("ENTER THE STUDENT ID:");
		int id=sc.nextInt();
		System.out.println("ENTER THE YEAR:(1/2/3)");
		int year=sc.nextInt();
		System.out.println("ENTER THE NUMBER OF ARREARS:");
		int numberOfArrears=sc.nextInt();
		System.out.println("ENTER GRADE PERCENTAGE:");
		float gradePercentage=sc.nextFloat();
		System.out.println("ENTER THE ATTENDANCE PERCENTAGE:");
		float attendance=sc.nextFloat();
		
		CollegeManagement a=new CollegeManagement();
		a.setStudentName(studentName);
		a.setDepartment(department);
		a.setId(id);
		a.setYear(year);
		a.setNumberOfArrears(numberOfArrears);
		a.setGradePercentage(gradePercentage);
		a.setAttendance(attendance);
		System.out.println("\n             ABC COLLEGE");
		System.out.println("    Bachelor's Degree Student Details");
		System.out.println("***********************************************");
		System.out.println("\nNAME                 :"+a.getStudentName());
		System.out.println("DEPARTMENT           :"+a.getDepartment());
		System.out.println("ID                   :"+a.getId());
		System.out.println("YEAR                 :"+a.getYear());
		System.out.println("ARREARS              :"+a.getNumberOfArrears());
		System.out.println("GRADE PERCENTAGE     :"+a.getGradePercentage());
		System.out.println("ATTENDANCE PERCENTAGE:"+a.getAttendance());
		


	}

}
