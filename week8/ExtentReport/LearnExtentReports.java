package testcases;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		System.out.println("Extent Report Started");

		// Setup the physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		// Create an object for ExtentReports
		ExtentReports extent = new ExtentReports();

		// Attach the data with the physical file
		extent.attachReporter(reporter);

		// Create a test case in report
		ExtentTest test1 = extent.createTest("Create Lead", "Create Lead with Mandatory fields");
		test1.assignCategory("Smoke");
		test1.assignAuthor("Haja");

		// Step level information
		test1.pass("Username is entered successfully");
		test1.pass("Password is entered successfully");
		test1.pass("Login is clicked successfully",
				MediaEntityBuilder.createScreenCaptureFromPath(".././images/img0.png").build());

		ExtentTest test2 = extent.createTest("Edit Lead", "Edit the newly created lead");
		test2.assignCategory("Sanity");
		test2.assignAuthor("Babu");
		
		// Step level information
		test2.pass("Username is entered successfully");
		test2.pass("Password is entered successfully");
		test2.fail("Login is not successful");

		// Flush report
		extent.flush();
	}

}
