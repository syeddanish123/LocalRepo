
Feature: Test login functionality.
  @Smoke
  Scenario: Successfull login into application and logout
    Given user on login page
    When successfull login to application
    When logout from application
    Then closed application

  @Regression
  Scenario: Successfull login into application and logout
    Given user on login page
    When successfull login to application
    And  further
    When logout from application
    Then closed application

  @Important
  Scenario: Successfull login into application and logout
    Given user on login page
    When successfull login to application
    When logout from application
    Then closed application
