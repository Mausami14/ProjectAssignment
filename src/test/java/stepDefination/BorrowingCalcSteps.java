package stepDefination;

import com.qa.util.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.qa.util.Constants.PAGE_TITLE;
import static org.junit.Assert.assertEquals;

public class BorrowingCalcSteps {
	public TestContextSetUp testContextSetUp;

	public BorrowingCalcSteps(TestContextSetUp testContextSetUp) {
		this.testContextSetUp = testContextSetUp;
	}

	public String expectedAmount = "$429,000";
	public String expectedResetAmount = "$0";

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
		testContextSetUp.pm.getBorrowingCalcPage().selectDepedent();
	}

	@When("User enters  annual income {string}")
	public void user_enters_annual_income(String annualIncome) {
		testContextSetUp.pm.getBorrowingCalcPage().enterAnnualIncome(annualIncome);
	}

	@When("User enters other income {string}")
	public void user_enters_other_income(String otherAnnualIncome) {
		testContextSetUp.pm.getBorrowingCalcPage().enterOtherAnnualIncome(otherAnnualIncome);
	}

	@When("User enters living expenses {string}")
	public void user_enters_living_expenses(String livingExpenses) {
		testContextSetUp.pm.getBorrowingCalcPage().enterLivingExpenses(livingExpenses);
	}

	@When("User enters monthly repayments {string}")
	public void user_enters_monthly_repayments(String currRepaymentAmount) {
		testContextSetUp.pm.getBorrowingCalcPage().enterCurrentRepayment(currRepaymentAmount);
	}

	@When("User enters Other loan monthly repayments {string}")
	public void user_enters_other_loan_monthly_repayments(String monthlyRepayment) {
		testContextSetUp.pm.getBorrowingCalcPage().enterMonthlyRepayments(monthlyRepayment);
	}

	@When("User enters Other monthly commitments {string}")
	public void user_enters_other_monthly_commitments(String monthlyCommit) {
		testContextSetUp.pm.getBorrowingCalcPage().entermonthlyCommitments(monthlyCommit);
	}

	@When("User enters credit card limits {string}")
	public void user_enters_credit_card_limits(String credlim) {
		testContextSetUp.pm.getBorrowingCalcPage().enterCreditLimit(credlim);
	}


	@When("User clicks on the borrow button")
	public void user_clicks_on_the_button() {
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
	public void all_the_form_fields_should_be_reset_to_their_default_values() throws InterruptedException {
		String actualResetAmountValue = testContextSetUp.pm.getBorrowingCalcPage().calculatedAmount();
		assertEquals(actualResetAmountValue, expectedResetAmount);
	}

}
