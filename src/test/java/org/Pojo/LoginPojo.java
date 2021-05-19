package org.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.Base.BaseClass;


public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);

	}
 @FindAll({
	 @FindBy(xpath="//input[@type='text']"),
	 @FindBy(xpath="//input[@id='email']"),
	 @FindBy(xpath="//input[@name='email']")
 })
	private WebElement emailfield;

public WebElement getEmailfield() {
	return emailfield;
} 
	@FindBys({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']"),
		@FindBy(xpath="//input[@id='pass']")
	})
	private WebElement passfield;
	public WebElement getPassfield() {
		return passfield;
	}
	
	@FindAll({
		@FindBy(xpath="//button[@value='1']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement Loginbtn;

	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	
}
