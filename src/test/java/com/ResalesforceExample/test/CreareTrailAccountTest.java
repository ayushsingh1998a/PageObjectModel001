package com.ResalesforceExample.test;


import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ResalesforceExample.Page.PageObjectModel01;
import com.ResalesforceExample.Page.TrailAccountPageObject;
import com.ResalesforceExample.base.ExcelReader;

public class CreareTrailAccountTest {
	
	@Test(dataProvider = "getData")
	public void testDatatTest(Object firstName, Object lastName, Object workEmail) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium file//selenium java//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		TrailAccountPageObject pageObject = new TrailAccountPageObject(driver);
		pageObject.getFirstName().sendKeys(firstName.toString());
		pageObject.getLastName().sendKeys(lastName.toString());
		pageObject.getWorkEmail().sendKeys(workEmail.toString());

		
	}
	@DataProvider(name = "getData")
	public Object[][] getTest(){
		ArrayList data = ExcelReader.getData("D://pageObjectModel//createTrailAccount.xlsx");
		
		//converting arraylist to 1-D  Object array
		Object[] arr = data.toArray();
		
		//CONVERTING 1-d ARRAY TO 2-d array		
		int row =1;
		int col =3;
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
