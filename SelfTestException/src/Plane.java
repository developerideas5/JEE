import static java.lang.System.out;
public class Plane {
	static String s="-";
	
	public static void main(String[] args) {
		
		new Plane().s1();
System.out.println(s);
main(1);
	}
	private static void main(int i) {
		// TODO Auto-generated method stub
		System.out.println("overloaded main");
		out.println("hey there");
	}
	private void s1() {
		try {
			s2();
		} catch (Exception e) {
			s+="c";
		}
	}
	private void s2() throws Exception{
		s3();
		s+="2";
		s3();
		s+="2b";
	}
	private void s3() throws Exception{
		throw new Exception();
		
	}

}
