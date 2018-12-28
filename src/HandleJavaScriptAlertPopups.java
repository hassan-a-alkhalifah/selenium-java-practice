import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaScriptAlertPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		// Switch driver to target pop up alert type and accept 
		// pop up alert and get text from pop up alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// To click cancel or no on pop up alert
		//driver.switchTo().alert().dismiss();
		
		// If pop up alert has input field, this is how to
		// input info in input field
		//driver.switchTo().alert().sendKeys("Enter something");
	}

}
