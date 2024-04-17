package com.chainsys.day8;

public class Bank {

		String bankname;
		String branchname;
		String depositorname;
		int accountnumber;
		float balance;
		long phonenumber;
		public String getBankname() {
			return bankname;
		}
		public Bank() {
		}
		public void setBankname(String bankname) {
			if(bankname.matches("[a-zA-Z]+")) {
				this.bankname = bankname;
			}else {
				System.out.println("INVALID!,GIVE PROPER INPUT");
			}
		}
		public String getBranchname() {
			return branchname;
		}
		public void setBranchname(String branchname) {
			if(branchname.matches("[a-zA-Z]+")) {
				this.branchname = branchname;
			}else {
				System.out.println("INVALID!,GIVE PROPER INPUT");
			}
		}
		public String getDepositorname() {
			return depositorname;
		}
		public void setDepositorname(String depositorname) {
			if(depositorname.matches("[a-zA-Z]+")) {
				this.depositorname = depositorname;
			}else {
				System.out.println("INVALID!,GIVE PROPER INPUT");
			}
		}
		public int getAccountnumber() {
			return accountnumber;
		}
		public void setAccountnumber(int accountnumber) {
			if(accountnumber>0) {
			this.accountnumber = accountnumber;
		}
			else
			{
				System.out.println("INVALID!, GIVE PROPER INPUT");
			}
		}
		public float getBalance() {
			return balance;
		}
		public void setBalance(float balance) {
			if(balance>0) {
				this.balance = balance;
			}
			else
			{
				System.out.println("INVALID!, GIVE PROPER INPUT");
			}
		}
		
		public long getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}
		@Override
		public String toString() {
			return "Bank [bankname=" + bankname + ", branchname=" + branchname + ", depositorname=" + depositorname
					+ ", accountnumber=" + accountnumber + ", balance=" + balance + ", , phonenumber=" + phonenumber + "]";
		}
		public Bank(String bankname, String branchname, String depositorname, int accountnumber, float balance, long phonenumber) {
			this.bankname = bankname;
			this.branchname = branchname;
			this.depositorname = depositorname;
			this.accountnumber = accountnumber;
			this.balance = balance;
			this.phonenumber = phonenumber;
		}

		}



