package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;

public class RegisterFormPage {
	
	//Locators for Register form
	
	WebDriver driver;
	
	public void RegisterFormPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locating Elements
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement firstN;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement lastN;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	WebElement phoneNum;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	WebElement address;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	WebElement city;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	WebElement state;
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	WebElement postalCode;
	
	@FindBy(how=How.XPATH,using="//input[@name='country']")
	WebElement country;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	WebElement usrName;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement pasWrd;
	
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	WebElement confrmPassWrd;
	
	@FindBy(how=How.XPATH,using="//input[@name='submit']")
	WebElement submit;
	
	@DataProvider(name="reg")
	public Object[][]getDataFromDataProvider(){
		return new Object[][] {
			
		};
		
	}

}
