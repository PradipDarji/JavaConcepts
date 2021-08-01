package thicConcept;

public class WithThis {
	int age;
	String Name;

	WithThis(int age, String Name) {
		this.age = age;
		this.Name = Name;
	}

	public void display() {
		System.out.println("I am " + Name + " and I am " + age + " year old.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithThis withThis = new WithThis(59, "Ashokbhai");
		withThis.display();
	}

}
