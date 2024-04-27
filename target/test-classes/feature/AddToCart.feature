Feature: Add items to the shopping cart

  Background:
    Given User is logged into Swag Labs website

  Scenario: Add no items to the cart
    When User clicks on the shopping cart link
    Then the cart should display "0" item(s)

  Scenario: Add a single item to the cart
    When User adds the first item to the cart
    And User clicks on the shopping cart link
    Then the cart should display "1" item(s)

  Scenario: Add multiple items to the cart
    When User adds the first item to the cart
    And User adds the second item to the cart
    And User clicks on the shopping cart link
    Then the cart should display "2" item(s)