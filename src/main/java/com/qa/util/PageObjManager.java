package com.qa.util;

import org.openqa.selenium.WebDriver;

import com.pages.BorrowingCalcPage;

public class PageObjManager {
	
	public WebDriver driver;
	public BorrowingCalcPage borrowingCalcPage;
	
	public PageObjManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public BorrowingCalcPage getBorrowingCalcPage() {
		 borrowingCalcPage= new BorrowingCalcPage(driver);
		 return borrowingCalcPage;
	}
	

}
