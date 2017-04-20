package frameworkMoreOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver=null;
	public WebDriver getDriver(){
		/*System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();*/
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		driver=new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();*/
		return driver;
	}
	

}
