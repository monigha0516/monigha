package com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class Login_Locators extends BaseClass {
	
	   public Login_Locators(WebDriver xdriver) {
		   this.driver=xdriver;
		   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='© 2023 Instagram from Meta']")
	private WebElement loginPage;
	
	public WebElement getLoginPage() {
		return loginPage;
	}

	public WebElement getUseName() {
		return useName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	@FindBy(name = "username")
	private WebElement useName;
	
	@FindBy(name = "password")
	private WebElement pass;
	
	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement loginBtn;
	
	@FindBy(css = "[aria-label='Instagram']")
	private WebElement loginSucess;

	public WebElement getLoginSucess() {
		return loginSucess;
	}

}
