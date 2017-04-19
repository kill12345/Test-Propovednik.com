package TestsPckgOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_2 extends BaseClass{

	@Test
	public void Test_2() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver",
		// "./browsers/geckodriver.exe"); // read about absolute and relative
		// path
		System.setProperty("webdriver.gecko.driver", "C:/Workspace/browsers/geckodriver.exe");

		
		
	    WebDriver driver = GetDriverAndNavigateToMainPage();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/p[1]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[2]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[7]/div[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div[1]/a[1]/img")).click();

		Thread.sleep(5000);

		driver.navigate().back();

		Thread.sleep(5000);

		driver.navigate().refresh();

		System.out.println("browser propovednik.com ");

		Thread.sleep(1000);

		driver.quit();

	}

}
