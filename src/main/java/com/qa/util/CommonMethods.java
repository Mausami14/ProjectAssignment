package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public WebDriver driver;
	public WebElement e;
	
	public CommonMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selectOptionFromDropdown(int i,WebElement e )
	{
		Select sel=new Select(e);
		sel.selectByIndex(i);
	}
	public void commonMethAction(WebDriver driver,WebElement e)
	{
		Actions a = new Actions(driver);
		a.moveToElement(e).click().build().perform();
	}

}
