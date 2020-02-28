package com.accessing.interfaces;
import com.accessing.interfaces.Animal;

public class Dog implements Animal{

	public Dog() {
		System.out.println("Dog.Dog(he)");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog dog=new Dog();
dog.Dog();
System.out.println("Dog.main()");
	}

	private void Dog() {
		// TODO Auto-generated method stub
		System.out.println("Dog.Dog()");
	}

}
