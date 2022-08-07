package com.ResalesforceExample.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel01 {
	
	private WebDriver driver;
	public PageObjectModel01(WebDriver driver) {
		this.driver=driver;
	}
	By username = By.xpath("//*[@id='username']");
	By password = By.xpath("//*[@id='password']");
	By loginButton = By.xpath("//*[@id='Login']");
	
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	
}
