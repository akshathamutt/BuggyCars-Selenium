package com.cars.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cars.pages.HomePage;
import com.cars.pages.ProfilePage;
import com.cars.pages.loginPage;
import com.cars.site.Driver;

public class UpdateProfile {

	@Test
	public void As_a_user_when_I_update_firstname_it_should_reflect_on_the_header_greeting() {
		// Initiate objects
		Driver driver = new Driver();
		WebDriver webDriver = driver.OpenBrowser();
		driver.GoToPage();

		loginPage LoginPage = new loginPage(webDriver);
		LoginPage.login("Peter", "Testuser@123");

		HomePage homePage = new HomePage(webDriver);

		// Assert
		Assert.assertTrue(homePage.on_buggyRatingPage());

		// Select profile
		homePage.selectProfile();

		ProfilePage profilePage = new ProfilePage(webDriver);
		profilePage.UpdateFirstname("Peter");

		profilePage.clickOnSave();

		homePage.logout();

		LoginPage.login("Peter", "Testuser@123");

		Assert.assertTrue(homePage.firstnameDisplayed("Peter"));
		
		System.out.println("Name changed successfully");

	}

}
