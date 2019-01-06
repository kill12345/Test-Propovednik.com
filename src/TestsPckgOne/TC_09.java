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

public class TC_09 extends BaseClass {

	@Test
	public void Test_9() throws InterruptedException, IOException {

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

		WebElement disableAudioButtonElement = driver.findElement(By.xpath("//button[@class='light-grey-style animated jp-mute']"));
		disableAudioButtonElement.click();
		
		String disableAudioButtonStyle = disableAudioButtonElement.getAttribute("style");
		//System.out.println(disableAudioButtonStyle);
		assertTrue(disableAudioButtonStyle.equals("display: none;"), "Was not able to verify style attribute for disable audio button on main page!");
		
		WebElement enableAudioButtonElement = driver.findElement(By.xpath("//button[@class='light-grey-style animated jp-unmute']"));
		enableAudioButtonElement.click();
		
		String enableAudioButtonStyle = enableAudioButtonElement.getAttribute("style");
		//System.out.println(enableAudioButtonStyle);
		assertTrue(enableAudioButtonStyle.equals("display: none;"));

		driverClose(driver);
	}

}
