package testfile;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TestEcomerce{
	public WebDriver w;
	String expected1 = "THIS IS DEMO SITE FOR1", expected2="Mobile";
	public StringBuffer sb = new StringBuffer();
	

	
  @BeforeTest
  public void openBrowser() {
	  System.setProperty("webdriver.gecko.driver",Utilities.driverPath);
	  w= new FirefoxDriver();
	  
 }
  @Test(priority=0)
  public void getLink() {
	  w.get(Utilities.baseUrl);
	  }
  @Test(priority=1)
  public void verifyTitle() {
	  String T1=w.findElement(By.cssSelector("h2")).getText();
	  System.out.println("output-"+T1+"-");
	 try
	 {
	  Assert.assertEquals(expected1, T1);
	 }
	 catch(Error e) {
		  sb.append(e.toString());
	  }
  }
  @Test(priority=2,dependsOnMethods="verifyTitle")
  public void clickMobile(){
	  w.findElement(By.xpath("//a[@class='level0 ']")).click();
	  String T2= w.getTitle();
	  Assert.assertEquals(expected2, T2);
	  
  }
  @Test(priority=3,dependsOnMethods="clickMobile")
  public void sortByName() {
	 Select sort= new Select(w.findElement(By.xpath("//*[contains(@title,'Sort By')]")));
	 sort.selectByVisibleText("Name");
	 File Screen=((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);
	 try {
		Files.copy(Screen, new File("G:\\selenium\\06.Example\\ScreenShot\\Ss1.jpeg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  //Day 2 Scenario
  
  @Test(priority=4,dependsOnMethods="sortByName")
  public void comparePrice() {
	  String P1= w.findElement(By.xpath("//*[contains(@id,'product-price-1')]")).getText();
	  System.out.println(P1);
	  WebElement SonyXperia=w.findElement(By.xpath("//*[contains(@title,'Xperia')]"));
	  SonyXperia.click();
	  String P2=w.findElement(By.xpath("//*[contains(@id,'product-price-1')]")).getText();
	  System.out.println(P2);
	  try {
	  Assert.assertEquals(P1,P2);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
  //Day3
  @Test(priority=5)
  public void errorVerification() {
	  w.findElement(By.className("add-to-cart-buttons")).click();
	  w.findElement(By.xpath("//input[contains(@class,'input-text qty')]")).sendKeys("1000");
	  w.findElement(By.xpath("//button[contains(@class,'button btn-update')]")).click();
	  WebElement errorMsg= w.findElement(By.xpath("//li[contains(@class,'error-msg')]"));
	  System.out.println(errorMsg.getText());
  }
  //Day4 
  @Test(priority=6)
  public void comparison() {
	  w.get("http://live.guru99.com/");
	  
  }
/*@AfterTest
  public void close() {
	  w.close();
  }*/
}
