package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BorrowingCalcPage {

    private final WebDriver driver;

    // 1.By Locators
    private final By applicationTypeSingle = By.id("application_type_single");
    private final By noOfDep = By.xpath("//select[@title='Number of dependants']");
    private final By propertyHome = By.id("borrow_type_home");
    private final By annualIncome = By.xpath("//input[@aria-labelledby='q2q1']");
    private final By otherAnnualIncome = By.xpath("//input[@aria-labelledby='q2q2']");
    private final By monthlyLivingExp = By.xpath("//input[@aria-labelledby='q3q1']");
    private final By currentRepayment = By.xpath("//input[@aria-labelledby='q3q2']");
    private final By monthlyRepayments = By.xpath("//input[@aria-labelledby='q3q3']");
    private final By monthlyCommitments = By.xpath("//input[@aria-labelledby='q3q4']");
    private final By creditLimit = By.xpath("//input[@aria-labelledby='q3q5']");
    private final By borrowButton = By.xpath("//button[@id='btnBorrowCalculater']");
    private final By calcualtedAmount = By.xpath("//span[@id='borrowResultTextAmount']");
    private final By startOver = By.xpath("//button[@class='start-over'][1]");

    // 2. Constructor of the page class
    public BorrowingCalcPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Page actions

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void selectApplicationType() {
        driver.findElement(applicationTypeSingle).click();
    }

    public void selectDepedent() {
        Select sel = new Select(driver.findElement(noOfDep));
        sel.selectByIndex(0);
    }

    public void selectProperty() {
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(propertyHome)).click().build().perform();
    }

    public void enterAnnualIncome(String annualInc) {
        driver.findElement(annualIncome).sendKeys(annualInc);
    }

    public void enterOtherAnnualIncome(String otherAnnualInc) {
        driver.findElement(otherAnnualIncome).sendKeys(otherAnnualInc);
    }

    public void enterLivingExpenses(String monthlyAnnualInc) {
        driver.findElement(monthlyLivingExp).sendKeys(monthlyAnnualInc);
    }

    public void enterCurrentRepayment(String currentRepay) {
        driver.findElement(currentRepayment).sendKeys(currentRepay);
    }

    public void enterMonthlyRepayments(String montlyRepay) {
        driver.findElement(monthlyRepayments).sendKeys(montlyRepay);
    }

    public void entermonthlyCommitments(String monthlyCommit) {
        driver.findElement(monthlyCommitments).sendKeys(monthlyCommit);
    }

    public void enterCreditLimit(String creditLim) {
        driver.findElement(creditLimit).sendKeys(creditLim);
    }

    public void clickBorrowButton() {
        driver.findElement(borrowButton).click();
    }

    public String calculatedAmount() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(calcualtedAmount).getText();
    }

    public void clickStartOverButton() {

        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(startOver)).click().build().perform();
    }


}
