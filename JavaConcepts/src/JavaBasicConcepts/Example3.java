package JavaBasicConcepts;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int x;
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter Interger");
		x = sr.nextInt();
		System.out.println("Entered number is :" + x);
		
		if(x%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}

}
