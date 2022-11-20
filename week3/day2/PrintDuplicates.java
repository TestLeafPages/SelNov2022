package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 3, 5, 3, 2, 1, 7, 2, 3 };
		// output: 2, 3
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		Set<Integer> onlyUnique = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			boolean add = uniqueSet.add(nums[i]);
			if(!add) {
				onlyUnique.add(nums[i]);
			}
		}
		
		System.out.println(onlyUnique);
		
	}

}
