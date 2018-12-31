import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindowsActionPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.cssSelector("ul.Bgzgmd li:nth-child(1) a")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		String parentId = id.next();
		String childId = id.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
