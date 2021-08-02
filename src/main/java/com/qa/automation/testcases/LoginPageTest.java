package com.qa.automation.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.automation.config.TestBase;
import com.qa.automation.pages.HomePage;
import com.qa.automation.pages.LoginPage;
import com.qa.automation.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	
	/*
	 * @Test public void loginTest() { loginPage.login(prop.getProperty("username"),
	 * prop.getProperty("password")); }
	 */
	 
	
	@DataProvider
	public Object[][] getApplicationTestData(){
		Object data[][] = TestUtil.getTestData(prop.getProperty("sheetName"));
		return data;
	}
	
	
	@Test(dataProvider="getApplicationTestData")
	public void loginTest(String userName, String password){
		//loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.login(userName, password);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
