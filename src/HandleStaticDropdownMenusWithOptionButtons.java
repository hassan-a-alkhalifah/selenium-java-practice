import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticDropdownMenusWithOptionButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		// Thread.sleep() is not best practice. Will learn better
		// practice soon
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Run with while loop example
		/*int i = 1;
		while(i < 5) {
			// Click 4 times
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}*/
		// Run with for loop example
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		// Check if text from drop down is showing corrected
		// selected amount
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
	}

}
