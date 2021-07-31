package StringConcept;

public class StringAllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Contrary to popular belief, Lorem Ipsum is not simply random text.";

		// Method: Java String charAt();
		System.out.println(s.charAt(10));

		// Method: Java String contains()
		System.out.println(s.contains("Ipsum"));

		// Method: Java String endsWith()
		String s1 = "java by javatpoint";
		System.out.println(s1.endsWith("t"));
		System.out.println(s1.endsWith("point"));

	}

}
