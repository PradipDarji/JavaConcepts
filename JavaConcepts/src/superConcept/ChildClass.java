package superConcept;

public class ChildClass extends SuperClass {

	String color = "Black";
	
	public void display() {
		System.out.println(super.color);
		System.out.println(color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cc = new ChildClass();
		cc.display();
	}

}
