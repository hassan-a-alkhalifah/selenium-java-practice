import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions actions = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement enterCaps = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		actions.moveToElement(enterCaps).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// Moves to specific element
		actions.moveToElement(move).contextClick().build().perform();
	}

}
