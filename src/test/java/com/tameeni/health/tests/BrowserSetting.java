package com.tameeni.health.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.tameeni.health.Action.COMPAddPolicyMainFlowAction;
import com.tameeni.health.Action.COMPDashboardAction;
import com.tameeni.health.Action.COMPHomeAction;

public class BrowserSetting {

	
public static WebDriver driver; 
	
	@BeforeClass
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver","D:\\Dipisha\\LatestDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://policyuat.gettameeni.com/");
		
	}

	@AfterClass
	public void cleanUp(){
		//driver.manage().deleteAllCookies();
	}
	
	//@AfterClass
	public static void tearDown(){
		//driver.close();
	}	
}
