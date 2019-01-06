package TestsPckgOne;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import base.TopMenuUtility;

public class TC_06 extends BaseClass {
	
	@Test

	public void Test_6() throws InterruptedException, IOException {

		String F = "/Users/stepanmisiruk/IdeaProjects/Test-Propovednik.com/resources/main.properties";

		Properties property = new Properties();

		FileInputStream objFile = new FileInputStream (F);

	       try {
	    	   property.load(objFile);
	    	
	           }catch (IOException e) {

		    }
	    
	    System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
	    
	    System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));

		WebDriver driver = getDriverInstance();
		
		driver.get(property.getProperty("baseURL"));

		Thread.sleep(1000);

		TopMenuUtility.clickMenuItemByLinkText(driver, "Подписка");

		Thread.sleep(1000);

		driver.findElement(By.id("mce-EMAIL")).sendKeys(genRandom() + property.getProperty("email"));

		driver.findElement(By.id("mce-FNAME")).sendKeys(genRandom() + property.getProperty("last"));

		driver.findElement(By.id("mce-LNAME")).sendKeys(genRandom() + property.getProperty("name"));

		Thread.sleep(1000);

		driver.findElement(By.id("mc-embedded-subscribe")).click();

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		System.out.println("Subscribe success");

		driverClose(driver);

	}

	private int genRandom(){
		Random rand = new Random();
		int  n = rand.nextInt(9999) + 1;
		return n;
	}
}
