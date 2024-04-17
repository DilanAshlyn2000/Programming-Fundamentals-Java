package com.chainsys.day8;

public class TestDetails {

	public static void main(String[] args) {
		
			PersonalDetails detail=new PersonalDetails();
			detail.setName("Shriney");
			detail.setLocation("Chennai");
			detail.setAge(23);
			detail.setGender("Female");
			detail.setHobby("Reading");
			System.out.println("NAME    :"+detail.getName());
			System.out.println("LOCATION:"+detail.getLocation());
			System.out.println("AGE     :"+detail.getAge());
			System.out.println("GENDER  :"+detail.getGender());
			System.out.println("HOBBY   :"+detail.getHobby());
			

		}


	}

