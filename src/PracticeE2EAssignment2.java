import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeE2EAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cleartrip.com");
		Select adultsDropdown = new Select(driver.findElement(By.id("Adults")));
		adultsDropdown.selectByValue("2");
		Select childrenDropdown = new Select(driver.findElement(By.id("Childrens")));
		childrenDropdown.selectByValue("1");
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("PDX");
		Thread.sleep(1000);
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		driver.close();
	}

}
