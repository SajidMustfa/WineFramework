package com.actime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	
	@FindBy(id="logoutLink")
	private WebElement logOutLnk;

	public WebElement getLogOutLnk() {
		return logOutLnk;
	}


}
