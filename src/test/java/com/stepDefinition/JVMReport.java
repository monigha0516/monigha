package com.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	
	public static void generateJvmReport(String jsonPath) {
		//1.Folder Location
		File f=new File(System.getProperty("user.dir")+"\\AllReports\\JVMReport");
		//2.Add Details
		Configuration c=new Configuration(f, "Instagram Application");
		//Options
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Sprint", "123");
		c.addClassifications("Jdk Version", "1.8");
		//3.Add Json File path into List<String>

		List<String> l=new ArrayList<String>();
		l.add(jsonPath);
		
		//4.Create object For ReportBuider
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
		
		
	}
	
}
