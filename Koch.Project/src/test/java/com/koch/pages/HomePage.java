package com.koch.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{

	@FindBy(xpath = "//*[@id='content']/div/div[1]/div[6]/div/div/div[1]/div/div[2]") WebElement fromDefaultValue;
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/div/div//preceding:: input") WebElement From ;
	@FindBy(xpath = "//div[@class='form-fields']/div[3]/div/div/input") WebElement To ;
	@FindBy(xpath = "//div[@class='rd-month'][2]/table/tbody/tr[3]/td[5]") WebElement DepartureDate ;
	@FindBy(xpath = "//div[@class='form-fields']/div[4]/div/div[2]/div/input") WebElement ReturnCalender ;
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/table/tbody/tr[4]/td[7]/div[1]") WebElement ReturnDate ;
	@FindBy(xpath = "//div[@class='form-fields']/div[5]/div/div/input") WebElement TravellersTab ;
	@FindBy(xpath = "//*[@id='content']/div/div[1]/div[6]/div/div/div[5]/div/div[2]/div[2]/div[1]/div[2]/span[2]") WebElement NumberOfTravellers ;
	@FindBy(xpath = "//div[@class='form-fields']/div[6]") WebElement SearchButton ;
	

	 public void ValidateHomePage(WebDriver driver)
	{ 
		   String title=driver.getTitle();
			//Validation of the landing page 
			if(title.equalsIgnoreCase("ixigo - Flights, Train Reservation, Hotels, Air Tickets, Bus Booking"))
			{
				System.out.println("==============Landing Page validaiton done successfully=============================");
			}
		  
	}
	 
	 public void searchingAirlines() throws InterruptedException
	 {
	 //Source data 
		     fromDefaultValue.click();
		     From.sendKeys("Pune");
		     From.sendKeys(Keys.ENTER);
		 
		//Destination data
		    To.sendKeys("Hyderabad");
		   To.sendKeys(Keys.ENTER);
		 
		//Departure date selection
			DepartureDate.click();
			ReturnCalender.click();
			ReturnDate.click();
			TravellersTab.click();
			NumberOfTravellers.click();
			
			
		//Click on Search button
		     SearchButton.click();	
		    
	 }

}
