package JavaBasicConcepts;

public class Armstrom {

	public static void isArmstromNumber(int num) {

		int cub = 0;
		int r;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cub = cub + (r * r * r);

		}
		if(t==cub) {
			System.out.println("Armstrom");
		}else {
			System.out.println("Chal Bhag");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstromNumber(153); 
	}

}
