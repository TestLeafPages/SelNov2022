package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPhonePrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		
		List<WebElement> allMblEles = driver.findElements(By.className("a-price-whole"));
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		for (WebElement eachMblEle : allMblEles) {
			System.out.println(eachMblEle.getText());
			String text = eachMblEle.getText().replace(",", "").replace("₹", "");
			int price = Integer.parseInt(text);
			priceList.add(price);
		}
		
		Collections.sort(priceList);
		System.out.println("Least Price: " + priceList.get(0));
	}
}
