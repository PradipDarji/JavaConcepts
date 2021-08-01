package thicConcept;

public class InvokeCurrentClassMethods {

	public void test01() {
		System.out.println("Calling test01 Method");
	}

	public void test02() {
		this.test01();
		System.out.println("Calling test02 Method");
	}

	public void tes03t() {
		this.test02();
		System.out.println("Calling test03 Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokeCurrentClassMethods Iccm = new InvokeCurrentClassMethods();
		Iccm.tes03t();
	}

}
