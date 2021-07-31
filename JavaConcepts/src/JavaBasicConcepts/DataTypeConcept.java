package JavaBasicConcepts;

public class DataTypeConcept {

	public static void main(String[] args) {

		// 1) Integer
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

		// 2) character
		char A = 'a';
		char B = 'b';
		char C = 'c';
		System.out.println(A + " " + B + " " + C);

		// 3) Boolean
		boolean D = true;
		D = false;
		System.out.println(D);

		// 4) String
		String S1 = "Pradip";
		String S2 = "Darji";
		System.out.println(S1 + " " + S2);

		// 5) Float
		float f1 = 15.22f;
		float f2 = 25.33f;
		float f3 = f1 + f2;
		System.out.println(f3);

		// 6) Long
		long l1 = 100000L;
		long l2 = 50000000L;
		long l3 = l1 + l2;
		System.out.println(l3);

		// 7) Array
		int k[] = new int[3];
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;

		for (int j = 0; j < k.length; j++) {
			System.out.println(k[j]);
		}

		// 8) Double
		double d1 = 15.55;
		double d2 = 12.60;
		System.out.println(d1 + d2);

	}

}
