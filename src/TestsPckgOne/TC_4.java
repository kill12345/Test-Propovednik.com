package TestsPckgOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_4 extends BaseClass{

	@Test
	public void Test_4() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver",
		// "./browsers/geckodriver.exe"); // read about absolute and relative
		// path
		System.setProperty("webdriver.gecko.driver", "C:/Workspace/browsers/geckodriver.exe");

		WebDriver driver = GetDriverAndNavigateToMainPage();
		
        WebElement PageElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/h1"));

		System.out.println(PageElement.getText());

		driver.quit();

	}

}
