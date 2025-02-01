package com.student.web.tests.Search;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.student.web.pages.Search.SearchPage;
import com.student.web.tests.BaseTest;

public class SearchTest extends BaseTest{
	public SearchPage searchPage;
	   
	   @BeforeClass
	   @Parameters({"browser","siteURL"})
	   public void initAmazonWebsite(String browser,String siteURL) throws InterruptedException {
		   getWebSite(browser,siteURL);
		   searchPage = new SearchPage(driver);   
	   }
	   
	   @Test(priority = 1)
	   public void verifySearchFunctionality() throws InterruptedException{
		   System.out.println("click on cross");
		   //searchPage.clickOnCrossIcon();
		   System.out.println("click on cross cmpltd");
		   searchPage.setMoveInDate("Mar", "2024","27");
	   }
}
