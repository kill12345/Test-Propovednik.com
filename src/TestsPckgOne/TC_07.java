package TestsPckgOne;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_07 extends BaseClass {

	@Test
	public void Test_7() throws InterruptedException, IOException {

		String F = "/Users/stepanmisiruk/IdeaProjects/Test-Propovednik.com/resources/main.properties";

		 Properties property = new Properties();
			
		    FileInputStream objFile = new FileInputStream(F);
		    
		    try {
		    	property.load(objFile);
		    	
		    }catch (IOException e){
		    	
		    }
		    
		    System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
		    
		    System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));
		    
		    WebDriver driver = getDriverInstance();
		    
		    driver.get(property.getProperty("baseURL"));

		String url = "http://propovednik.com";
		
		String text_case_id = "1";

		String title_expected = "Propovednik.com: �?ово�?ти";

		Thread.sleep(1000);

		driver.get(url);

		String title_actual = driver.getTitle();

		if (title_expected.equals(title_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "PASSED");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "FAILED");

		}

		driverClose(driver);
	}

}
