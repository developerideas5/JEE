import java.lang.Runnable;
public class Wombat implements Runnable{
	 
	 //declaring constants
	  private  static final int Min_HEIGHT= 9;
	  
	  public static void main(String[] args) {
		

		Wombat n= new Wombat();
		n.run();
	}

	@Override
	public  synchronized void run() {
		
		System.out.println("Wombat.run()");
	}

}
