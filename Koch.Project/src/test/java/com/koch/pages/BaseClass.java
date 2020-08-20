package com.koch.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.koch.utility.BrowserFactory;
import com.koch.utility.ConfigDataProvider;
import com.koch.utility.utilities;

public class BaseClass 
{
	public WebDriver driver;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setupSuite()
	{
		config=new ConfigDataProvider();
		@SuppressWarnings("deprecation")
		ExtentHtmlReporter rhr=new ExtentHtmlReporter(new File("./Reports/report_"+utilities.timeDate()+".html"));
		report=new ExtentReports();
		report.attachReporter(rhr);
	}
	
	

@BeforeTest
	public void setup() 
	{
	driver=BrowserFactory.StartApplication(driver, config.getBrowser() , config.getAppURL() );
		
	}
   
@AfterTest
	public void tearDown() 
	{
		BrowserFactory.quitBrowser(driver);	
	}
	
	
@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
	if(result.getStatus()==ITestResult.SUCCESS)
	    {
	     utilities.captureScreenshots(driver);
	    }
	report.flush();
	}
   
}
