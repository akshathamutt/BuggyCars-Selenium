package com.cars.site;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver extends Website {
   protected static WebDriver driver;
	/*
	 * public static Properties config = new Properties(); public static Properties
	 * OR = new Properties(); public static FileInputStream fis; //public static
	 * Logger log = Logger.getLogger("devpinoyLogger"); public static ExcelReader
	 * excel = new ExcelReader(System.getProperty("user.dir") +
	 * "\\src\\test\\resources\\excel\\testdata.xlxs");
	 */
	public static WebDriverWait wait;
	Website website;

	
	@BeforeSuite
	public WebDriver OpenBrowser() {

		if (driver == null) {
		 

			if (sBrowserName.equals("firefox")) {

				// System.setProperty("webdriver.gecko.driver", "gecko.exe");
				driver = new FirefoxDriver();

			} else if (sBrowserName.equals("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\com\\cars\\utilities\\chromedriver.exe");
				driver = new ChromeDriver();
				// log.debug("Chrome Launched !!!");
			} else if (sBrowserName.equals("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\com\\cars\\utilities\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}		
			
			driver.manage().window().maximize();
		}
			
		return driver;
	}
	
	public void GoToPage()
	{
		driver.get(sUrlSite);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null)
			driver.quit();

		// log.debug("Test Successfully completed!!");
	}
}
