package com.qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automation.config.TestBase;


public class HomePage extends TestBase {

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement genericbutton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void checkButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		genericbutton.click();
	}

}
