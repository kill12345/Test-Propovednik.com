package TestScript;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mainclss.BaseClass;

public class TC_1  extends BaseClass {

	@Test
	public void Test_1() throws InterruptedException {
		
		// System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe"); // read about absolute and relative path
		System.setProperty("webdriver.gecko.driver","C:/Users/Stepa/Workspace/WebDriverProject/browsers/geckodriver.exe");
		
		WebDriver driver = GetDriverAndNavigateToMainPage();
		
		
		
		WebElement headingDivElement = driver.findElement(By.id("pageContent")).findElement(By.id("cms-content")).findElement(By.xpath(".//div[@class='heading']"));
		String headingDivText = headingDivElement.getText().trim();
		assertTrue(headingDivText.equals("Новости"));
		
		// driver.findElement(By.xpath("//a[contains(text(), 'О наc')]")).click();
		
		driver.quit();
	}

}
		

	
				 
		 
		 


