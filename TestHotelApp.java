package frameworkMoreOption;
import java.io.FileInputStream;
import java.util.Properties;
/* Reference from 'E:\technoSoftProj\TechnoSelectDate\src\technoSelectChild\SelectChild'
 * for this project 'SelectMoreOptions'.
 * Finally, everything done.
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import frameworkConfig.ObjectStorage;

public class TestHotelApp {
		
	@Test
	public void testHotelPage() throws Exception{
		Base b=new Base();
		WebDriver driver=b.getDriver();
		HotelHomePage objHHP=PageFactory.initElements(driver, HotelHomePage.class);
		//PopupLandingPage objPLP=PageFactory.initElements(driver, PopupLandingPage.class);
		// Navigate to web application site.
		// Below code from 'ObjectStorage.java' file.
		driver.get(ObjectStorage.testSite);
		// Deleting all cookies.
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// click on 'popup'.
		//objHHP.clickOnPopup();
		// click on 'Hotel Search' object of 'HotelHomePage'.
		PopupLandingPage objPLP=objHHP.pickPlace("flo");
		// Selecting desired location in 'Hotel Search' object.
		
		objPLP.selectLocation("Tampa");
		// Click on 'Check in' object of 'HotelHomePage'.
		objHHP.clickCheckIn();
		// Selecting desired date in 'Check in' object.
		objPLP.selectCheckIn("26");
		// Click on 'check out'.
		objHHP.clickCheckOut();
		// Select date in 'check out'.
		objPLP.selectCheckOut("28");
		// Click on 'Rooms'
		objHHP.clickOnRooms();
		Thread.sleep(2000);
		// Select 'More Options'
		objPLP.selectMoreOption("More options…");
		Thread.sleep(2000);
		// Click on 'Children'
		objHHP.clickOnChildren();
		// Select number of children.
		objPLP.selectChildren("2");
		// click child1.
		objHHP.clickOnChild1();
		// select child1 age.
		objPLP.selectChild1Age("12");
		// click child2.
		objHHP.clickOnChild2();
		// select child2 age.
		objPLP.selectChild2Age("8");
		// click search button.
		objHHP.clickOnSearch();
		
	}

}
