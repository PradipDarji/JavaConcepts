package AccessModifierCocnept1;

public class Example1 {

	public int j;
	int k;
	private int m;
	protected int n;

	public void test1() {
		System.out.println("public void test1()");
	}

	void test2() {
		System.out.println("void test2()");
	}

	private void test3() {
		System.out.println("private void test3()");
	}

	protected void test4() {
		System.out.println("protected void test4()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj = new Example1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.m);
		System.out.println(obj.n);
	}

}
