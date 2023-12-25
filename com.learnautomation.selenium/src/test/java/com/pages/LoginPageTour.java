package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//Page Factory. This is used for Locating all the web elements in the page 

public class LoginPageTour {
	
	WebDriver driver;
	//Constructor 
	public LoginPageTour(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement userN;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement passW;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement signIn;
	
	//To Pass the Username and Password
	public void LoginTour(String uid, String pas) {
		userN.sendKeys(uid);
		passW.sendKeys(pas);
		signIn.click();
	}
	

}
