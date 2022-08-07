package com.ResalesforceExample.test;


import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ResalesforceExample.Page.PageObjectModel01;
import com.ResalesforceExample.base.ExcelReader;

public class PageObjectTest {
	
	@Test(dataProvider = "getData")
	public void testDatatTest(Object username , Object password) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium file//selenium java//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		PageObjectModel01 pageObject = new PageObjectModel01(driver);
		pageObject.getUsername().sendKeys(username.toString());
		pageObject.getPassword().sendKeys(password.toString());		
		pageObject.getLoginButton().click();
		driver.close();
	}
	@DataProvider(name = "getData")
	public Object[][] getData(){
		ArrayList data = ExcelReader.getData("D://pageObjectModel//pageObjectLogin.xlsx");
		
		//converting arraylist to 1-D  Object array
		Object[] arr = data.toArray();
		
		//CONVERTING 1-d ARRAY TO 2-d array		
		int row =data.size()/2;
		int col =2;
		Object [][] testData= new Object[row][col];
		int i=0;
		for(int r =0; r<row; r++) {
			for(int c = 0; c<col; c++) {
				testData[r][c] = arr[i++];
			}
		}
		
		return testData;
	}
}
