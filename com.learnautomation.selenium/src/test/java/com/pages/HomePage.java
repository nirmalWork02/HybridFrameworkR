package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver d;
	
	By userName = By.name("uid");
	By passWord = By.name("password");
	
	public HomePage(WebDriver d) {
		this.d=d;
		}
	
	public void setUserName(String struser) {
		d.findElement(userName).sendKeys("struser");
	}
	public void setPassWord(String pass) {
		d.findElement(passWord).sendKeys("pass");	
	}
	

}
