@Login
Feature: Login
  As a user
  I want to login
  So i can access my dashboard

  Scenario: Login with null email and password
    Given I am on the login page
    When I input null email
    And I input null password
    And I click login button
    Then I will get error message

  Scenario: Login with valid email and password
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click login button
    Then I success login

  Scenario: Login with invalid email and password
    Given I am on the login page
    When I input invalid email
    And I input invalid password
    And I click login button
    Then I will get record not found message

  Scenario: Login with valid email and invalid password
    Given I am on the login page
    When I input valid email
    And I input invalid password
    And I click login button
    Then I will get error message is invalid

  Scenario: Login with invalid email and valid password
    Given I am on the login page
    When I input invalid email
    And I input valid password
    And I click login button
    Then I will get record not found message

  Scenario: Login with valid email and null password
    Given I am on the login page
    When I input valid email
    And I input null password
    And I click login button
    Then I will get error message password is required

  Scenario: Login with null email and valid password
    Given I am on the login page
    When I input null email
    And I input valid password
    And I click login button
    Then I will get error message email is required

  Scenario: Login with invalid email and null password
    Given I am on the login page
    When I input invalid email
    And I input null password
    And I click login button
    Then I will get error message password is required

    Scenario: Login with null email and invalid password
      Given I am on the login page
      When I input null email
      And I input invalid password
      And I click login button
      Then I will get error message email is required
