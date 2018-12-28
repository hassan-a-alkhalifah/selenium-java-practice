import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is a test case
		// Selenium code below
		
		// Invoke .exe file first
		
		// Create driver object for Chrome browser
		/*
		 *  Create a object from class example
		 *  Class name = ClassName;
		 *  
		 *  ClassName objectName = new ClassName();
		 */
		
		// Strictly implement methods from webdriver(interface)
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Hit URL on the browser
		driver.get("https://google.com/");
		
		// Validate if page title is correct
		System.out.println(driver.getTitle());
		
		// Validate if on correct URL
		System.out.println(driver.getCurrentUrl());
		
		// Retrieve and print page source to target required element
		//System.out.println(driver.getPageSource());
		
		// Hit URL on the browser
		driver.get("https://yahoo.com");
		
		// To click browser back button
		driver.navigate().back();
		
		// To click browser forward button
		driver.navigate().forward();
		
		// To close current browser to minimize performance
		driver.close();
		
		// To close all browsers opened by Selenium script
		//driver.quit();
	}

}
