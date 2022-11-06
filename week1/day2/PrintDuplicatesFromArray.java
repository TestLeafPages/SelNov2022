package week1.day2;


//F8 -> hop at each breakpoint
public class PrintDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20}; //14,18,17
		
		
				
		//to take the data one by one
		for (int i = 0; i < arr.length; i++) {
		
			
			for (int j = i+1; j < arr.length; j++) {
			
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
			
		}

	}

}
