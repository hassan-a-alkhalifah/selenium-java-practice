import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarUISelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		// Target December 16
		driver.findElement(By.id("travel_date")).click();
		// Use while loop to select month
		while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("December")) {
			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
		}
		// Use for loop to select month
//		driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).click();
//		List<WebElement> months = driver.findElements(By.className("month"));
//		for(int j=0; j<months.size(); j++) {
//			String month = months.get(j).getText();
//			if(month.equals("Dec")) {
//				months.get(j).click();
//				break;
//			}
//		}
		List<WebElement> dates = driver.findElements(By.className("day"));
		for(int i=0; i<dates.size(); i++) {
			String day = dates.get(i).getText();
			if(day.equals("16")) {
				dates.get(i).click();
				break;
			}
		}
	}

}
