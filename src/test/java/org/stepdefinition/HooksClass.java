package org.stepdefinition;

import org.Base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void beforeExecution() {
             browserLaunch();
             max();
	}
	
	@After
	public void afterexection() {
         exit();
	}
	
	
	
	
	
	
	
	
}
