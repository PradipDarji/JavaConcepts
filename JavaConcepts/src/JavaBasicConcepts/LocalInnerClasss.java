package JavaBasicConcepts;

public class LocalInnerClasss {

	void display() {
		class test {
			void run() {
				System.out.println("hello");
			}
		}
		test t = new test();
		t.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClasss lc = new LocalInnerClasss();
		lc.display();

	}

}
