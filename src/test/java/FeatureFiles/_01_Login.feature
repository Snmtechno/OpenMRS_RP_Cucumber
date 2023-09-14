

Feature: Patient Registration Process

  Scenario: Successful patient registration and subsequent data verification
    Given User is on the Login page
    When User successfully logs in
    And User clicks on a random Location button
    And User clicks on the "Register a patient" button
    And User enters the data provided by Customer Data
    And User clicks on the Confirm button
    Then User sees the name and ID of the registered patient on the patient's page

