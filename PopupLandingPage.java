package frameworkMoreOption;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import frameworkConfig.ObjectStorage;

public class PopupLandingPage extends HotelHomePage{
	public WebDriver driver;
	public String pickStr;
	
	public PopupLandingPage(WebDriver driver) throws Exception{
		super(driver);
	}
	
	@FindBy(xpath=ObjectStorage.locationList)
	public List<WebElement> locationList;
	public void selectLocation(String pickStr){
		for (WebElement location: locationList){
			if (location.getText().contains(pickStr)){
				location.click();
				break;
			}
		}
	}
	
	@FindBy(xpath=ObjectStorage.checkInDates)
	public List<WebElement> checkInDates;
	public void selectCheckIn(String pickStr) throws Exception{
		for(WebElement checkInDate: checkInDates){
			if(checkInDate.getText().equals(pickStr)){
				checkInDate.click();
				break;
			}
		}
	}
	
	@FindBy(xpath=ObjectStorage.checkOutDates)
	public List<WebElement> checkOutDates;
	public void selectCheckOut(String pickStr) throws Exception{
		for(WebElement checkOutDate: checkOutDates){
			if(checkOutDate.getText().equals(pickStr)){
				checkOutDate.click();
				break;
			}
		}
	}
	// Rooms.
	@FindBy(xpath=ObjectStorage.clickMoreOption)
	public WebElement clickMoreOption;
	public void selectMoreOption(String pickStr){
		Select moreOptions=new Select(clickMoreOption);
		List<WebElement> objMoreOption=moreOptions.getOptions();
		for(WebElement eleObj: objMoreOption){
			String eleObj1=eleObj.getText();
			if(eleObj1.contains(pickStr)){
				eleObj.sendKeys(eleObj1);
				break;
			}
		}
		moreOptions.getFirstSelectedOption().click();
	}
	@FindBy(xpath=ObjectStorage.pickChildren)
	public WebElement pickChildren;
	public void selectChildren(String pickStr){
		Select selectChild=new Select(pickChildren);
		List<WebElement> clickMoreOptions=selectChild.getOptions();
		for(WebElement option: clickMoreOptions){
			String objOption=option.getText();
			if (objOption.contains(pickStr)){
				option.sendKeys(objOption);
				break;
			}
		}
		selectChild.getFirstSelectedOption().click();
	}
	@FindBy(xpath=ObjectStorage.listChild1Age)
	public List<WebElement> listChild1Age;
	public void selectChild1Age(String pickStr){
		for(WebElement child1Age: listChild1Age){
			String objChild1Age=child1Age.getAttribute("innerHTML");
			if (objChild1Age.contentEquals(pickStr)){
				child1Age.sendKeys(objChild1Age);
				break;
			}
			
		}
	}
	@FindBy(xpath=ObjectStorage.listChild2Age)
	public List<WebElement> listChild2Age;
	public void selectChild2Age(String pickStr){
		for(WebElement child2Age: listChild2Age){
			String objChild2Age=child2Age.getAttribute("innerHTML");
			if (objChild2Age.contentEquals(pickStr)){
				child2Age.sendKeys(objChild2Age);
				break;
			}
			
		}
	}
	
}
