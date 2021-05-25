package org.stepdefinition;

import org.Base.BaseClass;
import org.Pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginFacebook extends BaseClass {

	LoginPojo l1;
	
@Given("User as to launch the browser and hit the URL")
public void user_as_to_launch_the_browser_and_hit_the_URL() {
   browserLaunch();
   launchUrl("https://www.facebook.com/");
   max();
}

@When("User has to enter the username")
public void user_has_to_enter_the_username() {
		l1 = new  LoginPojo();

	fillText(l1.getEmailfield(),"sam");
}

@When("User has the enter the password")
public void user_has_the_enter_the_password() {
   fillText(l1.getPassfield(),"123456");
}

@When("User has to click the Login btn")
public void user_has_to_click_the_Login_btn() {
	btnClick(l1.getLoginbtn());
}

@Then("User has to close the browser")
public void user_has_to_close_the_browser() {
    driver.close();
}


	
}
