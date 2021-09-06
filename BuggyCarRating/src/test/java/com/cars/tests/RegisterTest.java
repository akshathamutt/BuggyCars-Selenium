package com.cars.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cars.pages.*;

import com.cars.site.Driver;

public class RegisterTest {

	@Test
	public void As_a_new_user_I_can_register_to_buggy_rating_website() {

		// Initiate objects
	
		Driver driver = new Driver();
		WebDriver webDriver = driver.OpenBrowser();
		driver.GoToPage();

		loginPage LoginPage = new loginPage(webDriver);
		LoginPage.clickOnRegister();

		RegisterPage RegisterPage = new RegisterPage(webDriver);
		RegisterPage.Register("Peter", "Peter", "James", "Testuser@123", "Testuser@123");
		RegisterPage.clickOnRegister();
		String successMessage = RegisterPage.GetRegMessage();
		System.out.println(successMessage);
		
	Assert.assertEquals(successMessage, "Registration is successful"); 	

	}

}
