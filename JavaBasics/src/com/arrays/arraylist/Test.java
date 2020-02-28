package com.arrays.arraylist;

public class Test {

	public static void main(String[] args) {

		//Anonymous  array but do not specify size || no name to anonymous array 
		sum(new int[]{10,20,30,40});
			
	}
public static void sum(int[] x){
	int total=0;
	for(int x1:x){
		total +=x1;
	}
	System.out.println(total);
}
}
