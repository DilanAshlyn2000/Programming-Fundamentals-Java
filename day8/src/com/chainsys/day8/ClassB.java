package com.chainsys.day8;

public class ClassB extends ClassA{
	public void display() {
		System.out.println("THE INTEREST RATE FOR SAVINGS ACCOUNT IS 0.06%");
	}
	public void interest(double balance) {
		double rateOfInterest=0.06;
		int numberOfYears=1;
		double accuredAmount=balance*(1+rateOfInterest*numberOfYears);
		double deduction=accuredAmount-balance;
		double simpleInterest=balance-deduction;
		System.out.println("BALANCE                         :"+balance);
		System.out.println("BALANCE AFTER INTEREST DEDUCTION:"+simpleInterest);
		}
		}
	

