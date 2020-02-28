package com.Garbage.Collector;

public class Passing_variables {
	
	void modify(int a){
		System.out.println(a);
		
	}
	public static void main(String[] args){
		Passing_variables pv= new Passing_variables();
		byte a=1;
		pv.modify(a);
	}
}
