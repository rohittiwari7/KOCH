package com.koch.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider
{
	Properties pro;

	//Constructor
	public ConfigDataProvider() 
	{
		File src = new File("./Config/config.properties");
		try {
			FileInputStream	fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	//methods
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getAppURL()
	{
		return pro.getProperty("AppURL");
	}
	
	public String getTitleHomePage()
	{
		return pro.getProperty("TitleHomePage");
	}
	
	public String getSource()
	{
		return pro.getProperty("Source");
	}
	
	public String getdestination()
	{
		return pro.getProperty("destination");
	}
	
	public String getDataFromConfig(String KeyToSearch)
	{
		return pro.getProperty(KeyToSearch);
	}
	

}
