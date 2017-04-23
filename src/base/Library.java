package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Library {

	// TODO: get rid of for loops that are repeated
	
	public void clickListItem_ByName(WebDriver driver, String itemName){
		System.out.println("CALLED: clickListItem_ByName()");
		System.out.println("itemName: " + itemName);
		
		List<WebElement> itemsList = getItems(driver);
		System.out.println("itemsList.size(): " + itemsList.size());
		
		for (int i = 0; i < itemsList.size(); i++) {
			WebElement itemWebElement = itemsList.get(i);
			String currentItemName = itemWebElement.getText();
			System.out.println(currentItemName);
			
			if(currentItemName.equals(itemName)){
				itemWebElement.click();
				break;
			}
		}
	}
	
	private List<WebElement> getItems(WebDriver driver){
		List<WebElement> itemsList = driver.findElements(By.xpath("//div[@class='list']/ul/li/div[1]/a"));
		return itemsList;
	}
	
	public boolean isItemPresent(WebDriver driver, String itemName){
		System.out.println("CALLED: isItemPresent()");
		System.out.println("itemName: " + itemName);
		
		List<WebElement> itemsList = getItems(driver);
		
		boolean found = false;
		for (int i = 0; i < itemsList.size(); i++) {
			WebElement itemWebElement = itemsList.get(i);
			String currentItemName = itemWebElement.getText();
			System.out.println(currentItemName);
			
			if(currentItemName.equals(itemName)){
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	public boolean doesItemHaveFolderIcon(WebDriver driver, String itemName){
		String iconType = getIconType(driver, itemName);
		if(iconType.equals("folder")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean doesItemHaveAlbumIcon(WebDriver driver, String itemName){
		String iconType = getIconType(driver, itemName);
		if(iconType.equals("album")){
			return true;
		}
		else{
			return false;
		}
	}
	
	private String getIconType(WebDriver driver, String itemName){
		System.out.println("CALLED: getIconType()");
		System.out.println("itemName: " + itemName);
		
		List<WebElement> itemsList = getItems(driver);
		
		String iconType = null;
		for (int i = 0; i < itemsList.size(); i++) {
			WebElement itemWebElement = itemsList.get(i);
			String currentItemName = itemWebElement.getText();
			System.out.println(currentItemName);
			
			if(currentItemName.equals(itemName)){
				WebElement imgElement = itemWebElement.findElement(By.tagName("img"));
				String imgSrc = imgElement.getAttribute("src");
				if(imgSrc.contains("album")){
					iconType = "album";
				}
				if(imgSrc.contains("folder")){
					iconType = "folder";
				}
				break;
			}
		}
		
		return iconType;
	}
	
	public boolean isDownloadIconPresent_ByItemName(WebDriver driver, String itemName){
		System.out.println("CALLED: isDownloadIconPresent_ByItemName()");
		System.out.println("itemName: " + itemName);
		
		List<WebElement> itemsList = getItems(driver);
		
		boolean isPresent = false;
		for (int i = 0; i < itemsList.size(); i++) {
			WebElement itemWebElement = itemsList.get(i);
			String currentItemName = itemWebElement.getText();
			System.out.println(currentItemName);
			
			if(currentItemName.equals(itemName)){
				System.out.println(itemName + " is found! :)");
				WebElement itemPrecedingSibling = itemWebElement.findElement(By.xpath(".//parent::div/parent::li/div[2]"));
				
				// System.out.println(itemWebElement.findElement(By.xpath(".//parent::div/parent::li/div[2]")).getText());
				// System.out.println(itemPrecedingSibling.getAttribute("class"));
				
				try {
					itemPrecedingSibling.findElement(By.xpath(".//a/img"));
					isPresent = true;
				} catch (NoSuchElementException e) {
					
				}
				
				break;
			}
		}
		
		return isPresent;
	}
}
