package week1.day2;

/*
 * shortcut for execution -> cntrl+F11
 * 
 * 
 */
public class LearnInputToMethod {
	
	
	public void sum(int num1, int num2, double num3, String name) {
		//int num1 = 10;
		//int num2 = 20;
		System.out.println(num1 + num2 + num3);
		System.out.println("Last line of method");

	}
	
	

	public static void main(String[] args) {
		LearnInputToMethod obj = new LearnInputToMethod();
		
		//call method
		obj.sum(20,40,60.98,"Addition");
		
		
		System.out.println("Last code in the main method");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
