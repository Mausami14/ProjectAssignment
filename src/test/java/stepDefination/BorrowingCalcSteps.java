package stepDefination;

import static com.qa.util.Constants.PAGE_TITLE;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestContextSetUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BorrowingCalcSteps {
	public TestContextSetUp testContextSetUp;

	public BorrowingCalcSteps(TestContextSetUp testContextSetUp) {
		this.testContextSetUp = testContextSetUp;
	}

	public String expectedAmount="$429,000";

	@Given("User is on the borrowing calculator page")
	public void user_is_on_the_borrowing_calculator_page() {
		assertEquals(testContextSetUp.pm.getBorrowingCalcPage().getPageTitle(), PAGE_TITLE);
		

	}

	@When("User enters Application type Single")
	public void user_enters_application_type_single() {
		testContextSetUp.pm.getBorrowingCalcPage().selectApplicationType();

	}

	@When("User selects Property you would like to buy as Home to live in")
	public void user_selects_property_you_would_like_to_buy_as_home_to_live_in() {
		testContextSetUp.pm.getBorrowingCalcPage().selectProperty();

	}

	@When("User selects Number of dependants")
	public void user_selects_number_of_dependants() {
		/*WebElement noOfDep = testContextSetUp.driver.findElement(By.xpath("//select[@title='Number of dependants']"));
		testContextSetUp.cm.selectOptionFromDropdown(0, noOfDep);*/
		testContextSetUp.pm.getBorrowingCalcPage().selectDepedent();
	}

	@When("User enters  annual income {string}")
	public void user_enters_annual_income(String annualIncome) {
		/*WebElement annualIncome = testContextSetUp.driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']"));
		annualIncome.sendKeys("80,000");*/
		testContextSetUp.pm.getBorrowingCalcPage().enterAnnualIncome(annualIncome);
	}

	@When("User enters other income {string}")
	public void user_enters_other_income(String otherAnnualIncome) {
		/*WebElement otherAnnualIncome = testContextSetUp.driver
				.findElement(By.xpath("//input[@aria-labelledby='q2q2']"));
		otherAnnualIncome.sendKeys("10,000");*/
		testContextSetUp.pm.getBorrowingCalcPage().enterOtherAnnualIncome(otherAnnualIncome);
	}

	@When("User enters living expenses {string}")
	public void user_enters_living_expenses(String livingExpenses) {
		/*WebElement monthlyLivingExp = testContextSetUp.driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']"));
		monthlyLivingExp.sendKeys(string);*/
		testContextSetUp.pm.getBorrowingCalcPage().enterLivingExpenses(livingExpenses);
	}

	@When("User enters monthly repayments {string}")
	public void user_enters_monthly_repayments(String currRepaymentAmount) {
		/*WebElement currentRepayment = testContextSetUp.driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']"));
		currentRepayment.sendKeys(string);*/
		testContextSetUp.pm.getBorrowingCalcPage().enterCurrentRepayment(currRepaymentAmount);
	}

	@When("User enters Other loan monthly repayments {string}")
	public void user_enters_other_loan_monthly_repayments(String monthlyRepayment) {
		/*WebElement monthlyRepayments = testContextSetUp.driver
				.findElement(By.xpath("//input[@aria-labelledby='q3q3']"));
		monthlyRepayments.sendKeys(string);*/
		testContextSetUp.pm.getBorrowingCalcPage().enterMonthlyRepayments(monthlyRepayment);
	}

	@When("User enters Other monthly commitments {string}")
	public void user_enters_other_monthly_commitments(String monthlyCommit) {
		/*WebElement monthlyCommitments = testContextSetUp.driver
				.findElement(By.xpath("//input[@aria-labelledby='q3q4']"));
		monthlyCommitments.sendKeys(string);*/
		testContextSetUp.pm.getBorrowingCalcPage().entermonthlyCommitments(monthlyCommit);
	}

	@When("User enters credit card limits {string}")
	public void user_enters_credit_card_limits(String credlim) {
	/*	WebElement creditLimit = testContextSetUp.driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']"));
		creditLimit.sendKeys(string);*/
		testContextSetUp.pm.getBorrowingCalcPage().enterCreditLimit(credlim);
	}

	@When("User clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		/*WebElement borrowButton = testContextSetUp.driver.findElement(By.xpath("//button[@id='btnBorrowCalculater']"));
		WebElement calcualtedAmount = testContextSetUp.driver
				.findElement(By.xpath("//span[@id='borrowResultTextAmount']"));
		borrowButton.click();
		String calcAmt = calcualtedAmount.getText();
		// Assert.assertEquals(calcAmt, "9,386");*/
		testContextSetUp.pm.getBorrowingCalcPage().clickBorrowButton();

	}

	@Then("User should see the borrowing estimate.")
	public void user_should_see_the_borrowing_estimate() throws InterruptedException {

		String actualAmountValue = testContextSetUp.pm.getBorrowingCalcPage().calculatedAmount();
		assertEquals(actualAmountValue, expectedAmount);
	}

	@Then("User clicks on startover button")
	public void user_clicks_on_startover_button() {
		testContextSetUp.pm.getBorrowingCalcPage().clickStartOverButton();
	}

	@Then("all the form fields should be reset to their default values")
	public void all_the_form_fields_should_be_reset_to_their_default_values() {
		System.out.println("clear");
	}

}
