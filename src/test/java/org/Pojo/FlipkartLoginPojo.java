package org.Pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPojo extends BaseClass {

	public FlipkartLoginPojo() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//a[@class='_1_3w1N']")
		private WebElement loginbtn;
		
		@FindBy(xpath="//input[@type='text']")
		private WebElement username;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement passward;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement signbtn;

		public WebElement getLoginbtn() {
			return loginbtn;
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassward() {
			return passward;
		}

		public WebElement getSignbtn() {
			return signbtn;
		}
		
		
		
		
}
