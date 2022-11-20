package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> mentors = new ArrayList<String>();
		mentors.add("Haja");
		mentors.add("Hari");
		mentors.add("Babu");
		mentors.add("Balaji");
		
		System.out.println(mentors);
		System.out.println(mentors.size());
		
		mentors.remove(1);
		System.out.println(mentors);
		
		String mentor = mentors.get(1);
		System.out.println(mentor);
		
		boolean isPresent = mentors.contains("Hari");
		System.out.println(isPresent);
		
//		mentors.clear();
//		System.out.println(mentors);
		
		boolean isEmpty = mentors.isEmpty();
		System.out.println(isEmpty);
		
		mentors.add(2, "Aravind");
		System.out.println(mentors);
		
		Collections.sort(mentors);
		System.out.println(mentors);
	}

}
