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

public class TC_10 extends BaseClass {
	
	@Test
	public void Test_10() throws InterruptedException, IOException {

		
		
		
		String url = "http://propovednik.com";
		String text_case_id = "1";

	
        Properties property = new Properties();


		String F = "/Users/stepanmisiruk/IdeaProjects/Test-Propovednik.com/resources/main.properties";
		FileInputStream objFile = new FileInputStream(F);


	    try {
	    	property.load(objFile);
	    	
	    }catch (IOException e){
	    	
	    }
	    
	    System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
	    
	    System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));
	    
	    WebDriver driver = getDriverInstance();
	    
	    driver.get(property.getProperty("baseURL"));
	
	WebElement TextValidation = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/h1"));
	TextValidation.click();
	
	String TextValidationText = TextValidation.getAttribute("style");
	assertTrue(TextValidationText.equals("color: white;"), "Was not able Validate");
	
	
	
	if (TextValidationText.equals("color: white;")) {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("URL: \t\t\t" + url);
		System.out.println("Test Case Result: \t" + "PASSED");
	} else {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("URL: \t\t\t" + url);
		System.out.println("Test Case Result: \t" + "FAILED");

	}

		driverClose(driver);
}

}

	
	


