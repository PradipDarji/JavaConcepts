package StaticVsNonStatic;

public class StaticvsNonStatic2 {

	int j = 50;
	static int k = 60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
	}

	public void test1() { // Non-static method accept static and Non-static variable
		System.out.println(j);
		System.out.println(k);
	}

	public static void test2() { // Static method always accept static variable
		System.out.println(j);
		System.out.println(k);
	}

}
