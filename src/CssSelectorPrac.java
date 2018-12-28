import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("username");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
