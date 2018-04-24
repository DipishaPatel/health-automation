package com.tameeni.health.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.tameeni.health.pages.COMPHomePage;

public class COMPHomeAction extends COMPHomePage {
	
    public COMPHomeAction(WebDriver driver) {
		super(driver);
	}

	
    public void clicklanguage() {
    	COMPHomeAction.Language.click();
    }
    public void clickloginlink() 
    {
    	COMPHomeAction.LoginLink.click();
    }
    public void enterusername(String UserName) 
    {
    	COMPHomeAction.txtEmail.sendKeys(UserName);
    }
    public void enterpassword(String UserPassword) 
    {
    	COMPHomeAction.txtpassword.sendKeys(UserPassword);
    }
    public void clickloginbutton() 
    {
    	COMPHomeAction.btnLogin.click();
    }
	/*public boolean isInitialized() {
		return firstNameTxtBox.isDisplayed();
	}*/
    
}
