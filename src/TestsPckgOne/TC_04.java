package TestsPckgOne;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

@Test
public class TC_04 extends BaseClass{

	public void Test_4() throws InterruptedException, IOException {

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

		WebDriver driver = getDriverInstance();
		
		driver.get(property.getProperty("baseURL"));
		
        WebElement PageElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/h1"));
       
		
		System.out.println(PageElement.getText());

		driver.quit();

	}

}
