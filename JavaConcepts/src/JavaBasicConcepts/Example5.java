package JavaBasicConcepts;

public class Example5 {

	int row, numberOfStars;

	public static void main(String[] args) {

		for (int row = 1; row <= 10; row++) {
			for (int numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
