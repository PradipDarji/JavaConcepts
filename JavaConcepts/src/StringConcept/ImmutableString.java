package StringConcept;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Sachin";
		s1.concat("Tendulkar"); // concat() method appends the string at the end
		System.out.println(s1); // will print Sachin because strings are immutable objects

	}

}
