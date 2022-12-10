package testcase;

import org.testng.annotations.Test;

public class Dependency {
	@Test()
	public void createLead() {
		System.out.println("Create Lead");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = {"createLead","deleteLead"}, alwaysRun = true)
	public void editLead() {
		System.out.println("Edit Lead");
	}
}
