package TestsPckgOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_03  extends BaseClass {

	@Test
	public void Test_3() throws InterruptedException, FileNotFoundException {

		// System.setProperty("webdriver.gecko.driver",
		// "./browsers/geckodriver.exe"); // read about absolute and relative
		// path
		Properties property = new Properties();
		
	    FileInputStream objFile = new FileInputStream("C:/Users/Stepa/Workspace/WebDriverProject/resources/main.properties"); // TODO: FIX THIS
	    
	    try {
	    	property.load(objFile);
	    	
	    }catch (IOException e){
	    	
	    }	
		
		System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
		
		System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));

		WebDriver driver = new FirefoxDriver();

		driver.get(property.getProperty("baseURL"));

		Thread.sleep(1000);

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());

		}

		driver.quit();

	}
}


