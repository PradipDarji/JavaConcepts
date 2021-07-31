package JavaBasicConcepts;

public class IfelseifConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Mark = 25;

		if (Mark == 25) {
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

	}

}
