package week1.day2;

public class FindFactorial {

	public static void main(String[] args) {
		int input = 13;
		//output 5*4*3*2*1 = 120
		
		//for multiplication / product initial value 1
		 // for add / sum  initial value 0
		int fact = 1; 
		
		for (int i = input; i > 0; i--) {
			
			fact = fact * i;
			
		}
		
		System.out.println(fact);
		
				

	}

}
