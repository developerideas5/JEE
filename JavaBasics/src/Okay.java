class Okay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)Math.random()*1024);
System.out.println(new Alien().invade((short)7,(short)8));
	}

}
class Alien{

	String invade(short s) {
		// TODO Auto-generated method stub
		return "a few";
	}
	String invade(short... s) {
		// TODO Auto-generated method stub
		return "many";
	}}