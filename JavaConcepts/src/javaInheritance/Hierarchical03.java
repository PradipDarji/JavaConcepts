package javaInheritance;

public class Hierarchical03 extends Hierarchical01 {
	public void test01() {
		System.out.println("I am on test01()");
	}
	
	public static void main(String[] args) {
		Hierarchical03 h03 = new Hierarchical03();
		h03.test01();
	}
}
