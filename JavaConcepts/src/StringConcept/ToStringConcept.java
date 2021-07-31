package StringConcept;

public class ToStringConcept {

	int age;
	String Firstnmae;
	String Surname;

	public ToStringConcept(int age, String Firstnmae, String Surname) {
		this.age = age;
		this.Firstnmae = Firstnmae;
		this.Surname = Surname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age +" "+Firstnmae+ " "+Surname;
	}

	public static void main(String[] args) {
		
		ToStringConcept sc = new ToStringConcept(25, "Pradip", "Darji");
		System.out.println(sc);

	}

}
