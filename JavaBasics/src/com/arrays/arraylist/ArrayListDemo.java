package com.arrays.arraylist;

import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
public static void main(String[] args) {
	
		List<String> myList= new ArrayList<String>();
		myList.add("z");
		myList.add("x");
		myList.add(1, "y");
		myList.add(0,"w");
		System.out.println(myList);
		
		myList.clear();
		System.out.println(myList);
		
		myList.add("a");
		myList.add("b");
		myList.add("c");
		
		System.out.println(myList);
		System.out.println(myList.contains("a") +" "+ myList.contains("x"));//returns true or false
		
		System.out.println("get value at postion 1:"+ myList.get(1));
		System.out.println(myList.indexOf("c"));//returns the int location
		
		myList.remove(1);//removes via index
	
		System.out.println(myList.size());//size of array
		System.out.println(myList);
	}

}
