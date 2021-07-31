package StringConcept;

public class StringBufferConcept {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Sachin");
		
	    System.out.println("Initial capacity: "+sb.capacity());
		
		sb.append("Tendulkar");
		
		System.out.println(sb);
		
		sb.insert(3, "uuuuu");
		
		System.out.println(sb);
		
	    sb.replace(3, 8, "");
	    
	    System.out.println(sb);
	    
	    sb.delete(0, 6);
	    
	    System.out.println(sb);
	    
	    sb.reverse();
	    
	    System.out.println(sb);

	}

}
