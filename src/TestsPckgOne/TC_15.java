package TestsPckgOne;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.AudioPlayer;
import base.BaseClass;
import base.Library;
import base.TopMenuUtility;

public class TC_15 extends BaseClass{
	
	@Test
	public void f() throws InterruptedException {
		WebDriver driver = getDriverInstance();
		
		navigateToMainPage(driver);
		
		pause(1);
		
		TopMenuUtility.clickMenuItemByLinkText(driver, "Медиатека");
		
		pause(1);
		
		Library library = new Library();
		
		library.clickListItem_ByName(driver, "Музыка");
		
		pause(1);
		
		// TODO: verify you are in correct folder after above click
		
		library.clickAddFolderToPlaylistButton(driver, "The Crossroads (2011)");
		
		pause(1);
		
		// TODO: verify tracks added to playlist
		
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.clickPlayButton(driver);
		
		audioPlayer.clickNextTrackButton(driver);
		audioPlayer.clickNextTrackButton(driver);
		audioPlayer.clickNextTrackButton(driver);
		
		// TODO: verify item number 4 is active in the playlist
		
		audioPlayer.clickPreviousTrackButton(driver);
		
		// TODO: verify item number 3 is active in the playlist
		
		audioPlayer.clickPauseButton(driver);
		
		// TODO: verify isPauseButtonPresent() return true
		
		audioPlayer.clickPlayButton(driver);
		
		System.out.println("Currently playing: " + audioPlayer.getCurrectlyPlayingTrackName(driver));
		assertTrue(audioPlayer.getCurrectlyPlayingTrackName(driver).equals("03 How Can You Not Know? - Music Studio IUCECB California, USA - The Crossroads"));
	}
}
