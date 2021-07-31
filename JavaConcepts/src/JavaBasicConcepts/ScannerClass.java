package JavaBasicConcepts;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		String name;

		Scanner sr = new Scanner(System.in);

		System.out.println("Enter String");
		name = sr.nextLine();
		System.out.println("Enter your name: " + name);

		System.out.println("Enter Integer");
		age = sr.nextInt();
		System.out.println("Enter your age: " + age);

	}

}
