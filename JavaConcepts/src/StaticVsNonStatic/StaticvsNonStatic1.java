package StaticVsNonStatic;

public class StaticvsNonStatic1 {
	
	/*
	 * Static method or variable directly called or we can use class name to initialize Static method or variable
	 * Non-static method or variable can be initialize by class object reference variable
	 */

	int j = 50; // Non-static variable
	static int k = 60; // Static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticvsNonStatic1 SNS = new StaticvsNonStatic1();
		// Non-static variable & Methods
		System.out.println("***************Non-static variable & Methods***************");
		System.out.println(SNS.j);
		SNS.test1();
		// Static variable & Methods
		System.out.println("***************Static variable & Methods***************");
		System.out.println(k);
		test2();
		// Static variable & Methods
		System.out.println("***************Static variable & Methods***************");
		System.out.println(StaticvsNonStatic1.k);
		StaticvsNonStatic1.test2();

	}

	public void test1() { // Non-static Methods
		System.out.println("I am in test1");
	}

	public static void test2() { // Static Methods
		System.out.println("I am in test2");
	}

}
