package thicConcept;

public class PassAsArgumentConstructer02 {
	
	int i = 50;

	PassAsArgumentConstructer02() {
		PassAsArgumentConstructer01 c01 = new PassAsArgumentConstructer01(this);
	}

	void display() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassAsArgumentConstructer02 co2 = new PassAsArgumentConstructer02();
		co2.display();
	}

}
