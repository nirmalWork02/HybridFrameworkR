package testfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.SingleInput;

import BrowserHelper.BrowserSelection;

public class TestTourPage {
	
	@Test
	public void startBrowser() {
		WebDriver driver= BrowserSelection.StartBrowserName("firefox", "https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		SingleInput enterInput=PageFactory.initElements(driver, SingleInput.class);
		enterInput.SendInput("Hai");
	}
	
	

}
