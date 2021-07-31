package ConstructorConcept;

public class Example2 {

	int age;
	String name;

	public Example2(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void display() {
		System.out.println("User age is: " + age);
		System.out.println("User name is: " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj = new Example2(28, "Pradip");
		obj.display();
	}

}
