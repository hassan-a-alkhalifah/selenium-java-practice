import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignmentPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pexels.com/");
		driver.findElement(By.id("search")).sendKeys("frog");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		WebDriverWait driverWait = new WebDriverWait(driver,5);
		driverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.page-wrap:nth-child(1) div.l-container div.photos div.photos__column:nth-child(1) div.hide-featured-badge.hide-photographer:nth-child(1) article.photo-item.photo-item--overlay a.js-photo-link.photo-item__link:nth-child(1) > img.photo-item__img"))).click();
	}

}
