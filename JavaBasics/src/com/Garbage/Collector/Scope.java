package com.Garbage.Collector;

public class Scope {//class
	static int x=2;//static variable
	int y;//instance variable
	{x=7;int x2= 5;}//intialization block
	
	private static String title;
	public String getTitle(){
		return title;
	}
	static int [] year;
	public Scope() {//constructor
		super();
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}



	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
x++;
System.out.println(year);
System.out.println(x);
Scope s=new Scope();
title =s.getTitle();

String t1=title.toUpperCase();
System.out.println(title);
System.out.println(t1);


	}

}
