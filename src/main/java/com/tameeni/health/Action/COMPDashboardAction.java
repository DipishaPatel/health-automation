package com.tameeni.health.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.tameeni.health.pages.COMPDashboardPage;
import com.tameeni.health.pages.COMPHomePage;

public class COMPDashboardAction extends COMPDashboardPage {

	public COMPDashboardAction(WebDriver driver) {
		super(driver);
	}
	public void clickpurchaseNewPolicy() 
    {
		
		COMPDashboardAction.PurchaseNewpolicy.click();
    }
	public void clickpolicytype() 
    {
		COMPDashboardAction.insurancetype.click();;
    }
	

}
