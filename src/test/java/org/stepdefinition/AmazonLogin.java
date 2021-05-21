package org.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.Base.BaseClass;
import org.Pojo.AmazonLoginPojo;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogin extends BaseClass{

	AmazonLoginPojo ap;
		
		@Given("user as to launch the browser and hit amz url")
		public void user_as_to_launch_the_browser_and_hit_amz_url() {

		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		}

		@When("user as to pass the valid email")
		public void user_as_to_pass_the_valid_email() {
			ap = new AmazonLoginPojo();
		    fillText(ap.getEmailfield(), "amz@gmail.com");
		}

		@When("user as to click the continue btn")
		public void user_as_to_click_the_continue_btn() {
		   btnClick(ap.getContinuefield());
		}

		@When("user as to pass the invalid passward")
		public void user_as_to_pass_the_invalid_passward() {
		 fillText(ap.getPasswardfield(), "3363663");
		}

		@When("user as to click the signin btn")
		public void user_as_to_click_the_signin_btn() {
		   btnClick(ap.getSignbtn());
		}

		@Then("user as to the browser")
		public void user_as_to_the_browser() throws IOException {
		   TakesScreenshot tk = (TakesScreenshot)driver;
		   File des = new File("C:\\Users\\hp\\eclipse-workspace\\CucuProject\\Screenshots\\amazon.png");
		   File sou = tk.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(sou, des);
		   }



	}

