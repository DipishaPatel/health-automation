package com.tameeni.health.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class COMPDashboardPage extends PageObject {

	public COMPDashboardPage(WebDriver driver) 
	{
		super(driver);
	}
	 @FindBy(className = "comprehensive-link") 
	    public static WebElement insurancetype;
	 
	 @FindBy(xpath = "//*[@id=\"choose-insurance-type-dropdown\"]") 
	    public static WebElement PurchaseNewpolicy;
	 
		
	/* @FindBy(css = "#choose-insurance-type-dropdown li:nth-of-type(2)")
		public static WebElement LoginLink;*/
	    

}
