package thicConcept;

public class InvokeCurrentClassConstructors {
	
	InvokeCurrentClassConstructors(){
		System.out.println("I am in InvokeCurrentClassConstructors");
	}
	
	InvokeCurrentClassConstructors(int a){
		this();
		System.out.println("I am in InvokeCurrentClassConstructors(int a)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokeCurrentClassConstructors ICCC = new InvokeCurrentClassConstructors(10);
	}

}
