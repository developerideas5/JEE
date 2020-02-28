
public class JB2 {

	public static void main(String[] args) {
		
		
		int a=1_000;
		String b="1_000";
		int c=a+a;
		System.out.println(c);
		String d=a+b;
		System.out.println(d);
		System.out.println(a+""+b+""+c+""+ d);
		
		final StringBuilder str=new StringBuilder("I good!");
		str.insert(2, "look").append("and nice");
		str.insert(str.length(),"!!!");
		str.delete(str.length()-2, str.length());
		System.out.println(str.toString().trim());
	}

}
