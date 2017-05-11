package TestsPckgOne;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.BaseClass;
import base.Playlist;
import base.TopMenuUtility;



public class TC_16 extends BaseClass {
	
	@Test
	public   void  Test_16_Verify_PlayList() throws InterruptedException, IOException{
	   String itemName ="09 If You Know Jesus - Music Studio IUCECB California, USA - The Crossroads";
       WebDriver driver = getDriverInstance();
	   navigateToMainPage(driver);
	   TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");
	   pause(1);
	   //TopMenuUtility.clickMenuItemByLinkText(driver, "Аудио Библия");
	   Playlist playlist = new Playlist();
	   BaseClass.add_traks_to_playlist(driver);
	   pause(1);
	   playlist.getAllTracksFromPlaylist(driver);
	   playlist.getCurrentlyActiveTrackName(driver);
	   playlist.getTrackCount(driver);
	   playlist.getCurrentlyActiveTrackIndex(driver);
	   playlist.clickListItem_ByName(driver, itemName);
	   playlist.clickShareButton(driver);
	   playlist.clickResetButton(driver);
	   
	   
		
	}
	
}
