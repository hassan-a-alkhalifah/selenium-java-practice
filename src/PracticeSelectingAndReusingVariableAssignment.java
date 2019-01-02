import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelectingAndReusingVariableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String selectedOption = driver.findElement(By.id("checkBoxOption2")).getText();
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.xpath("//option[@value='" + selectedOption + "']")).click();
		driver.findElement(By.id("name")).sendKeys(selectedOption);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		if(alertText.contains(selectedOption)) {
			System.out.println("Does Contain " + selectedOption);
		} else {
			System.out.println("Failed Execution");
		}
		driver.switchTo().alert().accept();
		driver.close();
	}

}
