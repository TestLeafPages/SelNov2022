package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		// String literal
		String s = "Welcome to Test Leaf";
		
		// String Object
		String s2 = new String("Testleaf");
		
		// Compare 2 strings
		boolean isEqual = s.equals(s2);
		System.out.println(isEqual);
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s == s2);
		
		// to get the number of characters in String
		int length = s.length();
		System.out.println(length);
		
		// to convert String to char array
		char[] charArray = s.toCharArray();
		System.out.println(charArray[7]);
		for(int i=0; i<charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		// to get a particular char
		char charAt = s.charAt(s.length()-1);
		System.out.println(charAt);
		
		// to get the position of a specific char
		int indexOf = s.indexOf('e');
		System.out.println(indexOf);
		
		// to check if a string contains a specific text
		boolean contains = s.contains("Leaf");
		System.out.println(contains);
		
		// to split the string
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		
	}

}
