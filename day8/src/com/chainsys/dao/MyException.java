package com.chainsys.dao;

public class MyException extends Exception {

	@Override
	public String getMessage() 
	{
		System.out.println("Input should be either PAID or UNPAID.");
		return super.getMessage();
	}

//	public static void main(String[] args) {
//		System.out.println("Input should be either PAID or UNPAID.");
//	}
	

}
