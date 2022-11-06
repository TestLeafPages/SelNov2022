package week1.day2;

/*
 * shortcut to save in local variable -> cntrl+2; tap L
 * 
 */
public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int add = cal.add(10, 20, 30);
		int sub = cal.sub(30, 20);
		double mul = cal.mul(45.25, 67.34);
		float divide = cal.divide(43.98f, 12.45f);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(divide);

	}

}
