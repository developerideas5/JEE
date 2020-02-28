package com.Constructor;

public class Animal {

	String name;
	Animal(String name){
		this.name=name;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
		this(makeRandomName());
	}

	private static String makeRandomName() {
		// TODO Auto-generated method stub
		
		int x=(int)(Math.random()*5);
		String name=new String[]{"Fluffy","Fido"}[x];
		
		return name;
	}
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		System.out.println(animal.name);
		
		Animal b= new Animal("Zeus");
		System.out.println(b.name);

	}

}
