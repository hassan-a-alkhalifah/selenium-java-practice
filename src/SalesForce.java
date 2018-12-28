import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("username");
		// Use cssSelector to target required element
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		// Use xPath to target required element
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		// Get text from selected element
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//driver.close();
	}

}


//Custom xPath example
// //tagName[@attribute='value']
// //input[@id='pass']