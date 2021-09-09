
Feature: Application login

   @RegressionTest
  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into the application with "Test" and password "123"
    Then Homepage is polpulated
    And Title is displayed "True"