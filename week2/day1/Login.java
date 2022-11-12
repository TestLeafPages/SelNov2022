package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		// Setup browser driver
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\Users\ADMIN\Desktop\ChromeDriver.exe");
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Enter the username (Ctrl+2, L)
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.equals("Haja")) {
			System.out.println("First name is correct");
		} else {
			System.out.println("First name is incorrect");
		}
		
		// close the browser
		Thread.sleep(2000);
		driver.close();
		
		WebElement ele = driver.findElement(By.id("viewLead_firstName_sp"));
		ele.clear();
		ele.sendKeys("test");
		ele.sendKeys(Keys.TAB);
	}

}
