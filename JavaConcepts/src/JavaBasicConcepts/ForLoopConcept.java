package JavaBasicConcepts;

public class ForLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 0; j <= 10; j++) {
			System.out.println(j);
		}
		System.out.println("********************Normal for loop********************");
		int k[] = new int[3];
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;

		for (int m = 0; m < k.length; m++) {
			System.out.println(k[m]);
		}

		System.out.println("********************Advanced foreach loop********************");
		char[] array = { 'A', 'B', 'C' };

		for (char l : array) {
			System.out.println(l );
		}

	}

}
