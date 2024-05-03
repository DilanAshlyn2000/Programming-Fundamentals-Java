package com.chainsys.dao;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentListAdmin {
	public void studentList() throws ClassNotFoundException, SQLException {
	Scanner sc = new Scanner(System.in);
	System.out.println("DEGREE:\n 1.BACHELORS\n 2.MASTERS\n 3.EXIT");
	System.out.println("ENTER YOUR CHOICE: ");
	char degree = sc.next().charAt(0);
	if ((degree == '1') || (degree == '2')||(degree=='3')) {
		switch (degree) {
		case '1':
			System.out.println("ENTER THE DEPARTMENT:\n1.BCA\n2.ENGLISH\n3.TAMIL\n4.ZOOLOGY\n5.MATHS");
			System.out.println("ENTER YOUR CHOICE:");
			char department = sc.next().charAt(0);
			switch (department) {
			case '1':
				System.out.println("___________________________");
				System.out.println("|         BCA              |");
				System.out.println("|__________________________|");
				
				StudentList a=new StudentList();
		        a.sList(101, "ABIRAMI","BACHELORS" , "BCA", 1, 78.67, 0, 102, "BANU", 2, 89.45, 0, 103, "CATHERINE", 3, 56.23, 3, 104, "GAYU", 1, 85.78, 0, 105,"HARISH", 2, 23.56, 4);
			
				break;
			
			case '2':
				System.out.println("___________________________");
				System.out.println("|         ENGLISH          |");
				System.out.println("|__________________________|");
				 StudentList c=new StudentList();
			        c.sList1(201, "ANANYA","BACHELORS" , "ENGLISH", 1, 72.48, 0, 202, "BANUMATHI", 2, 79.45, 0, 203, "CAROLINE", 3, 51.29, 3, 204, "GANESH", 1, 81.11, 0, 205,"HARINI", 2, 23.51, 4);
				
				break;
			case '3':
				System.out.println("___________________________");
				System.out.println("|          TAMIL           |");
				System.out.println("|__________________________|");
				StudentList d=new StudentList();
		        d.sList2(301, "ABI","BACHELORS" , "TAMIL", 1, 74.11, 0, 302, "BARGAVI", 2, 90.45, 0, 303, "CAVIYA", 3, 52.83, 3, 304, "GOWTHAM", 1, 82.80, 0, 305,"HARI", 2, 23.06, 4);
			
		        
				break;
			case '4':
				System.out.println("___________________________");
				System.out.println("|         ZOOLOGY          |");
				System.out.println("|__________________________|");
				StudentList e=new StudentList();
		        e.sList3(401, "AMMU","BACHELORS" , "ZOOLOGY", 1, 73.17, 0, 402, "BALA", 2, 81.45, 0, 403, "DARATHY", 3, 53.03, 3, 404, "GAYATHRI", 1, 84.78, 0, 405,"HELLAN", 2, 22.76, 4);
			
				break;
			case '5':
				System.out.println("____________________________");
				System.out.println("|          MATHS           |");
				System.out.println("|__________________________|");
				StudentList f=new StudentList();
		        f.sList4(501, "ANNIE","BACHELORS" , "MATHS", 1, 74.07, 0, 502, "BALAJI", 2, 80.45, 0, 503, "DINESH", 3, 54.13, 3, 504, "GOKUL", 1, 88.08, 0, 505,"HANA", 2, 23.03, 4);
		       	break;
			default:
				System.out.println("INVALID!GIVE PROPER INPUT");
				studentList() ;
				break;
			}
			break;
		case'3':
			LoginPage a=new LoginPage();
			a.LoginCredentials();
			break;
		case '2':
			System.out.println("ENTER THE DEPARTMENT:\n1.TAMIL\n2.ENGLISH\n3.MATHS");
			System.out.println("ENTER YOUR CHOICE:");
			char department1 = sc.next().charAt(0);
			
			switch (department1) {
			case '1':
				System.out.println("TAMIL:");
				System.out.println("____________________________");
				System.out.println("|          TAMIL           |");
				System.out.println("|__________________________|");
				
		       StudentList h=new StudentList();
		        h.sList2(301, "ABI","MASTERS" , "TAMIL", 1, 74.11, 0, 302, "BARGAVI", 2, 90.45, 0, 303, "CAVIYA", 2, 52.83, 3, 304, "GOWTHAM", 1, 82.80, 0, 305,"HARI", 2, 23.06, 4);
		        
		       
				break;
			case '2':
			
				System.out.println("___________________________");
				System.out.println("|         ENGLISH          |");
				System.out.println("|__________________________|");
				StudentList g=new StudentList();
				g.sList1(201, "ANANYA","MASTERS" , "ENGLISH", 1, 72.48, 0, 202, "BANUMATHI", 2, 79.45, 0, 203, "CAROLINE", 2, 51.29, 3, 204, "GANESH", 1, 81.11, 0, 205,"HARINI", 2, 23.51, 4);
					
			        
				break;
			case '3':
		
				System.out.println("____________________________");
				System.out.println("|          MATHS           |");
				System.out.println("|__________________________|");
				 StudentList i=new StudentList();
			        i.sList4(501, "ANNIE","MASTERS" , "MATHS", 1, 74.07, 0, 502, "BALAJI", 2, 80.45, 0, 503, "DINESH", 2, 54.13, 3, 504, "GOKUL", 1, 88.08, 0, 505,"HANA", 2, 23.03, 4);
				
				
				break;
			default:
				System.out.println("INVALID!GIVE PROPER INPUT");
				studentList();
				break;
			}
		}
	} else {
		studentList();
	}
	
}
}