Feature: parameterisationindemo

  Background: to launch and login
    Given the user launches the app

  Scenario Outline: login
    Given the user clicks on login
    Then the data "<email>" and "<password>" is provided by the user
    And the submit button is clicked
    Then the app is closed

    Examples: 
      | email                | password  |
      | ttraju2000@gmail.com | numbernot |
      | poojaravi@gmail.com  | pooja123  |
