package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllLinks {
	
	public WebDriver w ;
	String driverPath ="G:\\selenium\\02.Selenium Driver\\geckodriver-v0.19.1-win64\\geckodriver.exe";
	String baseUrl = "http://demo.guru99.com/test/newtours/";
	@Test
	public void openBroW() {
		String underConsTitle = "Under Construction: Mercury Tours";
	System.setProperty("webdriver.gecko.driver",driverPath);
	w= new FirefoxDriver();
	w.get(baseUrl);
	List<WebElement> allLinksElement =w.findElements(By.tagName("a"));
	String[]size = new String[allLinksElement.size()];
	System.out.println(size);
	int i=0;
	for(WebElement s:allLinksElement) {
	size[i]=s.getText();
	i++;
	}
	//test each link		
	for (String t : size ) {							
	w.findElement(By.linkText(t)).click();					
	if (w.getTitle().equals(underConsTitle)) {							
        System.out.println("\"" + t + "\""								
                + " is under construction.");			
    } else {			
        System.out.println("\"" + t + "\""								
                + " is working.");			
    }		

	
	
	}
}
}
