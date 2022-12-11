package week6.day2;

import org.testng.annotations.Test;

import testcase.BaseClass;

public class LearnGroups extends BaseClass{

	@Test(groups = "smoke")
	public void createLead() {
		System.out.println("Create Lead");
		throw new RuntimeException();
	}

	@Test(groups = "sanity")
	public void editLead() {
		System.out.println("Edit Lead");
	}
}
