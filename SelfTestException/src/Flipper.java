
public class Flipper {

	public static void main(String[] args) {
//		System.out.println(args[4]);
		String o = "-";
		String[] sa = new String[4];
		for (int i = 0; i < args.length; i++)
			sa[i] = args[i];
		for (String n : sa) {
			// System.out.println("FRED".toLowerCase().substring(1,3));
			if(n != null)
			switch (n.toLowerCase()) {
			case "yellow":
				o += "y";
			case "red":
				o += "r";
			case "green":
				o += "g";
			}
		}
		System.out.println(o);
	}

}
