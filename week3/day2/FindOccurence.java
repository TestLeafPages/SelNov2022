package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurence {

	public static void main(String[] args) {
		String cName = "amazon india";
		// a=3, m=1, z=1, o=1, n=2, i=2, d=1
		
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		
		char[] charArray = cName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (occ.containsKey(charArray[i])) {
				int value = occ.get('a'); // value = 1
				occ.put(charArray[i], value+1); // a=2
			} else {
				occ.put(charArray[i], 1); // a=1, m=1
			}
		}
//		System.out.println(occ);
		
		// Print the characters which has only one occurrence
		Set<Entry<Character, Integer>> entrySet = occ.entrySet();
		/*
		 * a=3
		 * m=1
		 */
		for (Entry<Character, Integer> entry : entrySet) {
			int value = entry.getValue();
			if(value==1) {
				System.out.println(entry.getKey()+":" + entry.getValue());
			}
		}
	}

}
