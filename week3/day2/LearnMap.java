package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		Map<Integer, String> empDetails = new HashMap<Integer, String>();
		
		empDetails.put(1001, "Haja");
		empDetails.put(1002, "Hari");
		empDetails.put(1002, "Babu");
		empDetails.put(1003, "Hari");
		
		System.out.println(empDetails);
		System.out.println(empDetails.size());
		
		empDetails.remove(1001);
		System.out.println(empDetails);
		
		System.out.println(empDetails.containsKey(1001));
	}

}
