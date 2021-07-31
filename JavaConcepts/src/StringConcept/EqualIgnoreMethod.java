package StringConcept;

public class EqualIgnoreMethod {

	public static void main(String[] args) {
		
		String s1 = "Sachin";
		
		String s2 = "SACHIN";
		
		String s3 = "Dhoni";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
	
	}

}
