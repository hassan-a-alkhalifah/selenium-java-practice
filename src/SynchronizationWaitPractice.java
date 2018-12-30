import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWaitPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		driver.findElement(By.xpath("//a[@data-lob='hotelOnly']")).click();
		driver.findElement(By.id("H-destination")).sendKeys("NYC");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//td[@class='datepicker-day-number notranslate']/button[@data-day='31']")).click();
		driver.findElement(By.id("H-searchButtonExt1")).click();
		// Explicit wait
		WebDriverWait d = new WebDriverWait(driver, 10);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@target='4956637']"))).click();
		
		//driver.findElement(By.xpath("//a[@target='4956637']")).click();
	}

}
