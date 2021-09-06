package com.cars.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	By buggyRatingLabel = By.xpath("//a[contains(text(),'Buggy Rating')]");
	By profileButton = By.xpath("//a[contains(text(),'Profile')]");
	By logoutButton = By.xpath("//a[contains(text(),'Logout')]");
	
	By lamborghiniImage = By.xpath("/html/body/my-app/div/main/my-home/div/div[1]/div/a/img");
	By diablo = By.linkText("Diablo");
	By headerText = By.cssSelector("h3");
	By overallRating = By.xpath("/html[1]/body[1]/my-app[1]/div[1]/main[1]/my-home[1]/div[1]/div[3]/div[1]/a[1]/img[1]");
	By voteButton = By.xpath("//button[contains(text(),'Vote!')]");
	By voteCount = By.cssSelector("h4 > strong");
	
	
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver = driver;
	
}
	public boolean on_buggyRatingPage()
	{
		if(driver.findElement(buggyRatingLabel).isDisplayed())
		{
			return true;
		}
		else 
			return false;
	}	
	public void selectProfile()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(profileButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void selectPopularMake()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(lamborghiniImage).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void selectCarModel(String modelName) {
		driver.findElement(By.linkText(modelName)).click();
		
	}
	
	public String DesiredModelIsDisplayed() {
		
		return driver.findElement(headerText).getText();
		
	}
	
	public void voteModel()
	{
		
		if (driver.findElement(voteButton).isDisplayed()) {
			driver.findElement(voteButton).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else 
		{
			//
		}
	}
	
	
	public String getVoteCount()
	{
		return driver.findElement(voteCount).getText();
		
	}
	
	public boolean voteMessageDisplayed()
	{
		if (driver.findElement(By.xpath("//p[contains(.,'Thank you for your vote!')]")).isDisplayed()) return true;
		else return false;
	}
	
	public boolean firstnameDisplayed(String name) {
	if (driver.findElement(By.xpath("//span[contains(.,'Hi, "+ name + "')]")).isDisplayed()) return true;
	else return false;
	
	}
	
	public void logout()
	{	
		driver.findElement(logoutButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
