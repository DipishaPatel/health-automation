package com.tameeni.health.tests;

import java.io.IOException;



import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tameeni.health.Action.COMPAddPolicyMainFlowAction;
import com.tameeni.health.Action.COMPDashboardAction;
import com.tameeni.health.Action.COMPHomeAction;


public class TestCase_Class extends BrowserSetting {
	
/*---------------------------------Simple Purchase Flow-------------------------------*/	
	@Test
	public void selectTestss() throws InterruptedException, IOException {
		COMPHomeAction hrHomeAction = new COMPHomeAction(driver);
		COMPDashboardAction CompDashboard = new COMPDashboardAction(driver);
		COMPAddPolicyMainFlowAction CompSelectPolicy = new COMPAddPolicyMainFlowAction(driver);
		hrHomeAction.clicklanguage();
		Thread.sleep(1000);
		hrHomeAction.clickloginlink();
		Thread.sleep(1000);
		hrHomeAction.enterusername("patel.dipi@yahoo.com");
		Thread.sleep(1000);
		hrHomeAction.enterpassword("asd123qwe");
		Thread.sleep(1000);
		hrHomeAction.clickloginbutton();
		Thread.sleep(1000);
		CompDashboard.clickpurchaseNewPolicy();
		Thread.sleep(1000);
		CompDashboard.clickpolicytype();
		Thread.sleep(1000);
		CompSelectPolicy.clickselectPolicyholder();
		Thread.sleep(2000);
		CompSelectPolicy.clickselectAddress();
		Thread.sleep(2000);
		CompSelectPolicy.clickselectVehile();
		Thread.sleep(1000);
		CompSelectPolicy.selectVehicle();
		Thread.sleep(1000);
		CompSelectPolicy.selectRegion();
		Thread.sleep(1000);
		CompSelectPolicy.selectcity();
		Thread.sleep(1000);
		CompSelectPolicy.SelectOccupation();
		Thread.sleep(1000);
		CompSelectPolicy.personClick();
		Thread.sleep(1000);
		CompSelectPolicy.SelectageDriver();
		Thread.sleep(1000);
		CompSelectPolicy.ClickSelectDeclaration();
		Thread.sleep(1000);
		CompSelectPolicy.ClickNextotherDetail();
		Thread.sleep(1000);
		CompSelectPolicy.ClickDatePicker();
		Thread.sleep(1000);
		CompSelectPolicy.SelectDate();
		Thread.sleep(1000);
		CompSelectPolicy.EnterEstimateValue("94050");
		Thread.sleep(1000);
		 WebDriverWait wait = new WebDriverWait(driver, 5000);
		CompSelectPolicy.ClickGetQuoteNow();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='countdown']"))); 
			CompSelectPolicy.ClickFeature();
			Thread.sleep(1000);			
		Thread.sleep(1000);
		CompSelectPolicy.selectDeductible();
		Thread.sleep(1000);
		CompSelectPolicy.selectDeductibleAmount();
		Thread.sleep(1000);
		CompSelectPolicy.clickICSelect();
		Thread.sleep(1000);
		CompSelectPolicy.FrontImageClick();
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Front.exe");
		Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuFront']/img")));  
	    CompSelectPolicy.RearImageClick();
	    Thread.sleep(5000);   
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Rear02.exe");
		Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuRear']/img")));  
		CompSelectPolicy.RightImageClick();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Right.exe");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuRight']/img")));
		CompSelectPolicy.LeftImageClick();
		Thread.sleep(5000);  
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Left.exe");
		Thread.sleep(5000);  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuLeft']/img")));
		CompSelectPolicy.VINImageClick();
		Thread.sleep(5000); 
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\VIN.exe");
		Thread.sleep(5000); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuVIN']/img")));
		Thread.sleep(5000); 
		CompSelectPolicy.EnterIBAN("1115798963589785693589");
		Thread.sleep(5000); 
		CompSelectPolicy.ImagesTerms();
		Thread.sleep(5000); 
		CompSelectPolicy.Visa();
		Thread.sleep(5000); 
		CompSelectPolicy.AcceptTermsPay();
		Thread.sleep(5000); 
		CompSelectPolicy.PayNow();
	}

}
