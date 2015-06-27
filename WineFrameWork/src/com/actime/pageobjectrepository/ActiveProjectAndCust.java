package com.actime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCust {
	
	@FindBy(xpath="//div[@id='ext-comp-1002']")
	//@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement creatNewCustomer;
		
	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement creatNewProject;
	
	@FindBy(xpath="//input[contains(@value,'Show')]")
	private WebElement showBtn;
	
	@FindBy(name="selectedCustomer")
	private WebElement custShowLst;

	public WebElement getCreatNewCustomer() {
		return creatNewCustomer;
	}

	public WebElement getCreatNewProject() {
		return creatNewProject;
	}

	public WebElement getShowBtn() {
		return showBtn;
	}

	public WebElement getCustShowLst() {
		return custShowLst;
	}
	
	
	
	
	
	
	
	

}
