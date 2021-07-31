package ConstructorConcept;

public class Example3 {

	public Example3(int a) {
		System.out.println("Integer type constructor");
	}

	public Example3(char a) {
		System.out.println("char type constructor");
	}

	public Example3(boolean a) {
		System.out.println("boolean type constructor");
	}

	public Example3(float a) {
		System.out.println("float type constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 obj0 = new Example3(10);
		Example3 obj1 = new Example3('A');
		Example3 obj2 = new Example3(true);
		Example3 obj3 = new Example3(10.555f);
	}

}
