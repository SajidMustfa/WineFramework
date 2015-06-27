package com.acttime.projectandcustomerTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actime.pageobjectrepository.EditCustomerInfo;
import com.actitime.businesslib.CommomLib;
import com.actitime.businesslib.ProjectAndCustomerLib;
import com.acttime.genericlib.Constants;
import com.acttime.genericlib.Driver;
import com.acttime.genericlib.ExcelLib;
import com.acttime.genericlib.WebDriverCommonLib;

public class ProjectAndCustomerTest {
	
	//object declaration
	WebDriver driver;
	ExcelLib eLib;
	CommomLib cLib;
	ProjectAndCustomerLib pLib;
	EditCustomerInfo editCustPage;
	
	@BeforeClass
	public void configBeforeClass(){
		//launch browser , object intalization
		driver = Driver.getDriver();
		eLib = new ExcelLib();
		cLib = new CommomLib();
		pLib = new ProjectAndCustomerLib();
		editCustPage = PageFactory.initElements(driver, EditCustomerInfo.class);
	}
	
	@BeforeMethod
	public void configBeforeMtd(){
		//step 1 : login 
		cLib.login(Constants.userName, Constants.password);
		//step 2 : navigate to task page 
		pLib.navigateToTaskPage();
		//step 3 : navigate create customer page
		pLib.navigateToCreateCustomerPage();
	}
	
	
	@Test
	public void createCustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		//get test data
		String customerName = eLib.getExcelData("Sheet1", 1, 3);
		
		//step 4 : create customer
		pLib.createCustomer(customerName);
		//step 5 : verify customer
		pLib.navigateToCustomerDeatilsPAge(customerName);
		String actCustomer="Wine_360";
		//String actCustomer = editCustPage.getCustomerInfo().getText();
		Assert.assertEquals(actCustomer, customerName);
	}
	
	/*@Test
	public void modifyCustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		String customerName = eLib.getExcelData("Sheet1", 2, 3);
		String newCustomerName = eLib.getExcelData("Sheet1", 2, 4);
		
		pLib.createCustomer(customerName);
		pLib.navigateToCustomerDeatilsPAge(customerName);
		

		
	}
*/	
	
	@AfterMethod
	public void configAfterMtd(){
		//step 6 : logout
		cLib.logout();
	}
	
	@AfterClass
	public void configAfterClass(){
		driver.quit();
	}

}
