package TestsPckgOne;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import base.TopMenuUtility;

public class TC_08 extends BaseClass {

	@Test
	public void Test_8() throws InterruptedException, IOException {

		

		WebDriver driver = getDriverInstance();

		Properties property = new Properties();// инициализируем объект
												// Properties

		FileInputStream objFile = new FileInputStream("C:/Users/Stepa/Workspace/WebDriverProject/resources/main.properties");

		try {
			property.load(objFile);

		} catch (IOException e) {

		}
		
		System.setProperty("webdriver.gecko.driver", property.getProperty("GECKODRIVERLOCATION"));
		
		System.setProperty("webdriver.chrome.driver", property.getProperty("CHROMEDRIVERLOCATION"));

		driver.get(property.getProperty("baseURL"));

		Thread.sleep(1000);

		TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");

		Thread.sleep(1000);

		// click folder link
		driver.findElement(By.xpath("//a[contains(text(), 'Юбилеи, похороны')]")).click();
		
		// TODO: click download icon for folder
		
		// TODO: is download icon present for folder
		
		// TODO: get all folder names present on page

		Thread.sleep(1000);

		TopMenuUtility.clickMenuItemByLinkText(driver, "2016 Фото - Похороны Мануйло В.И");

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[1]/a/img")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/button[2]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);

		driver.quit();

		System.out.println("webBrowsers is working");

	}

}
