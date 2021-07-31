package StaticVsNonStatic;

public class StaticvsNonStativ3 {
	
	public static int counter = 0;
	public int j = 0;
	
	public StaticvsNonStativ3(){
		counter++;
		j++;
		System.out.println("Value of Counter: "+counter);
		System.out.println("Value of j: "+j);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticvsNonStativ3 SNS3 = new StaticvsNonStativ3();
		StaticvsNonStativ3 SNS4 = new StaticvsNonStativ3();
		StaticvsNonStativ3 SNS8 = new StaticvsNonStativ3();

	}

}
