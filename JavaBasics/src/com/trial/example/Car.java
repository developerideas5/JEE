package com.trial.example;

public class Car implements BMW{

	public void eat() {
		System.out.println("Car.eat()");
	}

	public static void main(String[] args) {
		Car c=new Car();
		
		
		
		Car d= new CarSpecification();//Polymorhism
		c.eat();
		d.eat();
		
		//d,bulk();
		((CarSpecification) d).bulk();
}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		
	}

}
