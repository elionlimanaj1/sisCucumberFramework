@smoke
Feature: Login

  @salim
  Scenario: Valid login
    When I enter valid username and password
    And I click on login button
    Then I see main page header is displayed

  @regression
  Scenario: Negative login
    When I enter valid username and no password
    And I click on login button
    Then I see the alert

  @regression
  Scenario: Login with parameters
    When I enter username "johnsmith" and password "salim123"
    And I click on login button
    Then I see main page header is displayed

  @bulent
  Scenario Outline: Login multiple time with parameters
    When I enter username "<Username>" and password "<Password>"
    And I click on login button
    Then I see main page header is displayed

    Examples: 
      | Username  | Password  |
      | johnsmith | salim123  |
      | adamsmith | bulent123 |
