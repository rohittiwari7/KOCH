package com.koch.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.koch.pages.BaseClass;
import com.koch.pages.HomePage;
import com.koch.pages.ResultPage;

public class HomePageTest extends BaseClass
{
	@Test(priority=1)
	public void ixigoHomePageValidation( ) throws InterruptedException 
	{  
	logger=report.createTest("ixigo HomePage Validation");
       
	logger.info("ixigo application homepage");
	HomePage home=PageFactory.initElements(driver, HomePage.class);
	logger.info("ixigo homepage Validation");
	home.ValidateHomePage(driver);
	logger.info("ixigo homepage searching the flight");
	home.searchingAirlines();
		
	}
	
	@Test(priority=2,dependsOnMethods="ixigoHomePageValidation")
	public void ixigoResultPageValidation( ) throws InterruptedException 
	{ 
	logger=report.createTest("ixigo Result page Validation");
    
	logger.info("ixigo application ResultPage");
	ResultPage result=PageFactory.initElements(driver, ResultPage.class);
	logger.info("ixigo filter Validation");
	result.ValidationFilterOption();
	logger.info("ixigo homepage searching the flight");
	result.airlineDetails();
		
	}
	
	}
