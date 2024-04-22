package com.chainsys.day8;

public class CollegeManagement {

	String studentName,department;
    int id,year,numberOfArrears;
    float gradePercentage,attendance;
public CollegeManagement() {
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	if(studentName.matches("[a-zA-Z\s]+")) {
		this.studentName = studentName;
	}else {
		System.out.println("INVALID!,GIVE PROPER NAME");
	}
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	if(department.matches("[a-zA-Z\s]+")) {
		this.department = department;
	}else {
		System.out.println("INVALID!,GIVE PROPER DEPARTMENT NAME");
	}
}
public int getId() {
	return id;
}
public void setId(int id) {
	if(id>0 && id<=500) {
	this.id = id;
}
	else
	{
		System.out.println("INVALID!, GIVE PROPER ID NUMBER");
	}
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	if(year>0 && year<=3) {
	this.year = year;
}
	else
	{
		System.out.println("INVALID!, GIVE PROPER YEAR BETWEEN 1 TO 3");
	}
}
public int getNumberOfArrears() {
	return numberOfArrears;
}
public void setNumberOfArrears(int numberOfArrears) {
	if(numberOfArrears>=0 && numberOfArrear<=8) {
	this.numberOfArrears = numberOfArrears;
}
	else
	{
		System.out.println("INVALID!, GIVE PROPER ARREAR NUMBER");
	}
public float getGradePercentage() {
	return gradePercentage;
}
public void setGradePercentage(float gradePercentage) {
	
	if(gradePercentage>0 && gradePercentage<=100) {
		this.gradePercentage = gradePercentage;
}
	else
	{
		System.out.println("INVALID!,GIVE PROPER GRADE PERCENTAGE BETWEEN 0 TO 100");
	}
}
public float getAttendance() {
	return attendance;
}
public void setAttendance(float attendance) {
     if(attendance>0 && attendance<100) {
	this.attendance = attendance;
}
     else {
    	 System.out.println("INVALID!, GIVE PROPER ATTENDANCE PERCENTAGE");
     }
}
public CollegeManagement(String studentName, String department, int id, int year, int numberOfArrears,
		float gradePercentage, float attendance) {
	this.studentName = studentName;
	this.department = department;
	this.id = id;
	this.year = year;
	this.numberOfArrears = numberOfArrears;
	this.gradePercentage = gradePercentage;
	this.attendance = attendance;
}

}