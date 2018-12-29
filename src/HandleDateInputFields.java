import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleDateInputFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = driver.findElements(By.cssSelector(".ui-state-default")).size();
		for(int i=1; i<count; i++) {
			String day = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if(day.equals("31")) {
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();;
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
			Assert.assertTrue(true);
			driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		} else {
			Assert.assertTrue(false);
		}
		driver.close();
	}

}
