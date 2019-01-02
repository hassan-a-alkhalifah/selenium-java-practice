import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameSelectingPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int frameNumber = findFrameNumber(driver,By.id("recaptcha-anchor"));
		driver.switchTo().frame(frameNumber);
		driver.findElement(By.id("recaptcha-anchor")).click();
		driver.switchTo().defaultContent();
		
		int frameNumber2 = findFrameNumber(driver,By.id("recaptcha-verify-button"));
		System.out.println(frameNumber2);
		driver.switchTo().frame(frameNumber2);
		driver.findElement(By.id("recaptcha-verify-button")).click();
		driver.switchTo().defaultContent();
		driver.close();
	}
	
	public static int findFrameNumber(WebDriver driver, By by) {
		int i;
		int noOfiFrames = driver.findElements(By.tagName("iframe")).size();
		for(i=0; i<noOfiFrames; i++) {
			driver.switchTo().frame(i);
			int noOfiFrameCheckBoxes = driver.findElements(by).size();
			if(noOfiFrameCheckBoxes>0) {
				break;
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
