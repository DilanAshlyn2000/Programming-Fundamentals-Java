package com.chainsys.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.dao.LoginPage;

import com.chainsys.day12.AddStudent1;

public class TestCollegeManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("_______________________________________________");
	    System.out.println("|               ABC COLLEGE                   |");
	    System.out.println("|               ***********                   |");
	    System.out.println("| Annamalai Nagar, Woraiyur, Tiruchirappalli, |");
	    System.out.println("|            Tamil Nadu 620002                |");
	    System.out.println("|=============================================|");
		System.out.println("|          BRILLIANCE BEYOND BOOKS            |");
		System.out.println("|_____________________________________________|");
		
		LoginPage login=new LoginPage();
		login.LoginCredentials();
		
//		AddStudent1 a=new AddStudent1();
//		a.insert(id, password);
			
     
	}
        }
        
	

	
