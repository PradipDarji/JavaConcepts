package JavaBasicConcepts;

public class Example7 {
	
	int k;
	
	public int test(int a) {
		a = 8/0;
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example7 hh = new Example7();
		System.out.println(hh.test(8));
	}

}
