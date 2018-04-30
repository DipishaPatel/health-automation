package com.tameeni.health.tests;

import java.io.IOException;



import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.tameeni.health.Action.COMPAddPolicyMainFlowAction;
import com.tameeni.health.Action.COMPDashboardAction;
import com.tameeni.health.Action.COMPHomeAction;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TestCase_Class extends BrowserSetting {
	
/*--------------------------------Simple Purchase Flow-------------------------------*/
	public void selectTestss() throws InterruptedException, IOException {
		test = extent.createTest("Purchase Flow From My Account");
	
		//ExtentTest extentTest =extent.startTest("Purchase Flow From My Account","Verify WebSite Title");
	//test = extent.createTest("Main Flow");
		
		COMPHomeAction hrHomeAction = new COMPHomeAction(driver);
		COMPDashboardAction CompDashboard = new COMPDashboardAction(driver);
		COMPAddPolicyMainFlowAction CompSelectPolicy = new COMPAddPolicyMainFlowAction(driver);
		
		hrHomeAction.clicklanguage();
		test.log(Status.INFO, MarkupHelper.createLabel("Change Language", ExtentColor.BLUE));
		Thread.sleep(1000);
		hrHomeAction.clickloginlink();
		test.log(Status.INFO, MarkupHelper.createLabel("Login Popup", ExtentColor.BLUE));
		Thread.sleep(1000);
		hrHomeAction.enterusername("patel.dipi@yahoo.com");
		test.log(Status.INFO, MarkupHelper.createLabel("Enter UserName", ExtentColor.BLUE));
		Thread.sleep(1000);
		hrHomeAction.enterpassword("asd123qwe");
		test.log(Status.INFO, MarkupHelper.createLabel("Enter Password", ExtentColor.BLUE));
		Thread.sleep(1000);
		hrHomeAction.clickloginbutton();
		test.log(Status.INFO, MarkupHelper.createLabel("Click Login button", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompDashboard.clickpurchaseNewPolicy();
		test.log(Status.INFO, MarkupHelper.createLabel("Click PurchaseNewPolicy", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompDashboard.clickpolicytype();
		test.log(Status.INFO, MarkupHelper.createLabel("Click Comprihencive Purchase policy from menu", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.clickselectPolicyholder();
		test.log(Status.INFO, MarkupHelper.createLabel("Select PolicyHolder", ExtentColor.BLUE));
		Thread.sleep(2000);
		CompSelectPolicy.clickselectAddress();
		test.log(Status.INFO, MarkupHelper.createLabel("Select Address", ExtentColor.BLUE));
		Thread.sleep(2000);
		CompSelectPolicy.clickselectVehile();
		test.log(Status.INFO, MarkupHelper.createLabel("select Vehile", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.selectVehicle();
		test.log(Status.INFO, MarkupHelper.createLabel("select Vehile Type", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.selectRegion();
		test.log(Status.INFO, MarkupHelper.createLabel("select Region", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.selectcity();
		test.log(Status.INFO, MarkupHelper.createLabel("select City", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.SelectOccupation();
	
		test.log(Status.INFO, MarkupHelper.createLabel("select Occupation", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.personClick();
	
		test.log(Status.INFO, MarkupHelper.createLabel("Click persion", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.SelectageDriver();
	
		test.log(Status.INFO, MarkupHelper.createLabel("Select age of Driver", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.ClickSelectDeclaration();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Click Declaration", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.ClickNextotherDetail();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Click other detail button", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.ClickDatePicker();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Date Picker", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.SelectDate();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Current Date", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.EnterEstimateValue("94050");
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Estimate Value", ExtentColor.BLUE));
		Thread.sleep(1000);
		 WebDriverWait wait = new WebDriverWait(driver, 5000);
		CompSelectPolicy.ClickGetQuoteNow();
		
		test.log(Status.INFO, MarkupHelper.createLabel("GetQuoteNow", ExtentColor.BLUE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='countdown']"))); 
			CompSelectPolicy.ClickFeature();
			
			test.log(Status.INFO, MarkupHelper.createLabel("Select Feature", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.selectDeductible();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Deductible", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.selectDeductibleAmount();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Deductible Amount", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.clickICSelect();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Insurance Company", ExtentColor.BLUE));
		Thread.sleep(1000);
		CompSelectPolicy.FrontImageClick();
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Front.exe");
		
		test.log(Status.INFO, MarkupHelper.createLabel("\"Select Front vehicle image", ExtentColor.BLUE));
		Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuFront']/img")));  
	    CompSelectPolicy.RearImageClick();
	    Thread.sleep(5000);   
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Rear02.exe");
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Rear vehicle image", ExtentColor.BLUE));
		Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuRear']/img")));  
		CompSelectPolicy.RightImageClick();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Right.exe");
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Rear vehicle image", ExtentColor.BLUE));
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuRight']/img")));
		CompSelectPolicy.LeftImageClick();
		Thread.sleep(5000);  
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Left.exe");
	
		test.log(Status.INFO, MarkupHelper.createLabel("Select Left vehicle image", ExtentColor.BLUE));
		Thread.sleep(5000);  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuLeft']/img")));
		CompSelectPolicy.VINImageClick();
		Thread.sleep(5000); 
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\VIN.exe");
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select VIN vehicle image", ExtentColor.BLUE));
		Thread.sleep(5000); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuVIN']/img")));
		Thread.sleep(5000); 
		CompSelectPolicy.EnterIBAN("1115798963589785693589");
		
		test.log(Status.INFO, MarkupHelper.createLabel("Enter IBAN Number", ExtentColor.BLUE));
		Thread.sleep(5000); 
		CompSelectPolicy.ImagesTerms();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Vehicle terms", ExtentColor.BLUE));
		Thread.sleep(5000); 
		CompSelectPolicy.Visa();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Visa", ExtentColor.BLUE));
		Thread.sleep(5000); 
		CompSelectPolicy.AcceptTermsPay();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Select Accepts Terms and Condition", ExtentColor.BLUE));
		Thread.sleep(5000); 
		CompSelectPolicy.PayNow();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Clcik on PayNow", ExtentColor.BLUE));
		driver.quit();
		
		test.log(Status.INFO, MarkupHelper.createLabel("Browser closed", ExtentColor.BLUE));
		//extent.endTest(extentTest);
		//extent.flush();
	}

}
