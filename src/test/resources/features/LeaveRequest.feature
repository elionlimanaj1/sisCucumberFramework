@smoke
Feature: LeaveRequest

  Background: 
    Given I have logged in
    And I click on leave request page

  Scenario: Sick Day Request
    When I select sick day
    And I select start and end dates
    And I click on no substitute
    And I accept policy check box
    And I click on Submit
    Then I see that sick days are added successfully

  Scenario: Sick Day Request Without Accepting
    When I select sick day
    And I select start and end dates
    And I click on no substitute
    #	And I accept policy check box
    Then I see that Submit button is not enabled
