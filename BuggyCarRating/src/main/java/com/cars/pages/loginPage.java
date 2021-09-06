package com.cars.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;




public class loginPage {
	
	public By usernameTextBox = By.name("login");
	By passwordTextBox = By.name("password");
	By loginButton = By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/button");
	By registerBtn = By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/a");
	

WebDriver driver;

	
	public loginPage(WebDriver driver) {
	this.driver = driver;
}


	
	
	public void login(String username, String password)
	{
		
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
		
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
		
		driver.findElement(loginButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	public void clickOnRegister()
	{
		driver.findElement(registerBtn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
