Feature: feature to test the login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on the login page of the site
    When user enters E-mail and password
    And user clicks on submit
    Then user is navigated to the home page
