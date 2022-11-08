Feature: Logout
  As a user
  I want to logout
  So i can't open my account

  Scenario: Logout with no account
    Given I am on the dashboard
    When I click logout button
    Then I see the login page

  Scenario: Logout with logged in account
    Given I am on the login Page
    When I input valid Email
    And I input valid Password
    And I click login Button
    And I click account button
    And I click logout Buttonn
    Then I see the login page