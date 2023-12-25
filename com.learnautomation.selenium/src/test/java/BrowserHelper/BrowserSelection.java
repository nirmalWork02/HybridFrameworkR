package BrowserHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import testfile.Utilities;


//Browser Factory. This is used for selecting the browser

public class BrowserSelection {
	
	public static  WebDriver driver;
	
	public static WebDriver StartBrowserName(String BName, String url) {
		if(BName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Utilities.driverPath);
			driver= new FirefoxDriver();
				
		}
		else if(BName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
	}

}
