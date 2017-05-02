package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public BaseClass(){
		
		System.setProperty("webdriver.gecko.driver", PropertiesUtility.getProperty("GECKODRIVERLOCATION"));
	    System.setProperty("webdriver.chrome.driver", PropertiesUtility.getProperty("CHROMEDRIVERLOCATION"));
	    
	}
	
	public void driverClose(WebDriver driver){
		driver.quit();
	}
	
	public WebDriver getDriverInstance() throws InterruptedException {

		
   WebDriver driver = null;
		
		String browser = PropertiesUtility.getProperty("browser");
		
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome")){
			driver = new ChromeDriver();
		}

		// our project needs to be a maven project
		// we can run maven project from console AND we can pass parameters

		// driver.manage().window().maximize();

		// Thread.sleep(1000);

		return driver;

	}
	
	public static void pause(int seconds){
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public void navigateToMainPage(WebDriver driver){
		driver.get(PropertiesUtility.getProperty("baseURL"));
	}

	public void GETDRIVEREEFRECH(WebDriver driver) throws InterruptedException{
	//public  void GETDRIVEREEFRECH(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);

		driver.navigate().back();

		Thread.sleep(5000);

		driver.navigate().refresh();

		System.out.println("browser propovednik.com ");

		Thread.sleep(1000);

		driver.quit();
	}

	// resizeBrowserWindow()

	// moveBrowserWindowToSecondScreen()

	// FindBrowserWindowByWindowTitle(String title)

	// ... 58 more methods

}
