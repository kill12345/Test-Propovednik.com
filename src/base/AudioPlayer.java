package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AudioPlayer {

	public void isPlayButtonPresent(){
		// TODO:
	}
	
	public void isPauseButtonPresent(){
		// TODO:
	}

	public void clickPlayButton(WebDriver driver){
		WebElement playButton = driver.findElement(By.xpath("//button[@class='jp-play light-grey-style animated']"));
		playButton.click();
	}
	
	public void clickPreviousTrackButton(WebDriver driver) {
		WebElement TrackButton = driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[3]/button[1]"));
		TrackButton.click();
	}
	
	public void clickNextTrackButton(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[3]/button[4]")).click();
	}
		
	public void clickPauseButton(WebDriver driver){
		WebElement enablePauseButton = driver.findElement(By.xpath("//button[@class='jp-pause light-grey-style animated']"));
		enablePauseButton.click();
	}
	
	public String getCurrectlyPlayingTrackName(WebDriver driver) {
		WebElement currentlyPlayingTrackElement = driver.findElement(By.xpath("//div[@id='progressSlider']/div[1]/div[2]"));
		String currentlyPlayingTrackName = currentlyPlayingTrackElement.getText().trim();
		return currentlyPlayingTrackName;
	}
	
	public void clickDisableVolumeButton(WebDriver driver) {
		WebElement DisableVolumeButton = driver.findElement(By.xpath("//button[@class='light-grey-style animated jp-mute']"));
		DisableVolumeButton.click();
	}
	
	public void isDisableVolumeButtonShown(){
		
	}
	
	public void isEnableVolumeButtonShown(){
		
	}
	
	public void clickRepeatButton(WebDriver driver){
		WebElement RepeatButton = driver.findElement(By.xpath("//button[@class = 'jp-repeat-off light-grey-style animated']"));
		RepeatButton.click();
	}
	
	public void isRepeatButtonEnabled(){
		// TODO:
	}
}
