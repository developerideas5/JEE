package com.section1;
import java.util.*;
public class Test {

	private static Test test;

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
	/*	int num=5;
		setTest(new Test());
		try{
			num+=num/0;
		}catch (ArithmeticException e) {
			return num += 50;// TODO: handle exception
		}catch (Exception e) {
			return num += 5;// TODO: handle exception
		}finally{
			return num+2;	
		}
		*/
	}

	public static Test getTest() {
		return test;
	}

	public static void setTest(Test test) {
		Test.test = test;
	}

}
