package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void waitForLinkPresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				                          (By.linkText(linkName)));		
	}
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				                             (By.xpath(wbXpath)));		
	}
	
	
	public void select(WebElement selWb , String value){
		Select sel = new Select(selWb);
		sel.selectByVisibleText(value);
	}
	
	public void select(WebElement selWb , int index){
		Select sel = new Select(selWb);
		sel.selectByIndex(index);
	}
	
	

}
