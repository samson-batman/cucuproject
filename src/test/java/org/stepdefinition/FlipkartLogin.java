package org.stepdefinition;

import org.Base.BaseClass;
import org.Pojo.FlipkartLoginPojo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartLogin extends BaseClass {

 public	FlipkartLoginPojo fl;
// public JavascriptExecutor js;
	@Given("user has to launch the browser and hit the flipkart url")
	public void user_has_to_launch_the_browser_and_hit_the_flipkart_url() throws InterruptedException {
		browserLaunch();
		launchUrl("https://www.flipkart.com/");
		
	   	}

	@When("user has to click the login btn")
	public void user_has_to_click_the_login_btn() throws InterruptedException {
		max();
		Thread.sleep(3000);
////		fl = new FlipkartLoginPojo();
////		btnClick(fl.getLoginbtn());
	}

	@When("user has to pass the invalid email")
	public void user_has_to_pass_the_invalid_email() {
		fl = new FlipkartLoginPojo();
		fillText(fl.getUsername(), "samson@gmail.com");
//		js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].setAttribute('value','samson')", us);

	}

	@When("user has to pass the inalid passward")
	public void user_has_to_pass_the_inalid_passward() {
		fillText(fl.getPassward(), "354316");
//		 js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].setAttribute('value','123456')", fl.getPassward());
//		
	}

	@When("user has to click the loginokbtn")
	public void user_has_to_click_the_loginokbtn() {
		btnClick(fl.getSignbtn());
//		 js = (JavascriptExecutor)driver;
//		 js.executeScript("arugments[0].click()",fl.getSignbtn());
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	  exit();
	}



	
	
}
