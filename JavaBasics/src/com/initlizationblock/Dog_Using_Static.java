package com.initlizationblock;

/**
 * @author Daffidols
 *
 */
public class Dog_Using_Static extends Animal_Using_Static {

	private static int x=4;
	private int y=5;
	private static void name1() {
		x++;
		//y++;
	}
	private void name2() {
		x++;
		y++;
	}
	public void m(){
		y++;
		x++;
	}
	public static void doStuff(){
		System.out.println("dogieeee");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal_Using_Static[] a={new Animal_Using_Static(),new Dog_Using_Static(),new Animal_Using_Static()};
	int n = 1;
	System.out.println(n++);
for(Animal_Using_Static x: a){
	x.doStuff();
}
Dog_Using_Static.doStuff();
	}

}
