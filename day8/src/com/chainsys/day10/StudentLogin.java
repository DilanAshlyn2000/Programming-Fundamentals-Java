package com.chainsys.day10;

import java.util.Scanner;

public class StudentLogin {
public void login() {
	
	/*System.out.println("ENTER YOUR STUDENT ID:");
    int id = sc.nextInt();
    System.out.println("ENTER YOUR PASSWORD:");
    String password=sc.next();*/
	Scanner sc=new Scanner(System.in);
    
   
System.out.println("ENTER YOUR CHOICE:");
System.out.println("------------------");
System.out.println("1.COLLEGE DETAILS(1.Vision,Mission & Motto  2.College Profile  3.Honours Conferred & Awards Received)\n2.DEPARTMENTS\n3.FACULTY\n4.PERCENTAGE CALCULATION\n5.EXAM ELIGIBILITY FOR CIA\n6.EXAM ELIGIBILITY FOR SEMESTER\n7.COLLEGE FEES\n8.SCHOLARSHIP\n9.EXIT");

char choice=sc.next().charAt(0);

switch(choice) {
case '1':
	HomePage e=new HomePage();
	e.aboutCollege();
	login();
	break;
	
case '2':
	Department i=new Department();
	i.departmentDetails();
	login();
	break;
case '3':
	HomePage f=new HomePage();
	f.facultyDetail();
	login();
    break;  
case '4':
    CollegeGrade b=new CollegeGrade();
    b.percentageCalculation(75);
    login();
    break;
case '5':
	  CollegeGrade a=new CollegeGrade();
      a.examEligibility();
      login();
      break;
case '6':
      CollegeGrade1 c=new CollegeGrade1();
      c.examEligibility();
      login();
      break;
case '7':
      FeesCollege g=new FeesCollege();
      g.fee();
      login();
      break;
case '8':
	Scholarship h=new Scholarship();
	h.scholarshipCollege(4000, 2500);
	login();
	break;
case '9':
	System.out.println("THANK YOU");
	AdminStudent s=new AdminStudent();
	s.LoginCredentials();
	break;
default:
	System.out.println("INVALID!");
	login();
	break;
  }

}
}
