import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		// Gives the total number of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Gives the total number of links in the footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		// Gives the total number of links in first column of footer section
		WebElement footerDriverFirstSectionDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerDriverFirstSectionDriver.findElements(By.tagName("a")).size());
		// Click each link and print it's title
		for(int i=1; i < footerDriverFirstSectionDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerDriverFirstSectionDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		while(id.hasNext()) {
			System.out.println(driver.switchTo().window(id.next()).getTitle());
		}
	}

}
