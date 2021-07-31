package StringConcept;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();

		System.out.println("Initial capacity: " + sb.capacity());
		
		sb.append("Sachin");

		System.out.println("New capacity: " + sb.capacity());
		
		sb.append("java is my favourite language");

		System.out.println(sb.capacity());
	}

}
