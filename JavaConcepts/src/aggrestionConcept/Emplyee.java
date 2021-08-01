package aggrestionConcept;

public class Emplyee {

	String Name;
	int age;
	Address address;

	Emplyee(String Name, int age, Address address) {
		this.Name = Name;
		this.age = age;
		this.address = address;
	}
	
	public void display() {
		System.out.println("My Name is " + Name + " and I am " + age + " Year Old.");
		System.out.println("I am from "+address.city+", " +address.State);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add =  new Address("Surat", "Gujarat");
		Emplyee emp = new Emplyee("Pradip", 29, add);
		emp.display();
	}

}
