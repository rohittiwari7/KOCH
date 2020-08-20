package com.koch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BaseClass
{
	
	@FindBy(xpath = "//div[@class='fltrs-cntnr']/div[1]/div[1]/div/div/div[1]/span/div[1]/span[1]") WebElement nonstop;
	@FindBy(xpath = "//div[@class='fltrs-cntnr']/div[1]/div[1]/div/div[1]") WebElement stop;
	@FindBy(xpath = "//div[@class='fltrs-cntnr']/div[1]/div[2]/div[1]/div[1]") WebElement departure;
	@FindBy(xpath = "//div[@class='fltrs-cntnr']/div[1]/div[3]/div/div[1]") WebElement airlines;
	@FindBy(xpath = "//div[@class='arln-nm']") List<WebElement> listofAirlines;
	@FindBy(xpath = "//div[@class='arln-pr']/div") List<WebElement> airlinesPrice;

	 public void ValidationFilterOption()
	{
		 //Validation filter option for Stop, departure and Airlines and select Non-Stop in Stop filter option
			
			if(stop.isDisplayed())
			{
				System.out.println("====================Stop filter Validation Done==============================");
			      nonstop.click();
			}
			
			if(departure.isDisplayed())
			{
				System.out.println("=====================Departure filter Validation Done======================== ");
			      
			}
			if(airlines.isDisplayed())
			{
				System.out.println("=====================Airlines filter Validation Done========================= ");     
			}
	}
	 
	 public void airlineDetails() throws InterruptedException
	 {
		 
		//Print the list of Airlines details having fare <5000
		 System.out.println("=======================Airlines Details=========================");
		for(int i=0;i<listofAirlines.size();i++)
		{
		 System.out.println("List of Airline= "+listofAirlines.get(i).getAttribute("title")); 
		}
		System.out.println("=======================Airlines price=========================");
		for(int j=0;j<airlinesPrice.size();j++)
		{
		     System.out.println("List of Airline Price= "+airlinesPrice.get(j).getAttribute("title")); 	
		}
	 }

}