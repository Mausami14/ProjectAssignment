package com.qa.util;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;

public class TestContextSetUp {
	
	public WebDriver driver;
	public PageObjManager pm;
	public TestBase testbase;
	

	public TestContextSetUp() {
		testbase=new TestBase();
		try {
			driver = testbase.WebDriverManager();
			pm=new PageObjManager(driver);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
