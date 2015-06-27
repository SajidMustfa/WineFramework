package com.actime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeTrack {
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reportImg;

	public WebElement getTaskImg() {
		return taskImg;
	}

	public WebElement getReportImg() {
		return reportImg;
	}
	


}
