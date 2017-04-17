package TestScript;
    

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class TC_11 {
		
		@Test
		public void Test_11() throws InterruptedException, IOException {
			
			System.setProperty("webdriver.gecko.driver", "C:/Workspace/browsers/geckodriver.exe");
			
			
           WebDriver driver = new FirefoxDriver();
			
			
			String url = "http://propovednik.com";
			
			String text_case_id = "1";
			  
			Properties property = new Properties();
			
			
		    FileInputStream objFile = new FileInputStream("C:/Users/Stepa/Workspace/WebDriverProject/src1/property.file");
		    
		    try {
		    	property.load(objFile);
		    	
		    }catch (IOException e){
		    	
		     }	
		    
		 
		    driver.get(property.getProperty("baseURL"));

			driver.manage().window().maximize();
			
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[1]/div[1]/a")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/ul/li[1]/div[2]/a[1]/img")).click();
			
			Thread.sleep(2000);
			
			
			WebElement CheckButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div[2]/div/div[2]/div/button[1]"));
			
					CheckButton.click();
					
					driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div[2]/div/div[2]/div/button[1]")).click();
					
					String  CheckButtonDellite = CheckButton.getAttribute("onclick");
					
					assertTrue(CheckButtonDellite.equals("clearPlaylist();"));
					
					
					if (CheckButtonDellite.equals("clearPlaylist();")) {
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
	
