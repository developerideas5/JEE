package com.trial.example;

public class CarSpecification extends Car {

	public void eat(){
		
		super.eat();//invokes eat in Car which super class and works on instance methods not on static,final,private
		
		System.out.println("CarSpecification.eat()");
	}

	public void bulk()
	{
		System.out.println("CarSpecification.bulk()");
	}
}
