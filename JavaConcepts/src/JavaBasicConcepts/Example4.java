package JavaBasicConcepts;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;

		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Interger");
		j = sr.nextInt();
		System.out.println("Entered number is :" + j);

		do {
			System.out.println("Reverse => " + j--);
		} while (j > 0);

	}

}
