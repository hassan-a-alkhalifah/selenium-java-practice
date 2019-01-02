import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdownAdvancePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		WebElement leavingFromInput = driver.findElement(By.id("fromPlaceName"));
		leavingFromInput.sendKeys("BENG");
		
		// Selenium cannot ID hidden elements - (AJAX implementation)
		// JavaScript DOM can extract hidden elements
		// Use JavascriptExecutor to run Javascript parallel to Java
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById('fromPlaceName').value;";
		String text = (String) js.executeScript(script);
		int i = 0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
			i++;
			leavingFromInput.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			if(i>10) {
				break;
			}
		}
		if(i>10) {
			System.out.println(text + " not found");
		} else {
			System.out.println(text + " found");
		}
		driver.close();
	}

}
