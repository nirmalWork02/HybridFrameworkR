package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MagentoHomePage {
	
	static WebDriver w;
	
	@FindBy(how=How.NAME,using="Mobile") 
	WebElement Mobile;

}
