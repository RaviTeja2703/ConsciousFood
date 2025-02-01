package com.student.web.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.student.web.pages.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy(xpath = "//input[@id='Email']")
    WebElement txtEmail;
    
    @FindBy(xpath = "//input[@name='Password']")
    WebElement txtPassword;
    
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement btnLogin;
    
   
    public void setEmailId(String email) throws InterruptedException {
    	Thread.sleep(2000);
    	txtEmail.sendKeys(email);
    }
    
    public void setPassword(String password) throws InterruptedException {
    	Thread.sleep(2000);
    	txtPassword.sendKeys(password);
    }
    
    public void clickOnLoginButton() throws InterruptedException {
    	Thread.sleep(2000);
    	btnLogin.click();
    	Thread.sleep(1000);
    	txtEmail.clear();
    	txtPassword.clear();
    }
}
