package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AnzAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		
		WebElement applicationTypeSingle = driver.findElement(By.id("application_type_single"));
		WebElement noOfDep =driver.findElement(By.xpath("//select[@title='Number of dependants']"));
		WebElement propertyHome = driver.findElement(By.id("borrow_type_home"));
		WebElement annualIncome = driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']"));
		WebElement otherAnnualIncome = driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']"));
		WebElement monthlyLivingExp = driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']"));
		WebElement currentRepayment = driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']"));
		WebElement monthlyRepayments = driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']"));
		WebElement monthlyCommitments = driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']"));
		WebElement creditLimit = driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']"));
		WebElement borrowButton = driver.findElement(By.xpath("//button[@id='btnBorrowCalculater']"));
		WebElement calcualtedAmount = driver.findElement(By.xpath("//span[@id='borrowResultTextAmount']"));
		WebElement startOver = driver.findElement(By.xpath("//button[@class='start-over'][1]"));
		
		applicationTypeSingle.click();
		
		Select sel=new Select(noOfDep);
		sel.selectByIndex(0);
		
		Actions a =new Actions(driver);
		a.moveToElement(propertyHome).click().build().perform();
		
		annualIncome.sendKeys("80,000");
		otherAnnualIncome.sendKeys("10,000");
		monthlyLivingExp.sendKeys("500");
		currentRepayment.sendKeys("0");
		monthlyRepayments.sendKeys("100");
		monthlyCommitments.sendKeys("0");
		creditLimit.sendKeys("10,000");
		borrowButton.click();
		calcualtedAmount.getText();
		startOver.click();
		
		
		
		
		
		
		
		
		

	}

}
