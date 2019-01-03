import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleHTTPSCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SSL Certificates
		// Capabilities help customize Chrome browser
		// Accepting SSL certificates
		// This is general Chrome profile with accepting
		// SSl certificates
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		// Option 1 below
		//dc.acceptInsecureCerts();
		//Option 2 below
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// Here is merging general Chrome profile with
		// local Chrome browser
		// Now local Chrome browser has knowledge on
		// how to handle provided capabilities
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("");
		
	}

}
