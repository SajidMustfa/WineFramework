package com.actitime.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.actime.pageobjectrepository.Common;
import com.actime.pageobjectrepository.Login;
import com.acttime.genericlib.Constants;
import com.acttime.genericlib.Driver;
import com.acttime.genericlib.WebDriverCommonLib;

public class CommomLib extends WebDriverCommonLib{
	
	Login loginPage = PageFactory.initElements(Driver.driver, Login.class);
	Common comPage = PageFactory.initElements(Driver.driver, Common.class);
	
	public void login(String userName , String password){
		Driver.driver.get(Constants.url);
		Driver.driver.manage().window().maximize();
		loginPage.getUserNameEdt().sendKeys(userName);
		loginPage.getPasswordEdt().sendKeys(password);
		loginPage.getLoginBtn().click();		
		waitForPageToLoad();
	}
	
	public void logout(){
		comPage.getLogOutLnk().click();
		waitForPageToLoad();
	}
	
	
	
	
	
	
	

}
