package TestsPckgOne;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_05 extends BaseClass {

	@Test 
	public void Test_5() throws InterruptedException, IOException {

		String F = "/Users/stepanmisiruk/IdeaProjects/Test-Propovednik.com/resources/main.properties";

        Properties property = new Properties();

		FileInputStream objFile = new FileInputStream (F);
	    
	    try {
	    	property.load(objFile);
	    	
	    }  catch (IOException e){
	    	
	    }
	    
	    System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
		System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));

		WebDriver driver = getDriverInstance();
		driver.get(property.getProperty("baseURL"));
		
        Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='light-grey-style animated jp-mute']")).click();
		Thread.sleep(1000);

		driverClose(driver);

	}

}
