package com.chainsys.day10;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Department {
	public void departmentDetails() {
		System.out.println("|==================================|");
		System.out.println("|           ABC COLLEGE            |");
		System.out.println("|==================================|");
		ArrayList<String> array=new ArrayList<String>();
		System.out.println("BACHELOR DEGREE DEPARTMENTS:");
		array.add("BCA");
		array.add("ENGLISH");
		array.add("TAMIL");
		array.add("MATHS");
		array.add(3, "ZOOLOGY");
		Collections.sort(array);  
		for(String names:array)  
		System.out.println(names);
		System.out.println("\nMASTER DEGREE DEPARTMENTS:");
		ArrayList<String> array1=new ArrayList<String>();
		array1.add("ENGLISH");
		array1.add("TAMIL");
		Collections.sort(array1);  
		for(String names1:array1)  
		System.out.println(names1);
		//System.out.println("|    BACHELORS    |     MASTERS    |");
		//System.out.println("|----------------------------------|");
	    //System.out.println("|    BCA          |     ENGLISH    |");
		//System.out.println("|    ENGLISH      |     TAMIL      |");
		//System.out.println("|    TAMIL        |     MATHS      |");
		//System.out.println("|    ZOOLOGY      |                |");
	    //System.out.println("|    MATHS        |                |");
	    System.out.println("|==================================|");
	}
	public abstract void departmentInformation();
}
