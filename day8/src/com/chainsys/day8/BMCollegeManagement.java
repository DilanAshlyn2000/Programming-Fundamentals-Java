package com.chainsys.day8;

public class BMCollegeManagement {

	String departmentB,departmentM;
    int id,yearB,yearM,numberOfArrears;
    float gradePercentage,attendance;
	public String getDepartmentB() {
		return departmentB;
	}
	public BMCollegeManagement() {
	}
	
	public void setDepartmentB(String departmentB) {
		
		if ((departmentB.equals("BCA")) || (departmentB.equals("ENGLISH")) || (departmentB.equals("TAMIL"))|| (departmentB.equals("ZOOLOGY")) || (departmentB.equals("MATHS"))|| (departmentB.equals("bca")) || (departmentB.equals("english")) || (departmentB.equals("tamil"))|| (departmentB.equals("zoology")) || (departmentB.equals("maths")))
		{
			this.departmentB = departmentB;
		} 
		else 
		{
			System.out.println("INVALID! GIVE PROPER DEPARTMENT NAME");
		}
	}

	public String getDepartmentM() {
		return departmentM;
	}

	public void setDepartmentM(String departmentM) {
		
		if((departmentM.equals("TAMIL")) || (departmentM.equals("ENGLISH")) || (departmentM.equals("MATHS"))|| (departmentM.equals("english")) || (departmentM.equals("maths"))||(departmentM.equals("tamil")) )
		{
			this.departmentM = departmentM;
		} 
		else
		{
			System.out.println("INVALID! GIVE PROPER DEPARTMENT NAME");
		}
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0 && id <= 1000) {
			this.id = id;
		} else {
			System.out.println("INVALID! GIVE PROPER ID");
		}
	}

	public int getYearB() {
		return yearB;
	}

	public void setYearB(int yearB) {
		if (yearB > 0 && yearB <= 3) {
			this.yearB = yearB;
		} else {
			System.out.println("INVALID! GIVE PROPER YEAR");
		}
	}

	public int getYearM() {
		return yearM;
	}

	public void setYearM(int yearM) {
		if (yearM > 0 && yearM <= 2) {
			this.yearM = yearM;
		} else {
			System.out.println("INVALID! GIVE PROPER YEAR");
		}
	}

	public int getNumberOfArrears() {
		return numberOfArrears;
	}

	public void setNumberOfArrears(int numberOfArrears) {
		if (numberOfArrears >= 0 && numberOfArrears <= 8) {
			this.numberOfArrears = numberOfArrears;
		} else {
			System.out.println("INVALID!, GIVE PROPER ARREAR NUMBER");
		}
	}

	public float getGradePercentage() {
		return gradePercentage;
	}

	public void setGradePercentage(float gradePercentage) {
		if (gradePercentage > 0 && gradePercentage <= 100) {
			this.gradePercentage = gradePercentage;
		} else {
			System.out.println("INVALID!,GIVE PROPER GRADE PERCENTAGE BETWEEN 0 TO 100");
		}
	}

	public float getAttendance() {
		return attendance;
	}

	public void setAttendance(float attendance) {
		if (attendance > 0 && attendance < 100) {
			this.attendance = attendance;
		} else {
			System.out.println("INVALID!, GIVE PROPER ATTENDANCE PERCENTAGE");
		}
	}

	public BMCollegeManagement(String departmentB, String departmentM, int id, int yearB, int yearM,
			int numberOfArrears, float gradePercentage, float attendance) {
	
		this.departmentB = departmentB;
		this.departmentM = departmentM;
		this.id = id;
		this.yearB = yearB;
		this.yearM = yearM;
		this.numberOfArrears = numberOfArrears;
		this.gradePercentage = gradePercentage;
		this.attendance = attendance;
	}
    
	}

