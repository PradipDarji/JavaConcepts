package javaInheritance;

public class Multilevel03 extends Multilevel02{
	
	public void test03() {
		System.out.println("Multilevel03");
	}
	
	public static void main(String[] args) {
		Multilevel03 m03 = new Multilevel03();
		m03.test01();
		m03.test02();
		m03.test03();
	}

}
