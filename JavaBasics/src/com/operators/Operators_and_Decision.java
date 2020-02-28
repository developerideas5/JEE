package com.operators;

import java.util.ArrayList;
import java.util.List;

public class Operators_and_Decision {
private String word;
	Operators_and_Decision(String word) {
	this.word=word;
	}
	final static int x=2;
	public static void main(String[] args) {
		for(int i=0;true|false;i++){
			
			if(--i==0||i==2){
				System.out.println("yes"+i);
				break;
			}else if(i++%2==0){
				System.out.println("No"+i);
			}
		}
		
	/*	
		int[] num=new int[]{};
		
		List<String> list= new ArrayList<String>(2);
		
		System.out.println(list.size()+"");
		list.clear();
		System.out.println(list.size()+"");
		list.add("fas");
		list.add("sf");
		list.add(2,"Hello!!!");
		System.out.println(list.indexOf("Hello!!!"));
		
		*/
		
		
	/*	
		String[] as;
		Object c=new long[4];
		Object[] d=as;*/
		/*System.out.println(!false^false);
		for(int z=0;z<4;z++){
			switch(z){
			case x:System.out.println("0");
			case x-1:System.out.println("1");break;
			default:System.out.println("def ");
			case x-2:System.out.println("2");//2-2
			}
		}
		int r=1;
		r+= x;
		
		if((x>4)&&(x<10)){
			r += 2 * x;
		
		}else if (x <= 4){
			r+=3*x;
		}else{r +=4*x;}
		
*/
		
		/*Boolean b1=true;
		Boolean b2=false;
		Boolean b3=true;
		
		if((b1&b2)|(b2 & b3) & b3 ){
			System.out.println("alpha");
		}
		
		if((b1=false)|(b1 & b3)|(b1|b2)){
			System.out.println("beta");
		}*/
		
		
		/*Operators_and_Decision op= new Operators_and_Decision("howdy");
		Operators_and_Decision op1= new Operators_and_Decision("howdy");
		if(op.equals(op1)) System.out.print(op==op1);
		*/
		Titanic();
	
	}
		private static void Titanic() {
		// TODO Auto-generated method stub
			
	}

		public String getWord(){return word;}
		public boolean equals(Object o){
			if(((Operators_and_Decision)o).getWord()==word){
				System.out.println("Equals!");return true;
			}else{System.out.println("Equals... not!");return false;}
		}
}