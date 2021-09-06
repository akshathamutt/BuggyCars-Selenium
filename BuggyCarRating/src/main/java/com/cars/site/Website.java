package com.cars.site;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Website {
	
	public String sBrowserName;
	public String sUrlSite;
	public String sUsername;
	public String sPassword;
	public Properties prop;
	public String waitTime;

	
	public Website() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Selenium Webdriver\\BuggyCarRating\\src\\main\\java\\com\\cars\\config\\config.properties");
			prop.load(fis);
			
			sBrowserName=prop.getProperty("browser");
			sUrlSite=prop.getProperty("url");
			sUsername=prop.getProperty("user");
			sPassword=prop.getProperty("password");
			waitTime= prop.getProperty("implicit.wait");
			
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}
		
		catch(Exception e){
			e.printStackTrace();			
		}
		
	}

	public String getsBrowserName() {
		return sBrowserName;
	}

	public String getsUrlSite() {
		return sUrlSite;
	}

	public String getsUsername() {
		return sUsername;
	}

	public String getsPassword() {
		return sPassword;
	}
	
	public String getsWaitTime() {
		return waitTime;
	}

}

