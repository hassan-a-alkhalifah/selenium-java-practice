import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToTakeScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// Object behavior to render browser URL
		driver.get("https://google.com");
		
		// Change object behavior to take screenshot
		// by casting driver with TakesScreenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Copies file object and saving(writing) to local machine
		FileUtils.copyFile(src,new File("C:\\Users\\zzmar_000\\Desktop\\screenshot.png"));
	}

}
