package javaInheritance;

public class Hierarchical02 extends Hierarchical01 {
	public void test01() {
		System.out.println("I am on test01()");
	}
	
	public static void main(String[] args) {
		Hierarchical02 h02 = new Hierarchical02();
		h02.test01();
	}
}
