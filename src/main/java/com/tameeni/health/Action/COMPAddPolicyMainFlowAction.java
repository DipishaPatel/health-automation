package com.tameeni.health.Action;

import java.util.Iterator;
import java.util.List;


import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
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
		//Iterator<WebElement> iter = COMPAddPolicyMainFlowAction.SelectAddress.iterator();
		COMPAddPolicyMainFlowAction.btnSelectVehicle.get(1).click();
	    
    }
	public void selectVehicle()
	{
		Select dropdown = new Select(VehicleID);
		dropdown.selectByIndex(1);
       // dropdown.getOptions().get(1).click();
	}
		
	public void selectRegion()
	{
		Select dropdown = new Select(Region);
		dropdown.selectByIndex(1);
       // dropdown.getOptions().get(1).click();
	}
	public void selectcity()
	{
		Select dropdown = new Select(City);
		dropdown.selectByIndex(1);
       // dropdown.getOptions().get(1).click();
	}
	public void SelectOccupation()
	{
		Select dropdown = new Select(SelectOccupation);
		dropdown.selectByIndex(1);
       // dropdown.getOptions().get(1).click();
	}
	public void SelectageDriver() throws InterruptedException 
	{
		Select dropdown = new Select(Selectage);
				dropdown.selectByIndex(1);
		        dropdown.getOptions().get(1).click();
		COMPAddPolicyMainFlowAction.SelectAdditionPremium.click();
		Thread.sleep(1000);
		COMPAddPolicyMainFlowAction.SelectAdditionPremium.click();
		
	}
	public void ClickSelectDeclaration()
	{
		COMPAddPolicyMainFlowAction.SelectDeclaration.click();
	}
	public void ClickNextotherDetail()
	{
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.NextOtherDetail);
		//COMPAddPolicyMainFlowAction.NextOtherDetail.click();
	}
	
	public void ClickDatePicker()
	{
	//	JavascriptExecutor jsd = (JavascriptExecutor)driver;
	//	jsd.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.DatePicker);
		COMPAddPolicyMainFlowAction.DatePicker.click();
	}
	public void SelectDate()
	
	{
		jse.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.selectdate);
		//selectdate.click();
	}
	public void EnterEstimateValue(String StrValue)
	
	{
		EstimateValue.sendKeys(StrValue);
	}
	public void ClickGetQuoteNow()
	
	{
		jse.executeScript("arguments[0].click();", COMPAddPolicyMainFlowPage.GetQuote);
	//	GetQuote.click();
	}
	public void ClickFeature()
	{
		 List<WebElement> row = COMPAddPolicyMainFlowPage.Feature1;
		 Iterator<WebElement> iter = row.iterator();
		 while (iter.hasNext()) 
		 {

				WebElement item = iter.next();
				jse.executeScript("arguments[0].click();", item);
				item.click();
				 break;
		 }
		
	//	Select checkbox = new Select(Feature1);
	//	checkbox.selectByIndex(0);
	}
	@SuppressWarnings("unlikely-arg-type")
	public void selectDeductible()
	{
		List<WebElement> row = COMPAddPolicyMainFlowPage.Deductible;
		 Iterator<WebElement> iter = row.iterator();
		 while (iter.hasNext()) 
		 {

				WebElement item = iter.next();
				jse.executeScript("scroll(1150,1101)");
				jse.executeScript("arguments[0].click();", item);
				item.click();
				 break;
		 }
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void selectDeductibleAmount()
	{
		List<WebElement> row = COMPAddPolicyMainFlowPage.DeductibleAmount;
		 Iterator<WebElement> iter = row.iterator();
		 while (iter.hasNext()) 
		 {

				WebElement item = iter.next();
				jse.executeScript("arguments[0].click();", item);
				item.click();
				 break;
		 }
	}
	

	

	@SuppressWarnings("unlikely-arg-type")
	public void clickICSelect() 
    {
		//Iterator<WebElement> iter = COMPAddPolicyMainFlowAction.SelectAddress.iterator();
		//COMPAddPolicyMainFlowAction.btnNext.get(0).click();
		List<WebElement> row = COMPAddPolicyMainFlowPage.btnNext;
		Iterator<WebElement> iter = row.iterator();
		 while (iter.hasNext()) 
		 {

				WebElement item = iter.next();
				jse.executeScript("scroll(1150,1101)");
			//	jse.executeScript("arguments[0].click();", item);
				item.click();
				 break;
		 }
    }
	public void Purchased()
	
	{
		PurchasedConti.click();
	}
	public void FrontImageClick()
	{
		//WebDriverWait wait=new WebDriverWait(driver, 20);
	//	WebElement guru99seleniumlink;
	//	guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fuFront']" )));
		jse.executeScript("scroll(1150,1101)");
		//jse.executeScript("arguments[0].click();", FrontImage);
		FrontImage.click();
	//	Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",VehiclefuFront);
      //  if (!imageLoaded1)
       
		//.click();
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
		RightImage.click();
	}
	public void LeftImageClick()
	{
		LeftImage.click();
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
			ImagesTerms.click();
		}
		catch(Exception e)
		{
			Log.getLogger("\"VINImage element is not found.") ;
		}
		
	}
	public void EnterIBAN(String StrIban) 
    {

		String value = StrIban;
		List<WebElement> elementsList= COMPAddPolicyMainFlowPage.IBAN;
		for(int i = 0; i < elementsList.size(); ++i) 
		{
		     WebElement checkbox = elementsList.get(i);
		     //for (int j = valueIndex; j < value.length(); j++) {
		    	 char c = value.charAt(i);
		    	 String string1 = Character.toString(c);
		           checkbox.sendKeys(string1);
		      
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
			//WebElement we = driver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
			action.moveToElement(AcceptTermsPay).click(Iaccept).build().perform();
			//String str = AcceptTermsPay.getText();
			//AcceptTermsPay.click();
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