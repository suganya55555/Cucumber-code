package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	
	 public static void generateJVMReport(String jsonFile) {
		// File loc= new File("C:\\Users\\rahul\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Reporting");
		 File loc= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");
		 Configuration  configuration = new Configuration(loc,"Adaction Hotel Report");
		 configuration.addClassifications("sprint", "20");
		 configuration.addClassifications("Browser", "chrome");
		 configuration.addClassifications("Env", "UAT");
		 configuration.addClassifications("OS", "Win-10");
				 
		 List<String> jsonFiles= new ArrayList<String>();
		 jsonFiles.add(jsonFile); 
				 
		 ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		 builder.generateReports();


	}
}
