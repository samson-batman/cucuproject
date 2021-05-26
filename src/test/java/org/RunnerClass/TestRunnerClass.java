package org.RunnerClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReportGeneration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",dryRun=false,strict=false,monochrome=false,tags= "@Smoke",plugin= {"html:target","junit:junitreport\\junitrepo.xml","json:jsonreport\\jsonrepo.json"})
public class TestRunnerClass {

	@AfterClass
	public static void generateReport() {
		JvmReportGeneration.jvmReport("C:\\Users\\hp\\eclipse-workspace\\CucuProject\\jsonreport\\jsonrepo.json");
		}
	
}
