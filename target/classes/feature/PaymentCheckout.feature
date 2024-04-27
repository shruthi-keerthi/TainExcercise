Feature: Payment Checkout Process

  Background: User is logged in and has items in their cart
    Given User is logged into Swag Labs website
    And User has added items to the shopping cart

  Scenario: Successfully complete a purchase
    When User proceeds to checkout
    And User enters payment information
    And User clicks on Continue button
    And User clicks on Finish button
    Then User should see a success message confirming the order completion

  Scenario: Fail to complete a purchase due to missing payment details
    When User proceeds to checkout
    And User clicks on Continue button
    Then User should see an error message indicating missing payment details