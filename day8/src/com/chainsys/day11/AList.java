package com.chainsys.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class AList {

	public static void main(String[] args) {
		System.out.println("ARRAYLIST:");
		System.out.println("\nARRAY CREATION - STRING");
		ArrayList<String> list=new ArrayList<String>(); 
    	list.add("Kayal"); 
		list.add("Angel");  
		list.add("Abi");  
		list.add("Vidhya"); 
		System.out.println(list);
		
		System.out.println("\nARRAY CREATION - INTEGER");
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(17);
		arr.add(18);
		arr.add(15);
		arr.add(19);
		System.out.println(arr);
		
		ArrayList arr1=new ArrayList();
		for(int i=0;i<=6;i++) 
		arr1.add(i);
		System.out.println("\nORIGINAL ARRAY:\n"+arr1);
		
		arr1.add(7, 10);
		System.out.println("\nADDING USING INDEX:\n"+arr1);
		
		arr1.clone();
		System.out.println("\nCLONING:\n"+arr1);
		
		arr1.clear();
		System.out.println("\nCLEAR:\n"+arr1);
		
		ArrayList<String> arr2=new ArrayList<String>();
		System.out.println("\nLIST BEFORE ADDING ELEMENTS\n:"+arr2);
		
		arr2.add("APPLE");
		arr2.add("MANGO");
		arr2.add("GRAPES");
		arr2.add("PINEAPPLE");
		System.out.println("\nORIGINAL ARRAY:\n"+arr2);
		
		arr2.add(2, "ORANGE");
		System.out.println("\nADDING USING INDEX:\n"+arr2);
		
		arr2.clone();
		System.out.println("\nCLONING:\n"+arr2);
		
		arr2.remove("MANGO");
		System.out.println("\nREMOVE:\n"+arr2);
		
		arr2.remove(2);
		System.out.println("\nREMOVE USING INDEX:\n"+arr2);
		
		arr2.remove(2);
		System.out.println("\nGET:\n"+arr2);
		
		arr2.clear();
		System.out.println("\nCLEAR:\n"+arr2);
		
	    arr2.isEmpty();
	    System.out.println("\nISEMPTY:\n"+arr2);
	    
	    ArrayList<String> l1=new ArrayList<String>();  
		l1.add("Manu");  
	    l1.add("Agneta");  
		l1.add("Brikya");  
		l1.add("Jerolin");  
		System.out.println("\nGIVEN ARRAY:\n"+l1);
		System.out.println("\nSORTED STRING ARRAY:");
		Collections.sort(l1);  
		for(String name:l1)  
		System.out.println(name);  
				      		   
		ArrayList<Integer> list2=new ArrayList<Integer>();  
        list2.add(11);  
		list2.add(33);  
	    list2.add(55);  
		list2.add(22);  
		System.out.println("\nGIVEN ARRAY\n:"+list2);
		System.out.println("\nSORTED ARRAY INTEGER:");
		Collections.sort(list2);  
		for(Integer number:list2)  
		System.out.println(number);
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("LINKEDLIST\n");
		LinkedList a1=new LinkedList();
		for(int i=5;i<=10;i++)
			a1.add(i);
		System.out.println("\nORIGINAL ARRAY:\n"+a1);
		
		a1.remove(3);
		System.out.println("\nREMOVE:\n"+a1);
		
		a1.pop();
		System.out.println("\nPOP:\n"+a1);
		
		a1.push(11);
		System.out.println("\nPUSH:\n"+a1);
		
		a1.pollFirst();
		System.out.println("\nPOLLFIRST:\n"+a1);
		
		a1.add(0,20);
		System.out.println("\nADDING USING INDEX:\n"+a1);
		
		a1.removeLast();
		System.out.println("\nREMOVE LAST:\n"+a1);
		
		a1.addFirst(30);
		System.out.println("\nADD FIRST:\n"+a1);
		
		int size=a1.size();
		System.out.println("\nSIZE:\n"+size);
		
		LinkedList<String> list1 = new LinkedList<String>();
        list1.add("DOG");
        list1.add("CAT");
        list1.add("40");
        list1.add("100");
        System.out.println("\nORIGINAL ARRAY:\n"+list1);
		System.out.println("\nGET FIRST:\n"+list1.getFirst());
		System.out.println("\nGET LAST:\n"+list1.getLast());
		list1.remove(String.valueOf("CAT"));
		System.out.println("\nREMOVE USING VALUE:"+list1);
		 
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("VECTOR\n");
	    Vector v=new Vector();
		v.add(0,"ROSE");
		v.add(1, "JASMINE");
		v.add(2,35);
		v.add(3,60);
		System.out.println("\nGIVEN VECTOR: \n" + v);
		System.out.println("\nTHE OBJECT THAT IS REPLACED IS:\n"+v.set(0, 50));
        System.out.println("\nNEW VECTOR:\n"+v);		  
		v.remove(2);
		System.out.println("\nREMOVE:\n"+v);
		  
		System.out.println("\nSIZE: "+v.size()); 
		  
		v.addElement("SUNFLOWER");
		System.out.println("\nADDELEMENT:\n"+v);
		  
		   
        System.out.println("\nFIRST ELEMENT: \n"+v.firstElement());
        System.out.println("\nLAST ELEMENT : \n"+v.lastElement());
       
		Vector<Integer>  vector2 = new Vector<Integer>();  
        vector2.add(35);  
        vector2.add(60);  
        System.out.println("\nCONTAINSALL: "+v.containsAll(vector2));   
        System.out.println("\nCONTAINS   :"+vector2.contains(60));
	
        Vector<Integer> vector3 = new Vector<>();  
          
        vector3.add(20);  
        vector3.add(2);  
        vector3.add(10);  
        vector3.add(300);  
        vector3.add(2);   
        
        System.out.println("GIVEN VECTOR: \n" +vector3);  
        
        Collections.replaceAll(vector3, 2, 20);  
     
        System.out.println("\nNEW VECTOR AFTER REPLACEALL: \n" + vector3);  
        System.out.println("----------------------------------------------------------------");
		
        System.out.println("STACK\n");
        Stack<String> stack1=new Stack<String>();  
	    stack1.add("Krish");
	    stack1.add("Agnes");  
	    stack1.add("Prakash");  
	    stack1.add("Jerome");  
	    System.out.println("\nGIVEN STACK:\n"+stack1);
	  
	    stack1.push("100");
	    System.out.println("\nAFTER PUSH:\n"+stack1);
	    stack1.pop();
	    System.out.println("\nAFTER POP:\n"+stack1);
	    stack1.add(1, "JASLIN");
	    System.out.println("\nADDING USING INDEX:\n"+stack1);
	    stack1.clone();
	    System.out.println("\nCLONE:\n"+stack1);
	    stack1.clear();
	    System.out.println("\nCLEAR:\n"+stack1);
	    System.out.println("----------------------------------------------------------------");
		 
	    System.out.println("\nQUEUE\n");
	    Queue<String> queue = new LinkedList<String>();
        queue.add("Anitha");
        queue.add("Ram");
        queue.add("Reshma");
        queue.add("Anslyn");
	    System.out.println("\nGIVEN QUEUE:\n"+queue);
	    Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
        System.out.print("\nAFTER ITERATION:\n"+iterator.next() + " ");}
	    System.out.println("\nSIZE OF THE QUEUE:\n"+queue.size());
        queue.remove();
	    System.out.println("\nAFTER REMOVE():\n"+queue);
	    System.out.println("\nHEAD OF THE QUEUE:\n"+queue.peek());
	    queue.clear();
	    System.out.println("\nAFTER CLEAR():\n"+queue);
	
	    Queue<Integer> list3 = new LinkedList<Integer>();
	    list3.add(1000);
	    list3.add(2000);
	    list3.add(3000);
	    list3.add(4000);
	    System.out.println("\nGIVEN QUEUE:\n"+list3);
	  //Printing top element
	    System.out.println("\nPEEK():\n"+list3.peek());
	  // Printing the top element & removing from the LinkedList 
	    System.out.println("\nPOLL():\n"+list3.poll());
	  // Printing the top element again
	    System.out.println("\nPEEK():\n"+list3.peek());
	  //check if the element is present using contains()
	    boolean element =list3.contains(2); 
	    System.out.println("\nCONTAINS():\n"+element);
	    System.out.println("----------------------------------------------------------------");
		
	    Map<String, Integer> map = new LinkedHashMap<>(); 
        map.put("KAYAL", 21); 
        map.put("ANGEL", 22); 
        map.put("ABI", 23); 
        System.out.println("\nGIVEN LINKEDHASHMAP:\n"+map);
       
	  
	}  
		 
	}


