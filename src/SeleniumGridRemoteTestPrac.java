import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridRemoteTestPrac {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		// DesiredCapabilities Class
		// Set properties on which browser this
		// test should be executed and on which
		// operating system this test should be
		// executed on.
		// This class is required to run test cases
		// remotely
		
		// This will run code remotely on node(slave)
		// machine
		DesiredCapabilities dc = new DesiredCapabilities();
		// Set which browser to run remotely
		dc.setBrowserName("chrome");
		// Set which machine to run remotely
		dc.setPlatform(Platform.WINDOWS);
		
		// WebDriver driver = new ChromeDriver() to run
		// locally
		
		// Runs remotely
		// Pass local Hub IP address as first argument
		// Pass DesiredCapabilities as second argument
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.159:8091/wd/hub"),dc);
		
		driver.get("https://google.com");
	}

}