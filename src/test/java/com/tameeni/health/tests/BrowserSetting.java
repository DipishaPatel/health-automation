package com.tameeni.health.tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


public class BrowserSetting {

	
public static WebDriver driver; 
	
	@BeforeClass
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver","D:\\Dipisha\\LatestDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://policyuat.gettameeni.com/");
		driver.manage().window().maximize();
		
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
