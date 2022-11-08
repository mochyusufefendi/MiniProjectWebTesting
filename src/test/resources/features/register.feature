@Register
Feature: Register
  As a user
  I want to register account
  So i can login with my account

  Scenario: Register with null nama, email and password
    Given I am on the login pagee
    When I click register buttonn
    And I input null namaa
    And I input null emaill
    And I input null passwordd
    And I click register iconn
    Then I will get error message nul

  Scenario: Register with valid nama, null email and null password
    Given I am on the login pagee
    When I click register buttonn
    And I input valid nama
    And I input null emaill
    And I input null passwordd
    And I click register iconn
    Then I will get error message nul

  Scenario: Register with valid nama, valid email, and null password
    Given I am on the login pagee
    When I click register buttonn
    And I input valid nama
    And I input valid emaill
    And I input null passwordd
    And I click register iconn
    Then I will get error message nul

  Scenario: Register with null nama, null email, and valid password
    Given I am on the login pagee
    When I click register buttonn
    And I input null namaa
    And I input null emaill
    And I input valid Password
    And I click register iconn
    Then I will get error message nul

    Scenario: Register with null nama, valid email, and null password
      Given I am on the login pagee
      When I click register buttonn
      And I input null namaa
      And I input valid emaill
      And I input null passwordd
      And I click register iconn
      Then I will get error message nul

    Scenario: Register with null nama, valid email, and valid password
      Given I am on the login pagee
      When I click register buttonn
      And I input null namaa
      And I input valid emaill
      And I input valid passwordd
      And I click register iconn
      Then I will get error message nul

    Scenario: Register with valid nama, null email, and valid password
      Given I am on the login pagee
      When I click register buttonn
      And I input valid nama
      And I input null email
      And I input valid passwordd
      And I click register iconn
      Then I will get error message nul

    Scenario: Register with valid nama, valid email, and valid password
      Given I am on the login pagee
      When I click register buttonn
      And I input valid nama
      And I input valid emaill
      And I input valid passwordd
      And I click register iconn
      Then I will get error message nul