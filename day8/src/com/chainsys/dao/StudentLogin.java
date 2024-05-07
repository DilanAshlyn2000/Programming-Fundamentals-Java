package com.chainsys.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.model.BMCollegeManagement;

public class StudentLogin extends BMCollegeManagement{
public void login() throws ClassNotFoundException, SQLException {
Scanner sc=new Scanner(System.in); 
System.out.println("ENTER YOUR CHOICE:");
System.out.println("------------------");
System.out.println("1.COLLEGE DETAILS(1.Vision,Mission & Motto  2.College Profile  3.Honours Conferred & Awards Received)\n2.DEPARTMENTS\n3.FACULTY\n4.PERCENTAGE CALCULATION\n5.EXAM ELIGIBILITY FOR CIA\n6.EXAM ELIGIBILITY FOR SEMESTER\n7.COLLEGE FEES\n8.SCHOLARSHIP\n9.FEEDBACK AND SUGGESTION FORM\n10.EXIT ");

String choice=sc.next();
switch(choice) {
case "1":
	HomePage details=new HomePage();
	details.aboutCollege();
	login();
	break;
	
case "2":
	DepartmentDetails1 display=new DepartmentDetails1();
	display.departmentDetails();
	display.departmentInformation();
	login();
	break;
case "3":
	HomePage professor=new HomePage();
	professor.facultyDetail();
	login();
    break;  
case "4":
    CollegeGrade percentage=new CollegeGrade();
    percentage.percentageCalculation(75);
    login();
    break;
case "5":
	  CollegeGrade cia=new CollegeGrade();
      cia.examEligibility();
      login();
      break;
case "6":
      CollegeGrade1 semester=new CollegeGrade1();
      semester.examEligibility();
      login();
      break;
case "7":
      FeesCollege pay=new FeesCollege();
      pay.fee();
      login();
      break;
case "8":
	Scholarship reduction=new Scholarship();
	reduction.scholarshipCollege(4000, 2500);
	login();
	break;
case "9":
	FeedBack1 form=new FeedBack1();
	form.collegeFeedBack();
	form.collegeSuggestion();
	RegistrationSql1 feed=new RegistrationSql1();
//	feed.feedbackInsert(id,feedback);
	feed.feedbackInsert(id, feedback);
	login();
	break;
case "10":
	System.out.println("THANK YOU");
	LoginPage exit=new LoginPage();
	exit.LoginCredentials();
	break;
default:
	System.out.println("INVALID!");
	login();
	break;
  }
 }
}
