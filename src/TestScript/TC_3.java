package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import mainclss.ApplicationProperties;
import mainclss.BaseClass;

public class TC_3  extends BaseClass {

	@Test
	
	public void Test_3() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver",
		// "./browsers/geckodriver.exe"); // read about absolute and relative
		// path
		System.setProperty("webdriver.gecko.driver", "C:/Workspace/browsers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get(ApplicationProperties.applicationURL);

		

		Thread.sleep(1000);

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());

		}

		driver.quit();

	}
}


