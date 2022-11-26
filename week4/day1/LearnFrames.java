package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// switch to frame with index
//		driver.switchTo().frame(0);
		
		// switch to frame with id or name
//		driver.switchTo().frame("frame2");
		
		// switch to frame with WebElement
		WebElement ele = driver.findElement(By.xpath("//h5[contains(text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(ele);
		
		// switch to inner frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		// come out of all frames
		driver.switchTo().defaultContent();
		
		// come out of only one frame
//		driver.switchTo().parentFrame();
	}

}
