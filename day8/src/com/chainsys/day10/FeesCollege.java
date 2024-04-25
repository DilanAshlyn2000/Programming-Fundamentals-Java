package com.chainsys.day10;

import java.util.Scanner;

public class FeesCollege {
public void fee() {
	System.out.println("COLLEGE FEES:\n 1.BACHELORS\n 2.MASTERS");
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR CHOICE:");
	char fee = sc.next().charAt(0);
	int hFee,totalFee;
	String hostelFee;
	
	switch(fee) {
	case '1':
		System.out.println("ENTER THE DEPARTMENT:\n1.BCA\n2.ENGLISH\n3.TAMIL\n4.ZOOLOGY\n5.MATHS");
		System.out.println("ENTER YOUR CHOICE:");
		char feeB=sc.next().charAt(0);
		System.out.println("COLLEGE FEES FOR BACHELORS");
		System.out.println("-----------------------");
		switch(feeB) {
		case '1':
			
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
		     hostelFee=sc.next();
		     if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
		     
		     totalFee=22000+hFee;
	
		     if((hostelFee.equals("YES"))||(hostelFee.equals("yes"))) {
			System.out.println("   DEPARTMENT:BCA");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("COMPUTER FEE    :3000");
			System.out.println("TUITION FEE     :12000");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
		     }else
				System.out.println("INVALID INPUT");
		     fee();
			break;
		case '2':
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
			hostelFee=sc.next();
			if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
			totalFee=20000+hFee;
			System.out.println("  DEPARTMENT:ENGLISH");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("COMPUTER FEE    :1000");
			System.out.println("TUITION FEE     :12000");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
		    break;
		case '3':
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
			hostelFee=sc.next();
			if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
			totalFee=18000+hFee;
			System.out.println("  DEPARTMENT:TAMIL");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("COMPUTER FEE    :1000");
			System.out.println("TUITION FEE     :10000");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
		    break;
		case'4':
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
			hostelFee=sc.next();
			if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
			totalFee=20000+hFee;
			System.out.println("  DEPARTMENT:ZOOLOGY");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("LAB FEE         :2000");
			System.out.println("TUITION FEE     :11000");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
			 break;
		case'5':
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
			hostelFee=sc.next();
			if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
			totalFee=19000+hFee;
			System.out.println("  DEPARTMENT:MATHS");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("COMPUTER FEE    :500");
			System.out.println("TUITION FEE     :11500");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
			break;
		default:
			System.out.println("INVALID!GIVE PROPER INPUT");
			fee();
			break;
		}break;
	case '2':
		System.out.println("ENTER THE DEPARTMENT:\n1.TAMIL\n2.ENGLISH\n3.MATHS");
		System.out.println("ENTER YOUR CHOICE:");
		char feeM=sc.next().charAt(0);
		System.out.println("COLLEGE FEES FOR MASTERS");
		System.out.println("---------------------");
		switch(feeM) {
		case '1':
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
			hostelFee=sc.next();
			if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
			totalFee=23000+hFee;
			System.out.println("  DEPARTMENT:TAMIL");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("COMPUTER FEE    :1000");
			System.out.println("TUITION FEE     :15000");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
		    break;
			
		case '2':
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
			hostelFee=sc.next();
			if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
			totalFee=22000+hFee;
			System.out.println("  DEPARTMENT:ENGLISH");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("COMPUTER FEE    :1000");
			System.out.println("TUITION FEE     :14000");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
		    break;
			
		case '3':
			System.out.println("DO YOU WANT HOSTEL FACILITY?(YES/NO)");
			hostelFee=sc.next();
			if(hostelFee.equals("YES")) {
				 hFee=5000;
			}
			else {
				hFee=0;
			}
			totalFee=22000+hFee;
			System.out.println("  DEPARTMENT:MATHS");
			System.out.println("*********************");
			System.out.println("EXAM FEE        :5000");
			System.out.println("LIBRARY FEE     :500");
			System.out.println("MEDICAL FEE     :500");
			System.out.println("ACTIVITY FEE    :1000");
			System.out.println("COMPUTER FEE    :500");
			System.out.println("TUITION FEE     :14500");
			System.out.println("HOSTEL FEE      :"+hFee);
			System.out.println("-----------------------");
			System.out.println("TOTAL FEES      :"+totalFee);
			System.out.println("-----------------------");
			break;
		default:
			System.out.println("INVALID!GIVE PROPER INPUT");
			fee();
			break;
}
}
	System.out.println("*********************************************************************************************");

}
}
