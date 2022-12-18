package week7.day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertion {

	@Test
	public void main() {

		String s1 = "TestLeaf";
		String s2 = "TESTLEAF";
		String s3 = "Haja";
		String s4 = "Haja";
		
		// Hard Assertion
//		Assert.assertEquals(s1, s2);
//		Assert.assertTrue(s1.equals(s2));
//		Assert.assertFalse(s1.contains(s2));
		
		// Soft Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(s1, s2);
		sa.assertEquals(s1, s3);
		sa.assertEquals(s3, s4);
		
		System.out.println("Last line of program");
		sa.assertAll();
	}

}
