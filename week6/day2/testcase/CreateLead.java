package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.ReadExcel;

public class CreateLead extends BaseClass{
	
	@BeforeClass
	public void setData() {
		fileName = "CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
	}
	
//	@DataProvider(name="fetchData")
//	public String[][] setData() throws IOException {
////		String[][] data = new String[2][3];
////		
////		data[0][0] = "TestLeaf";
////		data[0][1] = "Haja";
////		data[0][2] = "J";
////		
////		data[1][0] = "QEagle";
////		data[1][1] = "Hari";
////		data[1][2] = "R";
//		
//		String[][] data = ReadExcel.readData();
//		
//		return data;
//	}
	
	

}
