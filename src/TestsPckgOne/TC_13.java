package TestsPckgOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import base.TopMenuUtility;






public class TC_13 extends BaseClass {

//	@Tes
//	public void Test_13() throws InterruptedException, FileNotFoundException {
//
//		Properties property = new Properties();
//
//
//		String F = "/Users/stepanmisiruk/IdeaProjects/Test-Propovednik.com/resources/main.properties";
//		FileInputStream objFile = new FileInputStream(F);
//
//
//		try {
//			property.load(objFile);
//
//		} catch (IOException e) {
//
//		}
//		System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
//		System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));
//
//
//		WebDriver driver = getDriverInstance();
//
//		driver.get(property.getProperty("baseURL"));
//
//		TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");
//
//		Thread.sleep(1000);
//	}
//
//
//
//		   /* First Method
//		    *
//		    *
//		    *
//		    * WebDriverWait waiter = new WebDriverWait(driver, 5000);
//		    waiter.until( ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[1]/div[2]/a/img")) );
//		    driver.findElements(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[1]/div[2]/a/img"));
//
//
//		   driver.quit();
//
//
//		    */
//
//
//	//Second Method
//
//	boolean existsElement(String id) {
//		try {
//			WebDriver driver = new ChromeDriver();
//			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[1]/div[2]/a/img"));
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//		return true;
//
//
}