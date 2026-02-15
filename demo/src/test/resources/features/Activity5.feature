@activity5
Feature: Data driven test with Examples

  Scenario Outline: Testing with Data from Scenario
    Given the user is on the login page
    When the user enters "<Usernames>" and "<Passwords>"
    And clicks the submit button
    Then get the confirmation text and verify message as "Invalid credentials"

    Examples: 
      | Usernames | Passwords      |
      | admin     | password123    |
      | admin     | wrongPassword  |