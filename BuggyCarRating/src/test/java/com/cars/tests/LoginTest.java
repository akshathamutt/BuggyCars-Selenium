package com.cars.tests;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cars.pages.*;
import com.cars.site.Driver;

public class LoginTest {

	
	@Test
	public void As_a_user_I_can_Login_vote_Logout() {
		
		//Initiate objects
		Driver driver = new Driver();	
		WebDriver webDriver = driver.OpenBrowser();
		driver.GoToPage();
		
		loginPage LoginPage = new loginPage(webDriver);
		LoginPage.login("Peter", "Testuser@123");
		
		HomePage homePage = new HomePage(webDriver);
		
		//Assert
		Assert.assertTrue(homePage.on_buggyRatingPage());
		
		//Select Overall Rating
		homePage.selectPopularMake();
		
		//Select a car model
		homePage.selectCarModel("Reventón");		
		Assert.assertEquals(homePage.DesiredModelIsDisplayed(),"Reventón");
		
		//Get Vote Number before voting 
		int voteCnt_before = Integer.parseInt(homePage.getVoteCount());
		//Vote for the car
		homePage.voteModel();
		Assert.assertTrue(homePage.voteMessageDisplayed());
		System.out.println(homePage.voteMessageDisplayed());
		
		//Get Vote Number after voting 
		int voteCnt_after = Integer.parseInt(homePage.getVoteCount());	
		
		//Vote should be increment by 1 
		Assert.assertEquals(voteCnt_before +1, voteCnt_after);
		System.out.println("Old Count" + voteCnt_before + " and " +"New Count" + voteCnt_after );
		//Logout
		homePage.logout();
		
		
	}
}

	