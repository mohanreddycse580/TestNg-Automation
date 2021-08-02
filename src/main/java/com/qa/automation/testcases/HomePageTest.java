package com.qa.automation.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.automation.config.TestBase;
import com.qa.automation.pages.HomePage;
import com.qa.automation.pages.LoginPage;
import com.qa.automation.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}


	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void checkButton() {
		homePage.checkButton();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
