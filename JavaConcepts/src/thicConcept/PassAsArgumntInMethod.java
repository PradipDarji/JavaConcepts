package thicConcept;

public class PassAsArgumntInMethod {
	
	public void test01(PassAsArgumntInMethod paa) {
		System.out.println("I am in test01 method");
	}
	
	public void test02() {
		//Option 01: 
		this.test01(this);
		System.out.println("I am in test02 method");
		System.out.println("************************");
		//Option 02:
		test01(this);
		System.out.println("I am in test02 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassAsArgumntInMethod paa = new PassAsArgumntInMethod();
		paa.test02();
	}

}
