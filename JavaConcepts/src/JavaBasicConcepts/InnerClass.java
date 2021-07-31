package JavaBasicConcepts;

public class InnerClass {
	
	class test{
		public void display() {
			System.out.println("InnerClass");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass in = new InnerClass();
		InnerClass.test t = in.new test();
		t.display();
	}

}
