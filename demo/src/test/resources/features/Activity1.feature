@activity1
Feature: Basic Syntax
  Scenario: Opening a webpage using Selenium
    Given user is on the TS homepage
    When the user clicks on the About Us link
    Then they are redirected to another page