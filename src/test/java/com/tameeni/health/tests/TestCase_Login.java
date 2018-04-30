package com.tameeni.health.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
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
		//ExtentTest extentTest =extent.startTest("Purchase Flow From My Account","Verify WebSite Title");
		COMPHomeAction hrHomeAction = new COMPHomeAction(driver);
		//COMPDashboardAction CompDashboard = new COMPDashboardAction(driver);
		//COMPAddPolicyMainFlowAction CompSelectPolicy = new COMPAddPolicyMainFlowAction(driver);
		test = extent.createTest("Test case of Login Page");
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
		driver.quit();
		test.log(Status.INFO, MarkupHelper.createLabel("Browser closed", ExtentColor.BLUE));
	//	extent.endTest(extentTest);
		//extent.flush();
		//CompDashboard.clickpurchaseNewPolicy();
	}
}
