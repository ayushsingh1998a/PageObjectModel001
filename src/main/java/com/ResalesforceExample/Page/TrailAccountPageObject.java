package com.ResalesforceExample.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrailAccountPageObject {	
	private WebDriver driver;
	
	public TrailAccountPageObject(WebDriver driver) {
		this.driver=driver;
	}
	By firstName = By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/div/div/input");
	By lastName = By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/input");
	By workEmail = By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/input");
	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	public WebElement getWorkEmail() {
		return driver.findElement(workEmail);
	}
}
