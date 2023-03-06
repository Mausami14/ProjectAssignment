Feature: Borrowing Calculator

  Scenario: Verify Borrowing Estimate for a Single Person
    Given User is on the borrowing calculator page
    When User enters Application type Single
    And User selects Property you would like to buy as Home to live in
    And User selects Number of dependants
    And User selects Property you would like to buy as Home to live in
    And User enters  annual income "80000"
    And User enters other income "10,000,"
    And User enters living expenses "500"
    And User enters monthly repayments "0"
    And User enters Other loan monthly repayments "0"
    And User enters Other monthly commitments "100"
    And User enters credit card limits "10000"
    And User clicks on the borrow button
    Then User should see the borrowing estimate.

 
  Scenario: Verify Form Reset Functionality
    Given User is on the borrowing calculator page
    When User enters Application type Single
    And User selects Property you would like to buy as Home to live in
    And User selects Number of dependants
    And User selects Property you would like to buy as Home to live in
    And User enters  annual income "80000"
    And User enters other income "10,000,"
    And User enters living expenses "500"
    And User enters monthly repayments "0"
    And User enters Other loan monthly repayments "0"
    And User enters Other monthly commitments "100"
    And User enters credit card limits "10000"
    And User clicks on the borrow button
    And User should see the borrowing estimate.
    Then User clicks on startover button
    And all the form fields should be reset to their default values