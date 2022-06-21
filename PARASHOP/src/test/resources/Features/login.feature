Feature: feature to test the login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on the login page of the site
    When user enters <email> and <password>
    And user clicks on submit
    Then user is navigated to the home page

    Examples: 
      | email                | password   |
      | ghada.tayeg@talan.com | azertyuiop |
