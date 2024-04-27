Feature: LoggedIn User

  Background:
    Given User navigates to the Swag Labs website

  Scenario: Log into Swag Labs website as a valid user
    When User enters valid login credentials
    And User clicks on login button
    Then User should be logged in successfully

  Scenario: Log into Swag Labs website as a invalid user
    When User enters invalid login credentials
    And User clicks on login button
    Then User should be able to see error message