package com.literals;
import static java.lang.System.out;
public class Primitive_Casting {

	public static void main(String[] args) {
	
		int a=100;
		long b=a;// Implicit cast 
		System.out.println(b);
		
		float c=100.001f;
		int d=(int)c;	//EXPLICIT cast
		out.println(d);
		
		double e=100l; //implicit cast
		out.println(e);
		
		int x=(int) 345.465;//illegal395.45;illegal
		out.println(x);
		
		long l=130L;
		byte b1=(byte) l;
		//no runtime error gives negative value while 8 bit stays and rest convert into negative value 
		out.println(b1);
		
		
	}

}
