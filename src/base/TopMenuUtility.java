package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuUtility {

	public static void clickMenuItemByLinkText(WebDriver driver, String linkText){
		driver.findElement(By.xpath("//a[contains(text(), '" + linkText + "')]")).click();
	}
	
}
