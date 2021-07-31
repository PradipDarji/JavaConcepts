package ClassAndObjects;

public class ClassAndObject {

	/* Class => Class is collection of objects
	 * Object => object mean real word entity which has properties and behaviors
	 * new ClassAndObject() => Object of class
	 * CAB => Reference variable
	 */
	int a;
	int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAndObject CAB = new ClassAndObject();
		CAB.display(10);
	}
	
	public void display(int i) {
		System.out.println("I am in display method");
	}

}
