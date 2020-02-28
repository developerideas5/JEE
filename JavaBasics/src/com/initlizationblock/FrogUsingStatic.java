package com.initlizationblock;

public class FrogUsingStatic {
	
	static int frogSize;//static variable
	static void go(){}//static method
	
	
	public static int getFrogSize(){//static method should can access static variable and static method
		System.out.println("FrogUsingStatic.getFrogSize()");
		go();
		return frogSize;
		
	}
	
	/*static {
		try{
			int i=0,j=0;
			i=i/j;
		}catch(Exception e){
		System.out.println("***** Error in Static Block******");
		throw e;
		}
		}
	*/
	public FrogUsingStatic(int i) {
		System.out.println("FrogUsingStatic.FrogUsingStatic()");
		frogSize=i+1;
	}
	public static void main(String[] args) {
		FrogUsingStatic f = new FrogUsingStatic(25);
		System.out.println("FrogUsingStatic.main()");
System.out.println(f.getFrogSize());
System.out.println("FrogUsingStatic.main()");
//Object o = new com.initlizationblock.SomeClassThatIsNotAvailableInClassPathAtRunTime();
	}

}
