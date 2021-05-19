package org.Pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPojo extends BaseClass {

	public AmazonLoginPojo() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(id="ap_email")
	private WebElement emailfield ;
	
	
	@FindBy(id="continue")
	private WebElement continuefield;
	
	@FindBy(id="ap_password")
	private WebElement passwardfield;
	
	@FindBy(id="signInSubmit")
	private WebElement signbtn;

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getContinuefield() {
		return continuefield;
	}

	public WebElement getPasswardfield() {
		return passwardfield;
	}

	public WebElement getSignbtn() {
		return signbtn;
	}
	
}
