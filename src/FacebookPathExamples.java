import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPathExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\facebook.com");
		
		// xPath Examples
//		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("username");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// cssSelector Examples
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("username");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}

// xPath Example
// //tagName[@attribute='value']

// cssSelector Example
// tagName[]attribute-'value'
// or
// tagName#id
// or
// tagName#id.className.className
// or
// #id or #id.className.className

// Regular Expression xPath Example For dynamic elements
// //tagName[contains(@attribute,'value')]
// //input[contains(@id,'pass')]

// Regular Expression cssSelector Example for dynamic elements
// tagName[attribute*='value']