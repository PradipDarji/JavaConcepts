package JavaBasicConcepts;

public class JavaOperators {
	/*
	 * 1) Arithmetic Operators (+,-,*,/,%) 
	 * 2) Relational Operators (==,!=,<,>,<=,>=)
	 * 3) Logical Operators(&&,||) 
	 * 4) Unary Operators (expr++,expr--,++expr,--expr)
	 * 5) Ternary Operators (?,:) 
	 * 6) Bitwise Operators(&,|,^) 
	 * 7) Assignment Operators (=,+=,-=,*=,/=,%=,&=,^=,|=,<<=,>>=,>>>=)
	 */

	public static void main(String[] args) {

		int a = 50;
		int j = 25;
		int c;
		System.out.println("*****************************Arithmetic Operators*****************************");
		// 1) Arithmetic Operators (+,-,*,/,%)
		c = a + j;
		System.out.println(c);
		c = a - j;
		System.out.println(c);
		c = a * j;
		System.out.println(c);
		c = a / j;
		System.out.println(c);
		c = a % j;
		System.out.println(c);

		System.out.println("*****************************Relational Operators*****************************");
		
		// 2) Relational Operators

		int Mark = 95;

		if (Mark == 95) {
			if (Mark > 90 && Mark < 100) {
				System.out.println("A grade");
			}
			if (Mark > 75 && Mark < 90) {
				System.out.println("B grade");
			}
			if (Mark > 55 && Mark < 75) {
				System.out.println("C grade");
			}
			if (Mark > 33 && Mark < 55) {
				System.out.println("You are Pass");
			}
			else {
				System.out.println("You are fail");
			}
		} 
 
		System.out.println("*****************************Logical Operators*****************************");
		
		// 3) Logical Operators(&&,||)
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		
		System.out.println("*****************************Unary Operators*****************************");
		
		// 4) Unary Operators
		int k = 0;
		int m = k++ + ++k + --k + k--;
		System.out.println(m);
		
		System.out.println("*****************************Ternary Operators*****************************");
		
		// 5) Ternary Operators
		int min = (a<j)?a:j;
		System.out.println(min);
		
		System.out.println("*****************************Assignment Operators*****************************");
		
		// 6) Assignment Operators
		
		a+= 5;
		System.out.println(a);
		
		a-= 4;
		System.out.println(a);
		
		a*= 4;
		System.out.println(a);
		
		a/= 4;
		System.out.println(a);
		
		a%= 4;
		System.out.println(a);
		
		System.out.println("*****************************Bitwise Operators*****************************");
		
		// 3) Logical Operators(&,|)
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println(b3&b4);
		System.out.println(b3|b4);
		System.out.println(b3^b4);
	}

}
