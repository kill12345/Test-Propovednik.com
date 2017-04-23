package TestsPckgOne;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import base.Library;
import base.TopMenuUtility;

public class TC_02 extends BaseClass{

	@Test
	public void Test_2_Verify_Download_Button() throws InterruptedException, IOException {
		
		WebDriver driver = getDriverInstance();
		
		navigateToMainPage(driver);
		
		pause(1);
		
		TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");
		
		pause(1);
		
		Library library = new Library();
		
		assertTrue(library.isDownloadIconPresent_ByItemName(driver, "Музыка"));
		
		assertFalse(library.isDownloadIconPresent_ByItemName(driver, "Литература"));
		
		driverClose(driver);
	}
	
}
