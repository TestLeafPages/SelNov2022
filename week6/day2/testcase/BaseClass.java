package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;

	@Parameters({"url", "username", "password"})
	@BeforeMethod(alwaysRun = true)
	public void preCondition(@Optional("http://leaftaps.com/opentaps/") String url, @Optional("DemoCSR") String uName, String pwd) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		return ReadExcel.readData(fileName);
	}
}
