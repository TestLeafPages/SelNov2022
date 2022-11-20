package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindIntegerOccurence {

	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 3, 2, 5};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			/*
			 * if(map.containsKey(nums[i])) { map.put(nums[i], map.get(nums[i])+1); } else {
			 * map.put(nums[i], 1); }
			 */
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		System.out.println(map);
	}
	

}
