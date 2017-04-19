package TestsPckgOne;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_10 {
	
	@Test
	public void Test_10() throws InterruptedException {

		String url = "http://propovednik.com";
		String text_case_id = "1";

	
	
	System.setProperty("webdriver.gecko.driver", "C:/Workspace/browsers/geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();

	driver.get("http://propovednik.com");
	
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

	driver.quit();
}

}

	
	


