
public class Loops {
static final long tooth=343L;

	public static void main(String[] args) {
		System.out.println(tooth +"");
//		Loops loop = new Loops();
		final long tooth=340L;
		new Loops().doIT(tooth);
		System.out.println(tooth);
		
		
		/*if(args.length==0)System.exit(0);
		
		
		int i=0,j=0;
		int[] nums = new  int[]{1,2,3,4};
		try {
			System.out.println("cvbnnnnn");
			throwit();
		} finally {
			System.out.println("dgfhgjhkklfghjk");
		}*/
		/*i=5;j=3;
		do{System.out.println(i +" "+j+" ");}while(i++==5&&++j==4);
		*/
		/*outer:
			while(true){
				i++;
				System.out.println(i);
				inner:
					for(j=0;j<10;j++){
						i+=j;
					continue inner;
					}
				break outer;
			}
		
		*/
		
		
		/*for(int x:nums){
			System.out.println(x);
			System.out.println(nums);
			
			if(x==nums.length){
				System.out.println(x+"=x");
				System.out.println(nums);
				continue;
			}
			
			i+=x;
			System.out.println("i="+i);
			System.out.println(x);
			System.out.println("************");
		}*/
//		System.out.println("i="+i);
		
		/*for(i=0;i<5;i++){
			System.out.println(i);
			if(i==2) continue;
			j++;
			System.out.println("j="+j);
			System.out.println("********************");
		}
		System.out.println(i+" "+j);
		*/
		/*i=1;
		do while(i<1)
			System.out.println("i= "+i);
		while(i==1);*/
	}

	private static long doIT(long tooth) {
			System.out.println(++tooth + "");
		return (++tooth)*tooth;
	}

	private static void throwit() {
		throw new RuntimeException();
		
	}

}
