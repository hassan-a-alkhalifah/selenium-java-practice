import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowsertestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is a test case
		// Selenium code below
		
		// Invoke .exe file first
		
		// Create driver object for Edge browser
		/*
		 *  Create a object from class example
		 *  Class name = ClassName;
		 *  
		 *  ClassName objectName = new ClassName();
		 */
		
		// Strictly implement methods from webdriver(interface)

		System.setProperty("webdriver.edge.driver", "C:\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
