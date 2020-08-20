package com.koch.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class utilities 
{
	//Screenshot, timestamp, alerts, frames, window, sync issue, javascript executor
	
	
	public static void  captureScreenshots(WebDriver driver)
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des=new File("./Screenshots/App_"+utilities.timeDate() +".png");
		
		try {
			FileHandler.copy(src, des);
		     } catch (Exception e) 
		   {
			e.getMessage();
		   }
		}

	public static String timeDate()
	{
		DateFormat df=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date d=new Date();
		return df.format(d);
		
	}
}
