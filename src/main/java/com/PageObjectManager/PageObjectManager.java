package com.PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;
import com.Locators.Login_Locators;

public class PageObjectManager extends BaseClass {
	
	
	public PageObjectManager(WebDriver xdriver) {
		this.driver=xdriver;
	}

	private  Login_Locators LoginPage;

	public Login_Locators getLoginPage() {
		
		if(LoginPage==null) {
			LoginPage=new Login_Locators(driver);
		}
		return LoginPage;
	}

}
