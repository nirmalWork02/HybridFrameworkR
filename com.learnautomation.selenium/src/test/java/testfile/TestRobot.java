package testfile;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRobot {
	
	public WebDriver w;
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", Utilities.driverPath);
		w= new FirefoxDriver();
	}
	
	@Test
	public void openUrl() throws AWTException {
		/*w.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		w.findElement(By.xpath("//a[@href=contains(text(),'animatedcolors.xlsm')]")).click();*/
		Runtime run=Runtime.getRuntime();
		try {
			run.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("executed..");
		}
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_B);
		
		robot.keyRelease(KeyEvent.VK_B);
	}

}
