import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffRegExpExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Already a user? S']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("username");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//input[contains(@title,'Sign in')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='text-container']/div[4]/div[contains(@style,'float:left;color:#BD3600')]")).getText());
	}

}

// To traverse(target) sibling from another sibling
// Example //*[@id='tablist']/following-sibling::li[2]

// To traverse from child to parent
// Example //*[@id='tablist']/parent::ul