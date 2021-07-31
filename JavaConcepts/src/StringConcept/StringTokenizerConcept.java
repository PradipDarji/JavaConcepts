package StringConcept;

import java.util.StringTokenizer;

public class StringTokenizerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("My name is khan");

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
