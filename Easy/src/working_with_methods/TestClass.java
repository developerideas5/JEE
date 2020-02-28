package working_with_methods;

public class TestClass {

	private static int changeIT(int comeInt2) {
		comeInt2 = 20;
	return comeInt2;

	}

	public static void main(String[] args) {
		int comeInt = 10;
		int a=changeIT(comeInt);
		System.out.println(a);
	}
}
