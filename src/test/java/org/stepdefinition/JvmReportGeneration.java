package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGeneration {
	
public static void jvmReport(String json) {

	File f = new File("C:\\Users\\hp\\eclipse-workspace\\CucuProject\\jvmreport");
	
	Configuration c = new Configuration(f,"amazonpage");
	c.addClassifications("platform name", "windows");
	c.addClassifications("platform version", "10");
	
	List<String> l = new ArrayList<String>();
	l.add(json);
	
	ReportBuilder rb = new ReportBuilder(l,c);
	rb.generateReports();
}
}
