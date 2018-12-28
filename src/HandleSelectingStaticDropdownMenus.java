import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectingStaticDropdownMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		// Use Select class only if static drop down is a select tag
		Select select = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1")));
		select.selectByValue("BKK");
		select.selectByIndex(1);
		select.selectByVisibleText("Bangkok (BKK)");
	}

}
