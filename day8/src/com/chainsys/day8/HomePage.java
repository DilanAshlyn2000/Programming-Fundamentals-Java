package com.chainsys.day8;

import java.util.Scanner;

public class HomePage {
public void aboutCollege(){
	Scanner sc=new Scanner(System.in);
	System.out.println("ABOUT US:\n 1.Vision,Mission & Motto\n 2.College Profile\n 3.Honours Conferred & Awards Received");
	System.out.println("ENTER YOUR CHOICE:");
	char aboutUs = sc.next().charAt(0);
	
	switch(aboutUs) {
	case '1':
		System.out.println("\nVISION:");
		System.out.println("        To impart holistic education to students,\nto provide them with ample learning experiences and opportunities,\nto guide them towards the optimum use of their knowledge and skill,\nand to empower them to become enlightened,\nempathetic and socially responsible citizens of the future.");
	    System.out.println("\nMISSION:");
	    System.out.println("       *To promote a multicultural, multilingual and secular co-educational learning environment that is inclusive, tolerant, and supportive of the pursuit of knowledge.\r\n"
	    		+ "       *To provide education that is accessible to all and inexpensive in nature, thereby constructing a democratic space fostering academic excellence.\r\n"
	    		+ "       *To guide students towards the successful completion of their degrees and channelize them towards the pursuance of higher degrees in their selected or allied fields of study.");
	    System.out.println("\nMOTTO:");
	    System.out.println("        To act as a bridge between the academic and the social ambit outside of it for moral, intellectual and cultural advancement of society, thereby effortlessly combining traditional values and modern aesthetics with integrity and passion.");
		System.out.println("*********************************************************************************************");
	    break;
	case '2':
		System.out.println("\nCOLLEGE PROFILE:");
		System.out.println("       Our College has always been regarded as a centre of academic excellence");
		System.out.println("The institute has gathered considerable respect in the academic arena as its students have often shown outstanding performance, with more than 50% of them securing First Class marks.");
		System.out.println("*********************************************************************************************");
		break;
	case '3':
		System.out.println("\nHONOURS CONFERRED & AWARDS RECEIVED:");
		System.out.println("       *Governor’s Volunteer Award\r\n"
				+ "       *National Student Volunteer Award\r\n"
				+ "       *President’s Award for Educational Achievement\r\n"
				+ "       *President’s Award for Educational Excellence\r\n"
				+ "       *President’s National Service Award");
		System.out.println("*********************************************************************************************");
		break;
	default:
		System.out.println("INVALID!");
		return;
	}
	}

public void facultyDetail() {
	System.out.println("FACULTIES:\n 1.BACHELORS\n 2.MASTERS");
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR CHOICE:");
	char faculty = sc.next().charAt(0);
	
	switch(faculty) {
	case '1':
		System.out.println("ENTER THE DEPARTMENT:\n1.BCA\n2.ENGLISH\n3.TAMIL\n4.ZOOLOGY\n5.MATHS");
		System.out.println("ENTER YOUR CHOICE:");
		char departmentFaculty=sc.next().charAt(0);
		System.out.println("FACULTIES FOR BACHELORS");
		System.out.println("-----------------------");
		switch(departmentFaculty) {
		case '1':
			System.out.println("BCA:");
			System.out.println("Mrs. V. Elizabeth Rani\nMr. Loyola Prince\nMrs. A. R. Jacintha\nMrs.P. Shanthi Rekha");
			break;
		case '2':
			System.out.println("ENGLISH:");
			System.out.println("Mr. V. Venis\nMrs. R. Sundari \nMrs. P. Senthil Vadivu\nMrs. S. Mary Pushpa Rani\nMrs. S. Annamayil");
		    break;
		case '3':
			System.out.println("TAMIL:");
			System.out.println("Mr. T. Appavu\nMrs. Y. Catherine\nMrs. M. Magdaline Manonmani\nMrs. N. Nachammai");
		    break;
		case'4':
			System.out.println("ZOOLOGY:");
			System.out.println("Mrs. D. Emelda Daisy\nMrs. A. Anna Kamu\nMrs. M. Ahila\nMrs. A. Lourdu Jeyam\nMrs. P. Kala Devi");
		    break;
		case'5':
			System.out.println("MATHS:");
			System.out.println("Mrs. P. Jeya\nMrs. V. Saradha\nMr. M. Jeya Kumar\nMrs. S. Muthu Meenal");
		    break;
		default:
			System.out.println("INVALID!GIVE PROPER INPUT");
			facultyDetail();
			break;
		}break;
	case '2':
		System.out.println("ENTER THE DEPARTMENT:\n1.TAMIL\n2.ENGLISH\n3.MATHS");
		System.out.println("ENTER YOUR CHOICE:");
		char departmentFaculty1=sc.next().charAt(0);
		System.out.println("FACULTIES FOR MASTERS");
		System.out.println("---------------------");
		switch(departmentFaculty1) {
		case '1':
			System.out.println("TAMIL:");
			System.out.println("Mr. T. Appavu\nMrs. Y. Catherine\nMrs. M. Magdaline Manonmani\nMrs. N. Nachammai");
			break;
		case '2':
			System.out.println("ENGLISH:");
			System.out.println("Mr. V. Venis\nMrs. R. Sundari \nMrs. P. Senthil Vadivu\nMrs. S. Mary Pushpa Rani\nMrs. S. Annamayil");
		    break;
		case '3':
			System.out.println("MATHS:");
			System.out.println("Mrs. V. Elizabeth Rani\nMr. Loyola Prince\nMrs. A. R. Jacintha\nMrs.P. Shanthi Rekha");
		    break;
		default:
			System.out.println("INVALID!GIVE PROPER INPUT");
			facultyDetail();
			break;
}
}
	System.out.println("*********************************************************************************************");

}
}


	

	
