package com.chainsys.day10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminStudent {
	public void LoginCredentials() {
	    Scanner sc = new Scanner(System.in);

		
		System.out.println("LOGIN: \n1.ADMIN\n2.STUDENT");
		char login=sc.next().charAt(0);
		String Username = "admin";
        String Password = "admin03";
        switch(login) {
        case '1':{
        System.out.println("ADMIN LOGIN");
        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        if (username.equals(Username) && password.equals(Password)) 
        {
        	AdminLogin g=new AdminLogin();
        	g.adminLogin();
	    //College d=new College();
	   // d.userInput();
        }
        else 
        {
            System.out.println("Incorrect Username/Password.Please try again.");
            College d=new College();
            LoginCredentials();
            //d.userInput();
        }
        break;
        }
        case '2':
        {
        System.out.println("\n1.LOG IN\n 2.SIGN IN");
        char choice=sc.next().charAt(0);
        if(choice=='1') {
          System.out.println("ENTER YOUR STUDENT ID: ");
  	      int id = sc.nextInt();
  	      if(id>0 && id<500)
  	      {
  	    	  System.out.println("ENTER YOUR PASSWORD:");
  	    	  String password=sc.next();
  	    	  String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

  	          Pattern patterns = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
  	          Matcher matchers = patterns.matcher(password);
  	          boolean valid = matchers.matches();  
  	          
  	          if(valid) {
  	          System.out.println("_______________________");
  	          System.out.println("|LOGGED IN SUCCESSFULLY|");
  	          System.out.println("|______________________|");
  	        StudentLogin z=new StudentLogin();
        	z.login();
        	}
  	          else
  	                  System.out.println("Your password is invalid.");
  	              }
  		      else {
  	                  System.out.println("Your id is invalid");
  	              }
        }          
        else if(choice=='2') {
        	NewUserLogin b=new NewUserLogin();
    		b.newUser();
            }   	
        else {
        	System.out.println("INVALID! GIVE PROPER INPUT");
        	 LoginCredentials();
        }
        }
               }
        LoginCredentials();
	}
}
