package com.chainsys.day10;

import java.util.Scanner;

public class FeedBack1 implements FeedBack{
@Override
public void collegeFeedBack() {
Scanner sc=new Scanner(System.in);
System.out.println("FEEDBACK FORM\n-------------");
System.out.println("ENTER YOUR FEEDBACK ABOUT OUR COLLEGE:");
String feedback=sc.nextLine();
System.out.println("___________________\n| FEEDBACK SAVED! |\n|_________________|");	
}

@Override
public void collegeSuggestion() {
	Scanner sc=new Scanner(System.in);
	System.out.println("SUGGESTION FORM\n-------------");
	System.out.println("ENTER YOUR SUGGESTION TO IMPROVE OUR COLLEGE:");
	String suggestion=sc.nextLine();
	System.out.println("___________________\n|SUGGESTION SAVED! |\n|_________________|");	
}
}