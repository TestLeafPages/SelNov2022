package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		
		// Load the url
		driver.get("https://www.leafground.com/select.xhtml");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Find the select tag element
		WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));
		
		// Create object for Select class
		Select dd = new Select(eleTool);
		
		// Choose the option (index, visibleText, value)
//		dd.selectByIndex(1);
		dd.selectByVisibleText("Playwright");
		dd.selectByValue("");
		
		// To get value selected in dropdown
		WebElement ele = dd.getFirstSelectedOption();
		ele.getText();
	}

}
