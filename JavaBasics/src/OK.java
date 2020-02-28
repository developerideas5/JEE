
import java.*;

public class OK {
public static void main(String[] args){
	System.out.println("hello");
	String myStr="good";
	String newstring="good";
	
	boolean b2= newstring==myStr;
	System.out.println(b2);
	
	StringBuilder sb=new StringBuilder ("12345678");
	sb.setLength(5);
	sb.setLength(10);
	
	System.out.println(sb.length());
	
	int i=4;
	int ia[][][]=new int[i][i=3][i];
	System.out.println(ia.length+""+ia[0].length);
	
	boolean b1=false;
	short k=9;
	Integer m=9;
	if(b1= k==m){}
	
}
}
