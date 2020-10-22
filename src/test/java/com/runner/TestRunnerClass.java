package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"com.stepdefinition" }, dryRun = false, monochrome = true,
    plugin = {"pretty"},strict=true,tags= {"@Func1"})
//plugin= {"pretty",
//		"html:src\\test\\resources\\Reporting",
//		"json:src\\test\\resources\\Reporting\\cucumber.json",
//		"junit:src\\test\\resources\\Reporting\\cucumber.xml"})
public class TestRunnerClass {

//	@AfterClass
//	public static void afterClass() {
//	 JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\cucumber.json");
//	}
}
