package TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import mainclss.BaseClass;

public class TC_8 extends BaseClass {
	
	
	
	@Test
	public void Test_8() throws InterruptedException, IOException {
		

		System.setProperty("webdriver.gecko.driver", "C:/Workspace/browsers/geckodriver.exe");
		
		
		WebDriver driver = GetDriverAndNavigateToMainPage();

		
		Properties property = new Properties();//инициализируем  объект Properties
		
		FileInputStream objFile = new FileInputStream("C:/Users/Stepa/Workspace/WebDriverProject/src1/property.file");

		//прописываю путь к proporties file
		
		
		 
	    try {
	    	property.load(objFile);
	    	
	    }catch (IOException e){
	    	
	     }	
	    
	    driver.get(property.getProperty("baseURL"));
		

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[13]/div[1]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[2]/div[1]/a")).click();

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
