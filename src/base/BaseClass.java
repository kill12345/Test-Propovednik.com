package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver GetDriverAndNavigateToMainPage(){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://propovednik.com");
		driver.manage().window().maximize();
		
		return driver;
	}
	
	// resizeBrowserWindow()

	// moveBrowserWindowToSecondScreen()
	
	// FindBrowserWindowByWindowTitle(String title)
	
	// ... 58 more methods
	
}
