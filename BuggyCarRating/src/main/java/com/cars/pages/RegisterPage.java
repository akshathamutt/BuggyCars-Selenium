package com.cars.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	By loginField = By.id("username");
	By firstNameField = By.id("firstName");
	By lastNameField = By.id("lastName");
	By passwordField = By.id("password");
	By confirmPasswordField = By.id("confirmPassword");
	By registerButtonField = By.xpath("/html/body/my-app/div/main/my-register/div/div/form/button");
	By cancelButtonField = By.xpath("//a[contains(text(),'Cancel')]");
	By message = By.xpath("/html/body/my-app/div/main/my-register/div/div/form/div[6]");

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Register(String username, String firstName, String lastName, String password, String confirmPassword) {
		driver.findElement(loginField).clear();
		driver.findElement(loginField).sendKeys(username);

		driver.findElement(firstNameField).clear();
		driver.findElement(firstNameField).sendKeys(firstName);

		driver.findElement(lastNameField).clear();
		driver.findElement(lastNameField).sendKeys(lastName);

		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);

		driver.findElement(confirmPasswordField).clear();
		driver.findElement(confirmPasswordField).sendKeys(confirmPassword);

	}

	public void clickOnRegister() {
		driver.findElement(registerButtonField).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clickOnCancel() {
		driver.findElement(cancelButtonField).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public String GetRegMessage() {
		return driver.findElement(message).getText();
	}

}
