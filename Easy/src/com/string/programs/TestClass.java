package com.string.programs;


//What will be the result of attempting to compile and run the following program?

public class TestClass{
   public static void main(String args[ ] ){
	   
      String s = "hello";
      StringBuilder sb = new StringBuilder( "hello" );
      sb.reverse();
     // s.reverse();//CE error
      if( s == sb.toString() )  System.out.println( "Equal" );
      else System.out.println( "Not Equal" );
      
      
      
      
   }
}
