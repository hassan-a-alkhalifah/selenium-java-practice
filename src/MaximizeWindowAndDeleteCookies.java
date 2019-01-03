import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowAndDeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximizes window before rendering URL
		driver.manage().window().maximize();
		
		// Delete all cookies
		driver.manage().deleteAllCookies();
		
		// Delete certain cookie
		// driver.manage().deleteCookieNamed("sessionKey");
		
		driver.get("https://google.com");
	}

}
