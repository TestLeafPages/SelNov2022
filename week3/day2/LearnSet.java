package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> mentors = new LinkedHashSet<String>();
		mentors.add("Haja");
		mentors.add("Hari");
		mentors.add("Babu");
		mentors.add("Balaji");
		mentors.add("Hari");
		
		System.out.println(mentors);
	}

}
