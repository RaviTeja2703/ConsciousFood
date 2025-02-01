package com.student.web.tests.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.student.web.pages.login.LoginPage;
import com.student.web.tests.BaseTest;

public class LoginTesting extends BaseTest{
	
	@BeforeClass
	@Parameters({"siteURL"})
	public void initnopCommerceWebSite(String siteURL) {
		getWebSite(siteURL);
	}
	
	@Test(priority = 1)
	public void verifyLoginWithInvalidEmailIdAndPassword() throws InterruptedException {
		loginPage.setEmailId("ravi");
		loginPage.setPassword("132424");
		loginPage.clickOnLoginButton();
	}
	
	@Test(priority = 2)
	public void verifyLoginWithValidCredentials() throws InterruptedException{
		nopCommerceLogin();
	}
}
