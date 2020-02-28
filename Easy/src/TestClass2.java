
public class TestClass2 {

	static TestClass2 ref;
	String[] arguments;
	
	public void func(String[] args){
		ref.arguments = args;
		}

	public static void main(String args[]){
		ref = new TestClass2();
		ref.func(args);
	}

	
}
