package com.pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void j(String js) {
		Configuration c = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report"), "Adactin");
		
			c.addClassifications("Browser", "Chrome");
			c.addClassifications("sprint", "34");
			c.addClassifications("os", "window");
			
			List<String> l = new ArrayList<String>();
			l.add(js);
			
			ReportBuilder builder = new ReportBuilder(l,c);
			
			builder.generateReports();
				}
			
	
}
