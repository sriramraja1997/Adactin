package com.stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.reusable.Utility;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utility {
@Before
public void beforescenario() {
	
}

@After
public void afterscenrio(Scenario scenario) {
	TakesScreenshot t = (TakesScreenshot) driver;
    byte[] screenshotAs = t.getScreenshotAs(OutputType.BYTES);
    scenario.embed(screenshotAs, "Pass Image");
    driver.quit();
    
}

	
}
