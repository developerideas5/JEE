package com.methods.classes;

class A{
	
}
class B extends A{

	public void play() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("B");
	}
	
}
public class C extends B{

	
	
	

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}
	
	
	
	
	
	
	
	
	public C() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		B b=new C();
		
	//	b.play();
	}

}
