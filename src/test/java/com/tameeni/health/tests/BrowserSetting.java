package com.tameeni.health.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.markuputils;
import com.aventstack.extentreports.model.ScreenCapture;






public class BrowserSetting {

	
public static WebDriver driver; 

public static ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest test;
public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception
{
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
            //after execution, you could see a folder "FailedTestsScreenshots" under src folder
	String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
}
 
@BeforeSuite
public void Report()
{
	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\extentReportFile.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	
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
	
@AfterMethod
public void getResult(ITestResult result) throws Exception
{
	
	 if(result.getStatus() == ITestResult.FAILURE)
	{
		// test.log(com.aventstack.extentreports.Status.FAIL, "Test Case Failed is "+result.getThrowable()); String screenshotPath = getScreenhot(driver, result.getName());
		// test.log(com.aventstack.extentreports.Status.FAIL, (Markup) test.addScreenCaptureFromPath(screenshotPath));
		 test.log(com.aventstack.extentreports.Status.FAIL, "Test ended with " + com.aventstack.extentreports.Status.FAIL);
	     extent.flush();
	   test.log(com.aventstack.extentreports.Status.FAIL, "Test Case Failed is "+result.getThrowable()); String screenshotPath = getScreenhot(driver, result.getName());
			 test.log(com.aventstack.extentreports.Status.FAIL, (Markup) test.addScreenCaptureFromPath(screenshotPath));

		
		 }
	 else if(result.getStatus() == ITestResult.SKIP){
		
	}
	 if(result.getStatus() == ITestResult.SUCCESS)
	    {
	        test.pass(MarkupHelper.createLabel(result.getName()+"Test Case Pass", ExtentColor.GREEN));
	    }
	 extent.flush();
	
 
}

	@AfterClass
	public void cleanUp(){
		//driver.manage().deleteAllCookies();
	}
	@AfterSuite
    public void tearDown()
    {
		//extent.flush();
    }
	
	
}
