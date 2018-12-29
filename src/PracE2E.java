import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Select select = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1")));
		select.selectByValue("DEL");
		Thread.sleep(1000);
		Select destination = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1")));
		destination.selectByValue("MAA");
		Thread.sleep(1000);
		int count = driver.findElements(By.cssSelector(".ui-state-default")).size();
		for(int i=1; i<count; i++) {
			String day = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if(day.equals("31")) {
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();;
			}
		}
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.id("Div1")).getAttribute("style"), "display: block; opacity: 0.5;");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		driver.close();
	}

}
