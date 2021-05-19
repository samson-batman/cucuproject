package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
public static void browserLaunch() {
     WebDriverManager.chromedriver().setup();
     
     driver = new ChromeDriver();
}
	
	public  static void launchUrl(String url) {

		driver.get(url);
	}
	
	public static void max() {
driver.manage().window().maximize();
		
	}
	public static void fillText(WebElement element,String text) {
    element.sendKeys(text);
	}
	
	public void btnClick(WebElement element) {
element.click();
		
	}
	
	
	public void exist() {

		driver.close();
	}
	
	
}
