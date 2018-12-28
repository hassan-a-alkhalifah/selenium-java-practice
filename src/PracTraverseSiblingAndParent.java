import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracTraverseSiblingAndParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).getAttribute("role"));
		driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
	}

}

// How to target element by text
// Example //*[text()=' Selenium ']