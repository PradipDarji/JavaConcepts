package JavaBasicConcepts;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Pradip Darji";
		String s2 = "XYZ";

		System.out.println(s1.charAt(5));
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.endsWith("p"));
		System.out.println(s1.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('p', 'c'));
		System.out.println(s1.substring(5));
		String s3 = s1.concat(s2);
		System.out.println(s3);

		StringBuffer sb = new StringBuffer("Pradip Darji");
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.lastIndexOf("P"));
		System.out.println(sb.append("Yo"));
		System.out.println(sb.insert(3, 'O'));
		System.out.println(sb.delete(3, 5));

		for (String t : args) {
			System.out.println(t);
		}

	}

}
