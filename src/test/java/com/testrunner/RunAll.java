package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepDefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\features",glue = {"com.stepDefinition","com.hooks"},
dryRun = false,stepNotifications = true, plugin = {"html:AllReports\\Htmlreport\\instagram.html","json:AllReports\\JsonReport\\instagramjson.json","junit:AllReports\\JunitReport\\instagram.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},publish = true)
public class RunAll {
	@AfterClass
	public static void report() {
		 JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\AllReports\\JsonReport\\instagramjson.json");

		
	}
	

}
