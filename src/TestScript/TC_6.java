package TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_6 {
	
	@Test

	public void Test_6() throws InterruptedException, IOException {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Stepa/Workspace/WebDriverProject/browsers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		Properties property = new Properties();
		
		
	    FileInputStream objFile = new FileInputStream("C:/Users/Stepa/Workspace/WebDriverProject/src1/property.file");
	    
	    try {
	    	property.load(objFile);
	    	
	    }catch (IOException e){
	    	
	     }	
	    
	    
	    driver.get(property.getProperty("baseURL"));

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/ul/li[5]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("mce-EMAIL")).sendKeys(property.getProperty("name"));

		driver.findElement(By.id("mce-FNAME")).sendKeys(property.getProperty("last"));

		driver.findElement(By.id("mce-LNAME")).sendKeys(property.getProperty("email"));

		Thread.sleep(1000);

		driver.findElement(By.id("mc-embedded-subscribe")).click();

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		System.out.println("Subscrabe success");

		driver.quit();

	}

}
