package TestsPckgOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_5 extends BaseClass {

	@Test 
	public void Test_5() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:/Workspace/browsers/geckodriver.exe");

		WebDriver driver = GetDriverAndNavigateToMainPage();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div/div")).click();

		Thread.sleep(1000);

		driver.quit();

	}

}
