package org.stepdefinition;

import org.Base.BaseClass;
import org.Pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveAndNegative extends BaseClass {

	 LoginPojo l;
	
	@Given("User has to launch the browser and hit the url")
	public void user_has_to_launch_the_browser_and_hit_the_url() {
	   browserLaunch();
	   launchUrl("https://www.facebook.com/");
	   max();
	}

	@When("user has to enter the{string} username")
	public void user_has_to_enter_the_username(String string) {
	    l = new LoginPojo();
	   fillText(l.getEmailfield(), string);
	}

	@When("user has to enter the {string}password")
	public void user_has_to_enter_the_password(String string) {
	   fillText(l.getPassfield(), string);
	}

	@When("user has to click the btn")
	public void user_has_to_click_the_btn() {
	   btnClick(l.getLoginbtn());
	}

	@Then("user has to cloase the program")
	public void user_has_to_cloase_the_program() {
	  driver.close();
	}


	
}
