package com.cars.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	
	By curentPasswordTextBox = By.xpath("//input[@id='currentPassword']");
	By newPasswordTextBox = By.xpath("//input[@id='newPassword']");
	By confirmPasswordTextBox = By.xpath("//input[@id='newPasswordConfirmation']");
	By saveButton = By.xpath("//button[contains(text(),'Save')]");
	By cancelButton = By.xpath("//a[contains(text(),'Cancel')]");
	By firstName  = By.id("firstName");
	
WebDriver driver;

	
	public ProfilePage(WebDriver driver) {
	this.driver = driver;
	
}
	public void login(String currentPassword, String newPassword, String confirmPassword)
	{
		
		driver.findElement(curentPasswordTextBox).clear();
		driver.findElement(curentPasswordTextBox).sendKeys(currentPassword);
		
		driver.findElement(newPasswordTextBox).clear();
		driver.findElement(newPasswordTextBox).sendKeys(newPassword);
		
		driver.findElement(confirmPasswordTextBox).clear();
		driver.findElement(confirmPasswordTextBox).sendKeys(confirmPassword);
		
	}
	
	public void UpdateFirstname(String updated_firstName)
	{
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(updated_firstName);
		
	}
	public void clickOnSave()
	{
		driver.findElement(saveButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void clickOnCancel()
	{
		driver.findElement(cancelButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	
	

}
