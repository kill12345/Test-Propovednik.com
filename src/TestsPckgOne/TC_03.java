package TestsPckgOne;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.AudioPlayer;
import base.BaseClass;


public class TC_03  extends BaseClass {

	@Test
	public   void  Test_3_AudioPlayer() throws InterruptedException, IOException{

		// System.setProperty("webdriver.gecko.driver",
		// "./browsers/geckodriver.exe"); // read about absolute and relative
		// path
		
		WebDriver driver = getDriverInstance();
		
	    navigateToMainPage(driver);
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		pause(1);
		
		audioPlayer.clickPreviousTrackButton(driver);
		audioPlayer.clickNextTrackButton(driver);
		audioPlayer.clickPauseButton(driver);
		audioPlayer.getCurrectlyPlayingTrackName(driver);
		audioPlayer.clickRepeatButton(driver);
		
		assertTrue(audioPlayer.isPlayButtonPresent(driver));
		assertTrue(audioPlayer.isPauseButtonPresent(driver));
		audioPlayer.isEnableVolumeButtonShown(driver);
		assertTrue(audioPlayer.isDisableVolumeButtonShown(driver));
		assertTrue(audioPlayer.isRepeatButtonEnabled(driver));
		

	}
		
}
