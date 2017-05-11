package base;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class AudioPlayer {

	
  public boolean isPlayButtonPresent(WebDriver driver ){
          boolean PlayButtonPresent;
          
	 try{
		     driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[3]/button[2]"));
		     PlayButtonPresent = true;
		     System.out.println("Play botton is prezent");
		     
   }catch (NoSuchElementException e) {
			 PlayButtonPresent = false;
			 }
		  return PlayButtonPresent;
   }
	
 public boolean isPauseButtonPresent(WebDriver driver){
	      boolean PauseButtonPresent;
	      
	 try{
		   driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[3]/button[3]"));
		   PauseButtonPresent =true;
		   System.out.println("Pause Button is Present");
		   
   }catch (NoSuchElementException e){
		return PauseButtonPresent= false;  	
		}
	return PauseButtonPresent;
	
    }
		
public void clickPlayButton(WebDriver driver){
		WebElement playButton = driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[3]/button[2]"));
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
		WebElement enablePauseButton = driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[3]/button[1]"));
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
	
	public boolean isDisableVolumeButtonShown(WebDriver driver){
		 boolean DisableVolumeButton = driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[1]/button[1]")).isEnabled();
		  System.out.print(DisableVolumeButton);
		  return DisableVolumeButton;
		
	}
		    
	public boolean isEnableVolumeButtonShown(WebDriver driver){
		WebElement isEnableleVolumeButton  = driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[1]/button[1]"));
	if  (isEnableleVolumeButton.isEnabled()){
			System.out.println("Button is  enabled");
			return true;
	}else{ 
		 return false;
		}
	}
	
  public void clickRepeatButton(WebDriver driver){
		WebElement RepeatButton = driver.findElement(By.xpath("//button[@class = 'jp-repeat-off light-grey-style animated']"));
		RepeatButton.click();
	}
	
  public boolean isRepeatButtonEnabled(WebDriver driver){
		
		WebElement isRepeatButtonEnabled =driver.findElement(By.xpath("//*[@id='jp_container_1']/div/div[1]/div[5]/button[2]"));
		String ButtonEnabled = isRepeatButtonEnabled.getAttribute("style");
		if (ButtonEnabled.equals("display: none;")){
			System.out.println("RepeatButtonEnabled");
			return true;
		}else{
			return false;
		}
	}

   public boolean VerifyYouAreInCorrectFolder(WebDriver driver){
		   if (driver.findElement(By.xpath("//*[@id='track-list']/div[2]/ul/li[9]/div[1]/a")).isDisplayed()){
		         return true;
		} else{
			     return false;
			}
        }
  }

	
			
			
		


			
		 
		 
				
		 
		
			
				
			
			
			
	
		
	
 

		

