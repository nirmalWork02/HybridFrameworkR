package testfile;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMaven {
	
	public WebDriver q;
	String driverPath = "G:\\selenium\\02.Selenium Driver\\geckodriver-v0.19.1-win64\\geckodriver.exe";
	String expected ="Google";
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver",driverPath);
		q= new FirefoxDriver();
	}
	@Test
	public void verify() {
		q.get("https://www.google.co.in/");
		String e=q.getTitle();
		System.out.println(e);
		Assert.assertEquals(expected,e);
	}
	@AfterTest
	public void quit() {
		q.close();
	}

}
