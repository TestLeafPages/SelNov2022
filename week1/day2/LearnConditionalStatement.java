package week1.day2;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		int age = 70;

		// int a = 10;
		// int b = 20;

		// used for comparison &
		// false true

		if (age < 60 && age >= 18) {
			System.out.println("Adult");
		} else if (age < 18) {
			System.out.println("minor");
		} else {
			System.out.println("Senior Citizen");
		}

		/*
		 * if(a < b) { System.out.println("a is smaller than b"); }else {
		 * System.out.println("a is greater than b"); }
		 */

		System.out.println("End of Program");

	}

}
