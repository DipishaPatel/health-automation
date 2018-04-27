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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TestCase_Class extends BrowserSetting {

	
/*--------------------------------Simple Purchase Flow-------------------------------*/
	
	String extentReportFile = System.getProperty("user.dir") + "\\extentReportFile.html";
	ExtentReports extent = new ExtentReports(extentReportFile, true);
	
	@Test
	public void selectTestss() throws InterruptedException, IOException {
		ExtentTest extentTest =extent.startTest("Purchase Flow From My Account","Verify WebSite Title");
		
		COMPHomeAction hrHomeAction = new COMPHomeAction(driver);
		COMPDashboardAction CompDashboard = new COMPDashboardAction(driver);
		COMPAddPolicyMainFlowAction CompSelectPolicy = new COMPAddPolicyMainFlowAction(driver);
		extentTest.log(LogStatus.INFO, "http://policyuat.gettameeni.com");
		hrHomeAction.clicklanguage();
		extentTest.log(LogStatus.INFO, "Change language");
		Thread.sleep(1000);
		hrHomeAction.clickloginlink();
		extentTest.log(LogStatus.INFO, "Login Popup");
		Thread.sleep(1000);
		hrHomeAction.enterusername("patel.dipi@yahoo.com");
		extentTest.log(LogStatus.INFO, "Enter UserName");
		Thread.sleep(1000);
		hrHomeAction.enterpassword("asd123qwe");
		extentTest.log(LogStatus.INFO, "Enter Password");
		Thread.sleep(1000);
		hrHomeAction.clickloginbutton();
		extentTest.log(LogStatus.INFO, "Click Login button");
		Thread.sleep(1000);
		CompDashboard.clickpurchaseNewPolicy();
		extentTest.log(LogStatus.INFO, "Click PurchaseNewPolicy");
		Thread.sleep(1000);
		CompDashboard.clickpolicytype();
		extentTest.log(LogStatus.INFO, "Click Comprihencive Purchase policy from menu");
		Thread.sleep(1000);
		CompSelectPolicy.clickselectPolicyholder();
		extentTest.log(LogStatus.INFO, "Select PolicyHolder");
		Thread.sleep(2000);
		CompSelectPolicy.clickselectAddress();
		extentTest.log(LogStatus.INFO, "Select Address");
		Thread.sleep(2000);
		CompSelectPolicy.clickselectVehile();
		extentTest.log(LogStatus.INFO, "select Vehile");
		Thread.sleep(1000);
		CompSelectPolicy.selectVehicle();
		extentTest.log(LogStatus.INFO, "select Vehile Type");
		Thread.sleep(1000);
		CompSelectPolicy.selectRegion();
		extentTest.log(LogStatus.INFO, "select Region");
		Thread.sleep(1000);
		CompSelectPolicy.selectcity();
		extentTest.log(LogStatus.INFO, "select City");
		Thread.sleep(1000);
		CompSelectPolicy.SelectOccupation();
		extentTest.log(LogStatus.INFO, "select Occupation");
		Thread.sleep(1000);
		CompSelectPolicy.personClick();
		extentTest.log(LogStatus.INFO, "Click persion");
		Thread.sleep(1000);
		CompSelectPolicy.SelectageDriver();
		extentTest.log(LogStatus.INFO, "Select age of Driver");
		Thread.sleep(1000);
		CompSelectPolicy.ClickSelectDeclaration();
		extentTest.log(LogStatus.INFO, "Click Declaration");
		Thread.sleep(1000);
		CompSelectPolicy.ClickNextotherDetail();
		extentTest.log(LogStatus.INFO, "Click other detail button");
		Thread.sleep(1000);
		CompSelectPolicy.ClickDatePicker();
		extentTest.log(LogStatus.INFO, "Select Date Picker");
		Thread.sleep(1000);
		CompSelectPolicy.SelectDate();
		extentTest.log(LogStatus.INFO, "Select Current Date");
		Thread.sleep(1000);
		CompSelectPolicy.EnterEstimateValue("94050");
		extentTest.log(LogStatus.INFO, "Select Estimate Value");
		Thread.sleep(1000);
		 WebDriverWait wait = new WebDriverWait(driver, 5000);
		CompSelectPolicy.ClickGetQuoteNow();
		extentTest.log(LogStatus.INFO, "GetQuoteNow");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='countdown']"))); 
			CompSelectPolicy.ClickFeature();
			extentTest.log(LogStatus.INFO, "Select Feature");		
		Thread.sleep(1000);
		CompSelectPolicy.selectDeductible();
		extentTest.log(LogStatus.INFO, "Select Deductible");
		Thread.sleep(1000);
		CompSelectPolicy.selectDeductibleAmount();
		extentTest.log(LogStatus.INFO, "Select Deductible Amount");
		Thread.sleep(1000);
		CompSelectPolicy.clickICSelect();
		extentTest.log(LogStatus.INFO, "Select Insurance Company");
		Thread.sleep(1000);
		CompSelectPolicy.FrontImageClick();
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Front.exe");
		extentTest.log(LogStatus.INFO, "Select Front vehicle image");
		Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuFront']/img")));  
	    CompSelectPolicy.RearImageClick();
	    Thread.sleep(5000);   
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Rear02.exe");
		extentTest.log(LogStatus.INFO, "Select Rear vehicle image");
		Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuRear']/img")));  
		CompSelectPolicy.RightImageClick();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Right.exe");
		extentTest.log(LogStatus.INFO, "Select Rear vehicle image");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuRight']/img")));
		CompSelectPolicy.LeftImageClick();
		Thread.sleep(5000);  
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\Left.exe");
		extentTest.log(LogStatus.INFO, "Select Left vehicle image");
		Thread.sleep(5000);  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuLeft']/img")));
		CompSelectPolicy.VINImageClick();
		Thread.sleep(5000); 
		Runtime.getRuntime().exec("D:\\selenium\\NewProject-Health\\UploadFile\\VIN.exe");
		extentTest.log(LogStatus.INFO, "Select VIN vehicle image");
		Thread.sleep(5000); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='image-holder-fuVIN']/img")));
		Thread.sleep(5000); 
		CompSelectPolicy.EnterIBAN("1115798963589785693589");
		extentTest.log(LogStatus.INFO, "Enter IBAN Number");
		Thread.sleep(5000); 
		CompSelectPolicy.ImagesTerms();
		extentTest.log(LogStatus.INFO, "Select Vehicle terms");
		Thread.sleep(5000); 
		CompSelectPolicy.Visa();
		extentTest.log(LogStatus.INFO, "Select Visa");
		Thread.sleep(5000); 
		CompSelectPolicy.AcceptTermsPay();
		extentTest.log(LogStatus.INFO, "Select Accepts Terms and Condition");
		Thread.sleep(5000); 
		CompSelectPolicy.PayNow();
		extentTest.log(LogStatus.INFO, "Clcik on PayNow");
		driver.quit();
		extentTest.log(LogStatus.INFO, "Browser closed");
		extent.endTest(extentTest);
		//extent.flush();
	}

}
