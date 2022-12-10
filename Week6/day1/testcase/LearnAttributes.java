package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(invocationCount = 5, priority = 0)
	public void createLead() {
		System.out.println("Create Lead");
	}

	@Test(priority = 1, alwaysRun = true, enabled = false)
	public void editLead() {
		System.out.println("Edit Lead");
	}

	@Test(priority = -3)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
