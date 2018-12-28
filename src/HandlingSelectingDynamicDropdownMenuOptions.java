import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectingDynamicDropdownMenuOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Select select = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1")));
		select.selectByValue("AIP");
		Select select2 = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1")));
		select2.selectByValue("BKK");
	}

}
