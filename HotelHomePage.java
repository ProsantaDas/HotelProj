package frameworkMoreOption;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkConfig.ObjectStorage;

public class HotelHomePage extends Base{
	public WebDriver driver;
	public String pickStr;
	public HotelHomePage(WebDriver driver) throws Exception{
		this.driver=driver;
		
	}
	@FindBy(xpath=ObjectStorage.hotelSearch)
	public WebElement hotelSearch;
	public PopupLandingPage pickPlace(String myString){
		hotelSearch.sendKeys(myString);
		return PageFactory.initElements(driver, PopupLandingPage.class);
	}
	@FindBy(xpath=ObjectStorage.checkIn)
	public WebElement checkIn;
	public PopupLandingPage clickCheckIn(){
		checkIn.click();
		return PageFactory.initElements(driver, PopupLandingPage.class);
	}
	@FindBy(xpath=ObjectStorage.checkOut)
	public WebElement checkOut;
	public PopupLandingPage clickCheckOut(){
		checkOut.click();
		return PageFactory.initElements(driver, PopupLandingPage.class);
	}
	@FindBy(xpath=ObjectStorage.popupWindow)
	public WebElement popupWindow;
	public void clickOnPopup(){
		popupWindow.click();
	}
	@FindBy(xpath=ObjectStorage.rooms)
	public WebElement rooms;
	public PopupLandingPage clickOnRooms(){
		rooms.click();
		return PageFactory.initElements(driver, PopupLandingPage.class);
	}
	@FindBy(xpath=ObjectStorage.children)
	public WebElement children;
	public PopupLandingPage clickOnChildren(){
		children.click();
		return PageFactory.initElements(driver, PopupLandingPage.class);
		
	}
	// Child1.
	@FindBy(xpath=ObjectStorage.child1)
	public WebElement child1;
	public PopupLandingPage clickOnChild1(){
		child1.click();
		return PageFactory.initElements(driver, PopupLandingPage.class);
	}
	// child2
	@FindBy(xpath=ObjectStorage.child2)
	public WebElement child2;
	public PopupLandingPage clickOnChild2(){
		child2.click();
		return PageFactory.initElements(driver, PopupLandingPage.class);
	}
	// Search.
	@FindBy(xpath=ObjectStorage.search)
	public WebElement search;
	public void clickOnSearch(){
		search.click();
	}
			
}
