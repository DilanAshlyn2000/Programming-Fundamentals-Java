package com.chainsys.day8;

import java.util.Scanner;

public class TestCollegeManagement {

	public static void main(String[] args) {
		
		
		/*CollegeManagement a=new CollegeManagement();
		a.getUserDetails();*/
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN STUDENT/ADMIN:");
		String login=sc.next();
		String Username = "admin";
        String Password = "admin03";
        switch(login) {
        case "ADMIN":{
        System.out.println("ADMIN LOGIN");
        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        if (username.equals(Username) && password.equals(Password)) 
        {
	    College d=new College();
	    d.userInput();
        }
        else 
        {
            System.out.println("Incorrect Username/Password.Please try again.");
            College d=new College();
            d.userInput();
        }
        break;
        }
        case "STUDENT":
        	System.out.println("ENTER YOUR STUDENT ID:");
            int id = sc.nextInt();
            if(id>0 && id<=500) {
        System.out.println("ENTER YOUR CHOICE:\n1.COLLEGE DETAILS\n2.FACULTY\n3.PERCENTAGE CALCULATION\n4.EXAM ELIGIBILITY FOR CIA\n5.EXAM ELIGIBILITY FOR SEMESTER\n6.COLLEGE FEES");
        char choice=sc.next().charAt(0);
        switch(choice) {
        case '1':
        	HomePage e=new HomePage();
    		e.aboutCollege();
    		break;
    		
        case '2':
        	HomePage f=new HomePage();
    		f.facultyDetail();
            break;  
        case '3':
            CollegeGrade b=new CollegeGrade();
		    b.percentageCalculation(75);
		    break;
        case '4':
        	  CollegeGrade a=new CollegeGrade();
              a.examEligibility(78.98f,58f);
              break;
        case '5':
        CollegeGrade1 c=new CollegeGrade1();
        c.examEligibility(56.08f,71.0f,2);
		
        case '6':
		
		FeesCollege g=new FeesCollege();
		g.fee();
        default:
			System.out.println("INVALID!GIVE PROPER INPUT");
			break;
	}
            }
            else {
            	System.out.println("Incorrect ID.Please try again.");
            }break;
        }
	}
}
	
