package com.tameeni.health.Action;

import java.util.Iterator;
import java.util.List;


import org.eclipse.jetty.util.log.Log;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;




import com.tameeni.health.pages.COMPAddPolicyMainFlowPage;


public class COMPAddPolicyMainFlowAction extends COMPAddPolicyMainFlowPage 
{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		public COMPAddPolicyMainFlowAction(WebDriver driver) 
		{
			super(driver);
		}
			public void clickselectPolicyholder() 
			{
				try
				{
					COMPAddPolicyMainFlowAction.btnSelectPolicyholder.get(1).click();
				}
				catch(Exception e)
				{
					Log.getLogger("\"Select Policy holder element is not found.") ;
					
				}
			}	
		
		
	public void clickselectAddress() 
    {
		try
		{
		jse.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.SelectAddress);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
	public void clickselectVehile() 
    {
		try
		{
			COMPAddPolicyMainFlowAction.btnSelectVehicle.get(1).click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	    
    }
	public void selectVehicle()
	{
		try
		{
			Select dropdown = new Select(VehicleID);
			dropdown.selectByIndex(1);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}

	}
		
	public void selectRegion()
	{
		try
		{
			Select dropdown = new Select(Region);
			dropdown.selectByIndex(1);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
      
	}
	public void selectcity()
	{
		try
		{
			
			Select dropdown = new Select(City);
			dropdown.selectByIndex(1);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
       
	}
	public void SelectOccupation()
	{
		try
		{
			Select dropdown = new Select(SelectOccupation);
			dropdown.selectByIndex(1);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	public void SelectageDriver() throws InterruptedException 
	{
		try
		{
			Select dropdown = new Select(Selectage);
				dropdown.selectByIndex(1);
		        dropdown.getOptions().get(1).click();
		        COMPAddPolicyMainFlowAction.SelectAdditionPremium.click();
		        Thread.sleep(1000);
		        COMPAddPolicyMainFlowAction.SelectAdditionPremium.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
		
	}
	public void ClickSelectDeclaration()
	{
		try
		{
			COMPAddPolicyMainFlowAction.SelectDeclaration.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
		
	}
	public void ClickNextotherDetail()
	{
		try
		{
		 jse.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.NextOtherDetail);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	
	public void ClickDatePicker()
	{
		try
		{
			COMPAddPolicyMainFlowAction.DatePicker.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	public void SelectDate()
	
	{
		try
		{
			jse.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.selectdate);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	public void EnterEstimateValue(String StrValue)
	
	{
		try
		{
			EstimateValue.sendKeys(StrValue);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	public void ClickGetQuoteNow()
	
	{
		try
		{
			jse.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.GetQuote);
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	
	}
	@SuppressWarnings("unused")
	public void ClickFeature()
	{
		try
		{
		 List<WebElement> row = COMPAddPolicyMainFlowPage.Feature1;
			for(int i = 0; i < row.size(); i++) 
			{
			     WebElement checkbox = row.get(i);
			     checkbox.click();
			     break;
			}
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}

	}
	
	public void selectDeductible()
	{
		try
		{
		
		List<WebElement> row = COMPAddPolicyMainFlowPage.Deductible;
		 Iterator<WebElement> iter = row.iterator();
		 while (iter.hasNext()) 
		 {

				WebElement item = iter.next();
				jse.executeScript("scroll(1150,1101)");			
				item.click();
				 break;
		 }
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	
	
	@SuppressWarnings("unused")
	public void selectDeductibleAmount()
	{
		try
		{
		List<WebElement> row = COMPAddPolicyMainFlowPage.DeductibleAmount;
			for(int i = 0; i < row.size(); i++) 
			{
			     WebElement checkbox = row.get(i);
			     checkbox.click();
			     break;
			}
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	
	public void clickICSelect() 
    {
		try
		{
		
		List<WebElement> row = COMPAddPolicyMainFlowPage.btnNext;
		Iterator<WebElement> iter = row.iterator();
		 while (iter.hasNext()) 
		 {

				WebElement item = iter.next();
				jse.executeScript("scroll(1150,1101)");
			
				item.click();
				 break;
		 }
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
    }
	public void Purchased()
	
	{
		try
		{
		
		PurchasedConti.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	public void FrontImageClick()
	{
		try
		{
		jse.executeScript("scroll(1150,1101)");
		
		FrontImage.click();
		}
		
		catch(Exception e)
		{
			Log.getLogger("\"Report Category button element is not found.") ;
		}
	}
	public void RearImageClick()
	{
		try
		{
		RearImage.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"RearImage element is not found.") ;
		}
	}
	public void RightImageClick()
	{
		try
		{
		RightImage.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"RearImage element is not found.") ;
		}
	}
	public void LeftImageClick()
	{
		try
		{
		LeftImage.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"RearImage element is not found.") ;
		}
	}
	public void VINImageClick()
	{
		try
		{
		VINImage.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
		
	}
	public void VehicleDeclaration()
	{
		try
		{
		VehicleDeclaration.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VehicleDeclaration element is not found.") ;
		}
	}
	public void personClick()
	{
		try
		{
			person.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
		
	}
	
	public void VehilceDeclareClick()
	{
		try
		{
			jse.executeScript("scroll(1150,1101)");
			ImagesTerms.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
		
	}
	public void EnterIBAN(String StrIban) 
    {
		try
		{
		String value = StrIban;
		List<WebElement> elementsList= COMPAddPolicyMainFlowPage.IBAN;
		for(int i = 0; i < elementsList.size(); ++i) 
		{
		     WebElement checkbox = elementsList.get(i);
		    
		    	 char c = value.charAt(i);
		    	 String string1 = Character.toString(c);
		           checkbox.sendKeys(string1);
		      
		}
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
    }
	public void ImagesTerms()
	{
		try
		{
			
			ImagesTerms.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
	}
	public void Visa()
	{
		try
		{
			VISA.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
		
	}
	public void AcceptTermsPay()
	{
		try
		{
			Actions action = new Actions(driver);
		
			int weight = AcceptTermsPay.getSize().getWidth();
			action.moveToElement(AcceptTermsPay).moveByOffset(weight/2-150, 0).release().click().perform();
			
		}
			     
			
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
		
	}
	public void PayNow()
	{
		try
		{
			PayNow.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
		
	}
}