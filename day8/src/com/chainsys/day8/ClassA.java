package com.chainsys.day8;

public class ClassA {

	public void display() { 
		System.out.println("\nINTEREST CALCULATION:A = P (1+rt)\nwhere,\nP = Principal amount \nr = Interest rate \nt = Number of years");
		System.out.println("*****************************************************");
		System.out.println("\nTHE RATE OF INTEREST FOR CHECKING ACCOUNT IS 0.02%");
	}
	public void interest(double balance) {
		double rateOfInterest=0.02;
		int numberOfYears=1;
		double accuredAmount=balance*(1+rateOfInterest*numberOfYears);
		double deduction=accuredAmount-balance;
		double simpleInterest=balance-deduction;
		System.out.println("BALANCE                         :"+balance);
		System.out.println("BALANCE AFTER INTEREST DEDUCTION:"+simpleInterest);
		}

}
