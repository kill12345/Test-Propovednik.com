package TestScript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_9 {

	@Test
	public void Test_9() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:/Users/Stepa/Workspace/WebDriverProject/browsers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://propovednik.com");
		// driver.manage().window().maximize();

		WebElement disableAudioButtonElement = driver.findElement(By.xpath("//button[@class='light-grey-style animated jp-mute']"));
		disableAudioButtonElement.click();
		
		String disableAudioButtonStyle = disableAudioButtonElement.getAttribute("style");
		//System.out.println(disableAudioButtonStyle);
		assertTrue(disableAudioButtonStyle.equals("display: none;"), "Was not able to verify style attribute for disable audio button on main page!");
		
		WebElement enableAudioButtonElement = driver.findElement(By.xpath("//button[@class='light-grey-style animated jp-unmute']"));
		enableAudioButtonElement.click();
		
		String enableAudioButtonStyle = enableAudioButtonElement.getAttribute("style");
		//System.out.println(enableAudioButtonStyle);
		assertTrue(enableAudioButtonStyle.equals("display: none;"));
		
		driver.quit();
	}

}
