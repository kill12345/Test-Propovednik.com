package TestsPckgOne;



import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	   BaseClass.add_traks_to_playlist(driver); // ???????????????????????????????????????????
	   pause(1);
	   
	   List<String> allTracks = playlist.getAllTracksFromPlaylist(driver);
	   
	   List<String> allTracksToVerify = new ArrayList<String>();
	   allTracksToVerify.add("01 Wonderful Grace of Jesus - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("02 Finding Happiness - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("03 How Can You Not Know? - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("04 Come Unto Him, My Weary Friend - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("05 What a Friend We Have in Jesus! - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("06 Not My Will, But Yours Be Done - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("07 God Is Glorious And Mighty - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("08 Just One More Hill to Climb - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("09 If You Know Jesus - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("10 I Long for My Savior - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("11 Repentance - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("12 Your Choice - Music Studio IUCECB California, USA - The Crossroads");
	   allTracksToVerify.add("13 Love Lifted Me - Music Studio IUCECB California, USA - The Crossroads");
	   
	   assertTrue(allTracks.containsAll(allTracksToVerify), "Was not able to verify proper tracks are in the playlist");
	   playlist.getCurrentlyActiveTrackName(driver);
	   playlist.getTrackCount(driver);
	   playlist.getCurrentlyActiveTrackIndex(driver);
	   playlist.clickListItem_ByName(driver, itemName);
	   playlist.clickShareButton(driver);
	   playlist.clickResetButton(driver);
	   
		
	   
	}
	
	@Test
	public void A(){
		System.out.println(reverseString("Artur"));
	
		//List<Integer> numbers = new ArrayList<Integer>();
		//List<String> names = new ArrayList<String>();
	}
	
	public String reverseString(String str){
		String output = "";
		for(int i = 0; i < str.length(); i++){
			output = output + str.charAt(str.length()-i-1);
		}
		return output;
	}
	
}
