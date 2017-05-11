package TestsPckgOne;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import base.TopMenuUtility;

public class TC_12  extends BaseClass {

	@Test
	public void Test_12() throws InterruptedException, FileNotFoundException {

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

		Thread.sleep(1000);
		
		TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");
		
		Thread.sleep(1000);
		
		
//		List<String> lst1 = new ArrayList<String>();
//		lst1.add("Stepa");
//		lst1.add("Artur");
//		lst1.add("Inna");
//		lst1.add("Lena");
//		String secondItemInTheList = lst1.get(1);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='list']/ul/li/div[1]/a"));
		// System.out.println(list.size());
		
		boolean result = false;
		
		for (int i = 0; i < list.size(); i++) {

			WebElement folderWebElement = list.get(i);
			String folderName = folderWebElement.getText();
			System.out.println(folderName);
			
			if(folderName.equals("Братские, пресвитерские")){
				result = true;
				break;
			}
		}

		assertTrue(result, "Was not able to find Литература in the list");
		
		driver.quit();

	}
}


