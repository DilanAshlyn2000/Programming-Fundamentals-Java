package com.chainsys.day8;

public class TestCollegeManagement {

	public static void main(String[] args) {
		
		
		/*CollegeManagement a=new CollegeManagement();
		a.getUserDetails();*/
		
		 College d=new College();
	     d.userInput();
		
		CollegeGrade b=new CollegeGrade();
		b.percentageCalculation(75);
        b.examEligibility(78.98f,58f);
        
        CollegeGrade1 c=new CollegeGrade1();
        c.examEligibility(56.08f,71.0f,2);
        
       
	}

}
