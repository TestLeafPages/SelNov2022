package week1.day2;

/*
 * shortcut for execution -> cntrl+F11
 * 
 * 
 */
public class LearnOutputFromMethod {
	
	//method to give int output
	public int sum(int num1, int num2, int num3) {
		int result = num1 + num2 + num3; //120
		System.out.println(result);
		
		return result;
	}
	
	

	public static void main(String[] args) {
		LearnOutputFromMethod obj = new LearnOutputFromMethod();
		
		//call method
		 int res = obj.sum(20,40,60); 
		
		//Arithmetic calculation
		System.out.println(res * 300 / 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
