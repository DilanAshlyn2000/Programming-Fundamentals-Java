package com.chainsys.day8;

public class ABCBank {

		public static void getUserDetails()
		{
			Bank bank=new Bank();
			bank.setBankname("ABC");
			bank.setBranchname("Kochadai");
			bank.setDepositorname("Abina");
			bank.setAccountnumber(2645387);
			bank.setBalance(80000);
			bank.setPhonenumber(9957623498l); 
    	    System.out.println("BANK NAME     :"+bank.getBankname());
    	    System.out.println("BRANCH NAME   :"+bank.getBranchname());
    	    System.out.println("DEPOSITOR NAME:"+bank.getDepositorname());
    	    System.out.println("ACCOUNT NUMBER:"+bank.getAccountnumber());
    	    System.out.println("BALANCE       :"+bank.getBalance());
    	    System.out.println("PHONE NUMBER  :"+bank.getPhonenumber());
    	   
       }
       
		public static void deposit(float balance,int accountnumber,float deposit) {
	    	  
	    	   
	    	   System.out.println("\nBALANCE               :"+balance);
	    	   float total=balance+deposit;
	    	   System.out.println("DEPOSITED AMOUNT      :"+deposit);
	    	   System.out.println("CURRENT BALANCE       :"+total);
	    	   System.out.println("AMOUNT DEPOSITED!");
		}
	       public static void deposit(float balance,long phonenumber,float deposit) {
	           System.out.println("\nBALANCE               :"+balance);
	           float total=balance+deposit;
	           System.out.println("DEPOSITED PHONE NUMBER:"+phonenumber);
	    	   System.out.println("DEPOSITED AMOUNT      :"+deposit);
	    	   System.out.println("CURRENT BALANCE       :"+total);
	    	   System.out.println("AMOUNT DEPOSITED!");
	}
	       public static void deposit(float balance,String bankname,int accountnumber,String branch,float deposit) {
	    	   System.out.println("\nBALANCE               :"+balance);
	           float total=balance+deposit;
	           System.out.println("BANK NAME             :"+bankname);
	           System.out.println("BRANCH                :"+branch);
	           System.out.println("ACCOUNT NUMBER        :"+accountnumber);
	    	   System.out.println("DEPOSITED AMOUNT      :"+deposit);
	    	   System.out.println("CURRENT BALANCE       :"+total);
	    	   System.out.println("AMOUNT DEPOSITED!");
	       }
}

	
