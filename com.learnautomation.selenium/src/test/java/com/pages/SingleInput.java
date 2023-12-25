package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleInput {
	
	WebDriver driver;
	//constructor
	public SingleInput(WebDriver driver) {
		this.driver=driver;
		
	}
	//Locator
	@FindBy(how=How.XPATH,using="//@input[@id='user-message']")
	WebElement Message;
	
	public void SendInput(String mess) {
		Message.sendKeys(mess);
		
	}

}
