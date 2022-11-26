package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span[text()='Show']")).click();

		// switch to alert
		Alert alert = driver.switchTo().alert();

		// how to get the text from alert
		String text = alert.getText();
		System.out.println(text);

		// to input text
		alert.sendKeys("TestLeaf");

		Thread.sleep(3000);

		// how to accept
//		alert.accept();

		// how to dismiss
//		alert.dismiss();
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		

	}

}
