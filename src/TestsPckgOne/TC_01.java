package TestsPckgOne;

import base.BaseClass;
import base.Library;
import base.TopMenuUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class TC_01 extends BaseClass {

	@Test
	
	public void Test_1_Verify_Items_And_Its_Icons() throws InterruptedException, IOException {
		
	    String blagovestie = "Благовестие";
	    String otchet = "1998 Отчет благовестников";
		
		WebDriver driver = getDriverInstance();

	    navigateToMainPage(driver);
		
		TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");
		
		pause(1); // TODO: Get rid of this shit
		
		Library library = new Library();
		
		assertTrue(library.isItemPresent(driver, blagovestie));
		
		assertTrue(library.doesItemHaveFolderIcon(driver, blagovestie));
		
		library.clickListItem_ByName(driver, blagovestie);
		
		pause(1);
		
		assertTrue(library.isItemPresent(driver, otchet));
		
		assertTrue(library.doesItemHaveAlbumIcon(driver, otchet));
		
		driverClose(driver);
		
	}
	
}
		

	
				 
		 
		 


