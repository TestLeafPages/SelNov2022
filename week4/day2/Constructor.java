package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Constructor {
	
	String cName = "TestLeaf";
	
	/*
	 * Default Constructor
	 * 
	 * Constructors are like methods without return type
	 * name of the constructor = name of the class
	 * 
	 */
	
	public Constructor() {
		System.out.println("TEST");
		System.out.println(this.cName);
	}
	
	public Constructor(String cName) {
		this.cName = cName;
		System.out.println(this.cName);
	}
	
	public void method1() {
		System.out.println("Method 1");
	}

	public static void main(String[] args) {
		Constructor cons = new Constructor("test");
//		cons.method1();
//		ChromeOptions options = new ChromeOptions();
//		ChromeDriver driver = new ChromeDriver(options);
//		Constructor dCons = new Constructor();
//		Select dd = new Select(element)
	}

}
