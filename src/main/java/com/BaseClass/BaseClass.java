package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch() {
		try {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println("Unable to Launch the Browser: " + e.getMessage());
		}

	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (Exception e) {
			System.out.println("Unable to GetUrl: " + e.getMessage());
		}

	}

	public static void elementSendkeys(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Unable to Pass Values: " + e.getMessage());
		}
	}

	public static void elementClick(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Unable to Click : " + e.getMessage());
		}
	}

	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			
			System.out.println("Unable to Display: " + e.getMessage());
		}
		return displayed;
	}
}
