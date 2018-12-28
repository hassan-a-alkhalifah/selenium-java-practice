import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookChromePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Open url in browser
		driver.get("https://www.facebook.com/");
		// Find element with id "email" on webpage and send keys(string) to input box
		driver.findElement(By.id("email")).sendKeys("zzmarineszz@aol.com");
		// Find element with name attribute on webpage and send info
		driver.findElement(By.name("pass")).sendKeys("");
		// Find element by link text and click anchor tag
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("zzmarineszz@aol.com");
		driver.findElement(By.name("pass")).sendKeys("");
	}

}

// Custom xPath example
// //tagName[@attribute='value']
// //input[@id='pass']