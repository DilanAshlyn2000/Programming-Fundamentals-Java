package com.chainsys.day8;

public class TestBank {

		public static void main(String[] args) {
			ABCBank bank=new ABCBank();
			bank.getUserDetails();
			bank.deposit(50000f,2645387,10000f);
			bank.deposit(100000f, 9976534587l, 5000f);
	        bank.deposit(200000f,"SBI",234876, "KOCHADAI", 50000f);
	        
	        ClassA a=new ClassA();
	        a.display();
	        a.interest(100000);
	        ClassB b=new ClassB();
	        b.display();
	        b.interest(400000);
		}

	}


