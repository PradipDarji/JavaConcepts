package superConcept;

public class ParentClass01 extends ChildClass01{
	
	public void run() {
		System.out.println("ParentClass01 method");
	}

	public void display() {
		run();
		super.run();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass01 c01 = new ParentClass01();
		c01.display();
	}

}
