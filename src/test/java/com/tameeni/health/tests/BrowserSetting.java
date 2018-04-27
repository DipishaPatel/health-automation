package com.tameeni.health.tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.internal.DynamicGraph.Status;

//import com.aventstack.extentreports.markuputils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BrowserSetting {

	
public static WebDriver driver; 

//public static ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest test;
 
@BeforeSuite
public void Report()
{
	String extentReportFile = System.getProperty("user.dir") + "\\extentReportFile.html";
	extent = new ExtentReports(extentReportFile, true);
	
}


@BeforeClass
	public  void setUp(){
		
		System.setProperty("webdriver.chrome.driver","D:\\Dipisha\\LatestDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://policyuat.gettameeni.com/");
		driver.manage().window().maximize();
	//	extentTest.log(LogStatus.INFO, "Browser Launched");
	}
	
/*@AfterMethod
public void getResult(ITestResult result)
{
	if(result.getStatus() == ITestResult.SUCCESS)
    {
        test.log(Status.FINISHED, "Pass");
    }
}*/

	@AfterClass
	public void cleanUp(){
		//driver.manage().deleteAllCookies();
	}
	@AfterSuite
    public void tearDown()
    {
		extent.flush();
    }
	
	
}
