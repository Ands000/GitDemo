
Feature: Application login

  @RegressionTest
  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into the application with "Test" and password "123"
    Then Homepage is polpulated
    And Title is displayed "True"
    
    @MobileTest
    Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into the application with "TT" and password "234"
    Then Homepage is polpulated
    And Title is displayed "False"
    @SmokeTest
    Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into the application with "TT" and password "234"
    Then Homepage is polpulated
    And User have to signup with following details
    | Test | 1234 | Test@gmail.com | 2345666322 |
    
     @RegressionTest
    Scenario Outline: Homepage default login
    Given User is on Netbanking landing page
    When User login in to the application with <Username> and password <Password>
    Then Homepage is polpulated
    
    Examples:
    |Username |Password  |
    |User1    |1238      |
    |User2    |1236      |
    |User3    |1235      |
    |User3    |1234      |
    