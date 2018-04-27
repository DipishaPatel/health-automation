package com.tameeni.health.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tameeni.health.Action.COMPAddPolicyMainFlowAction;
import com.tameeni.health.Action.COMPDashboardAction;
import com.tameeni.health.Action.COMPHomeAction;

public class TestCase_Login extends BrowserSetting 
{
	@Test
	public void selectTestss() throws InterruptedException, IOException 
	{
		ExtentTest extentTest =extent.startTest("Purchase Flow From My Account","Verify WebSite Title");
		COMPHomeAction hrHomeAction = new COMPHomeAction(driver);
		//COMPDashboardAction CompDashboard = new COMPDashboardAction(driver);
		//COMPAddPolicyMainFlowAction CompSelectPolicy = new COMPAddPolicyMainFlowAction(driver);
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
		driver.quit();
		extentTest.log(LogStatus.INFO, "Browser closed");
		extent.endTest(extentTest);
		//extent.flush();
		//CompDashboard.clickpurchaseNewPolicy();
	}
}
