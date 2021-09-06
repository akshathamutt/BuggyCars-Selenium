package com.cars.tests;

import com.cars.pages.HomePage;
import com.cars.pages.RegisterPage;
import com.cars.pages.loginPage;
import com.cars.site.Driver;
import com.cars.utilities.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterDataDriven_NegativeTests {

	@Test
	public void As_a_tester_I_am_validating_invalid_Registeration_inputs() throws IOException {
		//creating object of ExcelUtils class
	     ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	     String excelFilePath =Constants.Path_TestData+Constants.File_TestData;

	     Driver driver = new Driver();
			WebDriver webDriver = driver.OpenBrowser();
			driver.GoToPage();

			loginPage LoginPage = new loginPage(webDriver);
			
			
			RegisterPage RegisterPage = new RegisterPage(webDriver);
			
			//calling the ExcelUtils class method to initialise the workbook and sheet
	        excelUtils.setExcelFile(excelFilePath,"sheet1");
	        
	      //iterate over all the row to print the data present in each cell.
	        for(int i=1;i<=excelUtils.getRowCountInSheet();i++)
	        {
	        	LoginPage.clickOnRegister();
	        	System.out.println(excelUtils.getCellData(i,0));
	        	System.out.println(excelUtils.getCellData(i,1));
	        	System.out.println(excelUtils.getCellData(i,2));
	        	System.out.println(excelUtils.getCellData(i,3));
	        	System.out.println(excelUtils.getCellData(i,4));
	        	
	        	RegisterPage.Register(excelUtils.getCellData(i,0), 
	        			excelUtils.getCellData(i,1), 
	        			excelUtils.getCellData(i,2), 
	        			excelUtils.getCellData(i,3), 
	        			excelUtils.getCellData(i,4));
	        	RegisterPage.clickOnRegister();
	    		String successMessage = RegisterPage.GetRegMessage();
	    		System.out.println("Row: "+ i + successMessage);
	    		
	    		Assert.assertEquals(excelUtils.getCellData(i,5), successMessage);
	    	
	    			    		
	        }	
	}

}