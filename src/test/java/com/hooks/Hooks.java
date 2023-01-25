package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	@Before
	public static void bef() {
		System.out.println("I am Before Hooks");

	}
	@After
	public static void aft(Scenario scenario) throws InterruptedException {
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "InstaSnap");
		driver.quit();
		

	}
	
	

}
