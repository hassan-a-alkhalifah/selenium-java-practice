import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdownMenuAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement autocompleteInput = driver.findElement(By.id("autocomplete"));
		autocompleteInput.sendKeys("uni");
		JavascriptExecutor jsE = (JavascriptExecutor)driver;
		String getAutocompleteInputValueScript = "return document.getElementById('autocomplete').value;";
		String autocompleteInputValue = (String) jsE.executeScript(getAutocompleteInputValueScript);
		int loopLimit = 0;
		while(!autocompleteInputValue.equalsIgnoreCase("United States")) {
			autocompleteInput.sendKeys(Keys.DOWN);
			autocompleteInputValue = (String) jsE.executeScript(getAutocompleteInputValueScript);
			loopLimit++;
			if(loopLimit>20) {
				break;
			}
		}
		if(autocompleteInputValue.equalsIgnoreCase("United States")) {
			System.out.println("Successful. United States element found");
		} else {
			System.out.println("Error. United States element not found");
		}
	}

}
