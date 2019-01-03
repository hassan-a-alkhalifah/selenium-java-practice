import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTableGrids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20658/syt-vs-prs-17th-match-big-bash-league-2018-19");
		WebElement tableDriver = driver.findElement(By.cssSelector("#innings_1 .cb-col.cb-col-100.cb-ltst-wgt-hdr:first-child"));
		List<WebElement> r = tableDriver.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms .cb-col.cb-col-8.text-right.text-bold"));
		int total = 0;
		for(int i = 0; i < r.size() - 1; i++) {
			 total += Integer.parseInt(r.get(i).getText());
		}
		if(total == Integer.parseInt(r.get(r.size() - 1).getText())) {
			System.out.println("Equals");
		} else {
			System.out.println("Not equals");
		}
		driver.close();
	}

}
