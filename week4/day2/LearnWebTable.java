package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"))
				.getText();
//		System.out.println(text);

		List<WebElement> eles = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
		int size = eles.size();
		
		int colSize = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td")).size();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= colSize; j++) {
				String txt = driver
						.findElement(By
								.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + "]/td["+j+"]"))
						.getText();
				System.out.println(txt);
			}
		}

//		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
//		for (WebElement ele : eles) {
//			System.out.println(ele.getText());
//		}
	}

}
