package ConstructorConcept;

public class Example1 {
	
	public Example1() {
		System.out.println("Default Constructor");
	}
	
	public Example1(int a, int b) {
		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj  = new Example1();
		Example1 obj1  = new Example1(2,8);
	}

}
