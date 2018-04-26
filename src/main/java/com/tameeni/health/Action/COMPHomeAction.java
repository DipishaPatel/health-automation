package com.tameeni.health.Action;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;


import com.tameeni.health.pages.COMPHomePage;

public class COMPHomeAction extends COMPHomePage {
	
    public COMPHomeAction(WebDriver driver) {
		super(driver);
	}

	
    public void clicklanguage() 
    {
    	try
		{
		
    	COMPHomeAction.Language.click();
		}
    	catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
    public void clickloginlink() 
    {
    	try
		{
    	COMPHomeAction.LoginLink.click();
		}
    	catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
    public void enterusername(String UserName) 
    {
    	try
		{
    	COMPHomeAction.txtEmail.sendKeys(UserName);
		}
    	catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
    public void enterpassword(String UserPassword) 
    {
    	try
		{
    	COMPHomeAction.txtpassword.sendKeys(UserPassword);
		}
    	catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
    public void clickloginbutton() 
    {
    	try
		{
    	COMPHomeAction.btnLogin.click();
		}
    	catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }

}
