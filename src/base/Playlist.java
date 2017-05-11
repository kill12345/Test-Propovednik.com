package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Playlist {

	public  String getAllTracksFromPlaylist(WebDriver driver){
		
		WebElement getAllTracksFromPlaylist = driver.findElement(By.xpath("//*[@id='playList']"));
		String getAllTracks = getAllTracksFromPlaylist.getText().trim();
		System.out.println(getAllTracks);
		return getAllTracks;
	}
	
	public void clickShareButton(WebDriver driver){
		WebElement clickShareButton =driver.findElement(By.xpath("//*[@id='titles']/button[2]"));
		clickShareButton.click();
	}
	
	public void clickResetButton(WebDriver driver){
			WebElement clickresetButton = driver.findElement(By.xpath("//*[@id='titles']/button[1]"));
			clickresetButton.click();
	}
	
	
	public  String getCurrentlyActiveTrackName(WebDriver driver){
		WebElement CurrentlyActiveTrackName = driver.findElement(By.xpath("//*[@id='progressSlider']/div[1]"));
		String ActiveTrackName = CurrentlyActiveTrackName.getText().trim();
		System.out.println(ActiveTrackName);
		return ActiveTrackName; 
		
	}
	
	public String getCurrentlyActiveTrackIndex(WebDriver driver){
		WebElement CurrentlyTrackIndex = driver.findElement(By.xpath("//*[@id='progressSlider']/div[1]"));
		String getCurrentlyActive = CurrentlyTrackIndex.getText();
		System.out.println(getCurrentlyActive);
		return getCurrentlyActive;
		
	}
	
	public  List<WebElement> getTrackCount(WebDriver driver){
		List<WebElement>TrackCountList = driver.findElements(By.xpath("//*[@id='titles']"));
		return TrackCountList;
		
	}
	
		public void clickListItem_ByName(WebDriver driver, String itemName){
			System.out.println("CALLED: clickListItem_ByName()");
			System.out.println("itemName: " + itemName);
			
			List<WebElement> itemList = getItems(driver);
			System.out.println("itemsList.size(): " + itemList.size());
			
			for(int i = 0; i<itemList.size(); i++);{
			int i = 0;
			WebElement ListName = itemList.get(i);
			String currentItemName =ListName.getText();
			System.out.println(currentItemName);
			
			if (currentItemName.equals(itemName)){
				ListName.click();
				
			}
		}
	}

	List<WebElement> getItems(WebDriver driver){
		List<WebElement> itemsList = driver.findElements(By.xpath("//*[@id='playlist-ul']"));
		return itemsList;
	}
}
		
		
		

	

