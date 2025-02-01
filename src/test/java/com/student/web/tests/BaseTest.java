package com.student.web.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.student.web.pages.Search.SearchPage;
import com.student.web.pages.login.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
      public LoginPage loginPage;
      public SearchPage searchPage;
      public WebDriver driver;
      
      
      public void getWebSite(String browser,String siteURL) {
    	  
    	  if(browser.equalsIgnoreCase("chrome"))
    	  {
  
    	  driver = new ChromeDriver();
    	  }
    	  else if(browser.equalsIgnoreCase("edge")) {
    		  driver=new EdgeDriver();
    	  }
    	  
    	  else {
    		  {
    			  throw new IllegalArgumentException("invalid browser name"+browser);
    		  }
		}
    	  driver.get(siteURL);
    	  driver.manage().window().maximize();
    	  loginPage = new LoginPage(driver);
      }
}
