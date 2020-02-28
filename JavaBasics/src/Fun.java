
public class Fun {

	public void doStuff() {
		System.out.println("Fun.doStuff()");
		// TODO Auto-generated method stub
		go();
	}
	
	public void go() {System.out.println("Fun.go()");
		// TODO Auto-generated method stub
		doStuff();
	}
	public Fun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fun f=new Fun();
f.doStuff();
	}


}
