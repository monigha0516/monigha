package com.stepDefinition;

import org.junit.Assert;

import com.BaseClass.BaseClass;
import com.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition extends BaseClass{
	
	PageObjectManager pg=new PageObjectManager(driver);
	
	@Given("User have to launch Browser")
	public void user_have_to_launch_browser() {
	  browserLaunch();
	      
	}
	@Given("User Have to navigate the url {string}")
	public void user_have_to_navigate_the_url(String string) {
		 getUrl(string);
	      
	}
	@Given("User have to validate Instagram land on page")
	public void user_have_to_validate_instagram_land_on_page() {
	  Assert.assertTrue(elementIsDisplayed(pg.getLoginPage().getLoginPage()));
	      
	}
	@Given("User have to enter valid Username or Mail  {string}")
	public void user_have_to_enter_valid_username_or_mail(String string) {
	  
	      elementSendkeys(pg.getLoginPage().getUseName(), string);
	}
	@Given("User have to enter valid Password  {string}")
	public void user_have_to_enter_valid_password(String string) {
	  
	      elementSendkeys(pg.getLoginPage().getPass(), string);
	}
	@Given("User have to click login Button")
	public void user_have_to_click_login_button() {
		elementClick(pg.getLoginPage().getLoginBtn());
	  
	      
	}
	@Then("User have to validate Login Succesfully")
	public void user_have_to_validate_login_succesfully() {
	  Assert.assertTrue(elementIsDisplayed(pg.getLoginPage().getLoginSucess()));
	      
	}




}
