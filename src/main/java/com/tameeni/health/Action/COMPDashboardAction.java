package com.tameeni.health.Action;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;


import com.tameeni.health.pages.COMPDashboardPage;


public class COMPDashboardAction extends COMPDashboardPage {

	public COMPDashboardAction(WebDriver driver) {
		super(driver);
	}
	public void clickpurchaseNewPolicy() 
    {
		try
		{
		
		COMPDashboardAction.PurchaseNewpolicy.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
	public void clickpolicytype() 
    {
		try
		{
		COMPDashboardAction.insurancetype.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
	

}
