package JavaBasicConcepts;

public class AA implements A{

	public static void main(String[] args) {
		// TODO Auto-generated method
         
         AA aa = new AA();
         aa.display();
         aa.stop();
         
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("QAQA");
	}
	
	public void stop() {
		System.out.println("QA");
	}

}
