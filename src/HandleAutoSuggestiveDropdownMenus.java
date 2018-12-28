import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestiveDropdownMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement source1 = driver.findElement(By.cssSelector("#hp-widget__sfrom"));
		source1.clear();
		source1.sendKeys("mum");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		source1.sendKeys(Keys.ENTER);
		
		WebElement source2 = driver.findElement(By.cssSelector("#hp-widget__sTo"));
		source2.clear();
		source2.sendKeys("del");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<2; i++) {
			source2.sendKeys(Keys.ARROW_DOWN);
		}
		source2.sendKeys(Keys.ENTER);
	}

}
