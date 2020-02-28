package com.methods.classes;
interface I{}
class Xx implements I{}
class Yy extends Xx{}
class Zz extends Yy{}
public class D extends Zz{

	public static void main(String[] args) {
		
		D d = new D();
		if (d instanceof Xx){System.out.println(true);}
	}

}
