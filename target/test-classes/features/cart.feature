@Cart
Feature: Cart
  As a user
  I want to shoping
  So i can add and reduce my item to cart

  Scenario: Add item to cart
    Given I am on the dashboard page
    When I click buy button
    And I click cart button
    And I click add button
    Then I success add my item

  Scenario: Reduce item to cart
    Given I am on the dashboard page
    When I click buy button
    And I click cart button
    And I click reduce button
    Then I succes reduce my item
