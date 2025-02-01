package com.student.web.pages.Search;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.student.web.pages.BasePage;

public class SearchPage extends BasePage{
	
	@FindBy(xpath = "//div[@class='day-picker-field']")
	WebElement drpMoveinDate;
	
	@FindBy(xpath="//select[@name='month']")
	WebElement drpMonth;
	
	@FindBy(xpath = "//select[@name='year']") 
	WebElement drpYear;
	
	@FindBy(xpath = "//div[contains(@class,'DayPicker-Day')]")
	List<WebElement> drpDate;
	
	@FindBy(xpath = "//div[@class='download-banner__close-content']")
	WebElement btnCross;

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnCrossIcon() throws InterruptedException{
		explicitWait(btnCross);
		btnCross.click();
	}
	
	public void clickOnMoveInDropdown() throws InterruptedException{
		explicitWait(drpMoveinDate);
		drpMoveinDate.click();
	}
	
	public void selectMonth(String strMonth) {
		Select selectMonth = new Select(drpMonth);
		selectMonth.selectByVisibleText(strMonth);
	}
	
	public void selectYear(String strYear) {
		Select selectYear = new Select(drpYear);
		selectYear.selectByVisibleText(strYear);
	}
	
	public void selectDate(String strDate) throws InterruptedException {
		for (WebElement date : drpDate) {			
		
			if(date.getText()==strDate){
				date.click();
				System.out.println("date selected");
			}
		}
	}
	
   public void setMoveInDate(String strMonth,String strYear,String strDate) throws InterruptedException {
	clickOnMoveInDropdown();
	selectMonth(strMonth);
	selectYear(strYear);
	selectDate(strDate);
   }

}
