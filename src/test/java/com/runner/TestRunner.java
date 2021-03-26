package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.pages.JVMReport;
import com.reusable.Utility;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features",glue = "com.stepDef",dryRun=false,tags="@reg,@smoke",
plugin="json:src\\test\\resources\\Report.json")
public class TestRunner {

	@AfterClass
	public static void report() {
  JVMReport.j(System.getProperty("user.dir")+"\\src\\test\\resources\\Report.json");
		
	}
}
