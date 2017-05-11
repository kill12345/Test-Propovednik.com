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
		AudioPlayer audioPlayer = new AudioPlayer();
		library.clickListItem_ByName(driver, "Музыка");
		pause(1);
		
		assertTrue(audioPlayer.VerifyYouAreInCorrectFolder(driver));
		library.clickAddFolderToPlaylistButton(driver, "The Crossroads (2011)");
		pause(1);
		audioPlayer.clickPlayButton(driver);
		audioPlayer.clickNextTrackButton(driver);
		audioPlayer.clickNextTrackButton(driver);
		audioPlayer.clickNextTrackButton(driver);
		
		BaseClass.Currently_playing(driver);
		pause(1);
		audioPlayer.clickPreviousTrackButton(driver);
		BaseClass.Currently_playing(driver);
		pause(1);
		audioPlayer.clickPauseButton(driver);
		pause(1);
		assertTrue(audioPlayer.isPauseButtonPresent(driver));
		pause(1);
		//audioPlayer.clickPlayButton(driver);
		System.out.println("Currently playing: " + audioPlayer.getCurrectlyPlayingTrackName(driver));
		pause(1);
		assertTrue(audioPlayer.getCurrectlyPlayingTrackName(driver).equals("02 Finding Happiness - Music Studio IUCECB California, USA - The Crossroads"));
	}
}
