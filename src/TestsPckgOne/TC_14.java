package TestsPckgOne;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import base.TopMenuUtility;

public class TC_14 extends BaseClass {

	@Test
	public void Test_8() throws InterruptedException, IOException {

		



		Properties property = new Properties();
		
		FileInputStream objFile = new FileInputStream("C:/Users/Stepa/Workspace/WebDriverProject/resources/main.properties");

		try {
			property.load(objFile);

		} catch (IOException e) {

		}
		
		System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
		
		System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));
		
        WebDriver driver = getDriverInstance();
	    
	    driver.get(property.getProperty("baseURL"));

		Thread.sleep(1000);

		TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");

		Thread.sleep(1000);
		
		WebElement CheckButton = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[1]/div[2]/a"));
		CheckButton.click();
		
		String ButtonDownload = CheckButton.getAttribute("style");
		
		assertTrue(ButtonDownload.equals("margin-top: 5px"));
		
		
		if (ButtonDownload.equals("margin-top: 5px")) {
			
			System.out.println("Test Case Result: \t" + "PASSED");
		} else {
			System.out.println("Test Case Result: \t" + "FAILED");

		}

		driver.quit();
	}

	
		
		
	}
	
