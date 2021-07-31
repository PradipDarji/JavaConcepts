package StaticVsNonStatic;

public class StaticVsNonStatic4 {

	int rollNumber;
	int age;
	String collageName = "SSES";

	public StaticVsNonStatic4(int rollnum, int Age) {
		rollNumber = rollnum;
		age = Age;
	}

	public void display() {
		System.out.println(rollNumber + " " + age + " " + collageName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVsNonStatic4 SNS4 = new StaticVsNonStatic4(100, 25);
		SNS4.display();

	}

}
