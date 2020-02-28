package com.methods.classes;
class Parent{
	public Parent() {
		print();// TODO Auto-generated constructor stub
	}

	 void print() {
		System.out.println("Parent");// TODO Auto-generated method stub
		
	}
}
class Child extends Parent{
int i=4;

void print(){
	System.out.println("child"+i);
}
	public static void main(String[] args) {
		Parent a=new Child();
		a.print();
		
		int x;
		if (false){x=3;}
		do{x=3;}while(false);
		for(int i=0;i<0;i++){x=3;}
		
		int[] aa={1,2,3,4};
		int[] bb={2,3,1,0};
		/*a
		System.out.println(aa[(aa=bb)[3]]);*/
		
	}

}
