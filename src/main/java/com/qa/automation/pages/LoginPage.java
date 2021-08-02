package com.qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automation.config.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="user-name")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login-button")
	WebElement loginBtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	
}
