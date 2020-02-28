package com.arrays.arraylist;

public class ArrayDemo extends MultiDimentional_Arrays{

	public static void main(String[] args) {
		int key[]={1,2,3};
		Thread[] threads=new Thread[5];
		System.out.println(threads);
		
		int[] scores;
		scores=new int[4];
		System.out.println(scores);
		
		int [][] myArray=new int[3][];
		myArray[0][0]=6;
		
		MultiDimentional_Arrays [] pets=new MultiDimentional_Arrays[3];
		pets[0]=new  MultiDimentional_Arrays();
		pets[1]=new  MultiDimentional_Arrays();
		pets[2]=new  MultiDimentional_Arrays();
		pets[3]=new  MultiDimentional_Arrays();
		
		
	}

}
