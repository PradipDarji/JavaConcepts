package thicConcept;

public class WithoutThis {

	int age;
	String Name;

	WithoutThis(int age, String Name) {
		age = age;
		Name = Name;
	}

	public void display() {
		System.out.println("I am " + Name + " and I am " + age + " year old.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutThis withoutThis = new WithoutThis(45, "Ashokbhai");
		withoutThis.display();
	}

}
