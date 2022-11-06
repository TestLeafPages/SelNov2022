package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//array declaration
		//int[] values = new int[3]; // index starts from 0, length-1
		
		//values[0] = 20;
		//values[1] = 10;
		//values[2] = 40;
		
		int[] values = {20,10,30,50}; 
		
		int noOfData = values.length;
		
		System.out.println(noOfData);
		
		//to sort the data in ascending order
		Arrays.sort(values); //10,20,30,50 
		
		//last index values.length - 1
		//Iindex for second largest is values.length - 2
		
		System.out.println(values[values.length - 2]);
		
		
		
		//0,1,2,3
		for (int i = noOfData - 1; i >= 0 ; i--) {
			System.out.println(values[i]);
		}
		
		
		
		
		
		
		
	}

}
